package com.example.demo.controller;


import com.example.demo.entity.Futsal;
import com.example.demo.pojo.FutsalPojo;
import com.example.demo.pojo.GlobalApiResponse;
import com.example.demo.service.FutsalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("futsal")
@RequiredArgsConstructor
public class FutsalController {

    @GetMapping("/list")
    public GlobalApiResponse<List<Futsal>> findAll(){
        GlobalApiResponse<List<Futsal>> globalApiResponse = new GlobalApiResponse<List<Futsal>>;
        globalApiResponse.setStatus(200);
        globalApiResponse.setData(futsalService.findAll());
        globalApiResponse.getMessage("Data retrieved successfully");
        return globalApiResponse;
    }

    private final FutsalService futsalService;


    @PostMapping("/save")
    public void saveData(@RequestBody FutsalPojo futsalPojo){
        GlobalApiResponse<String>   globalApiResponse =new GlobalApiResponse<String>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setData(futsalService.findAll());
        globalApiResponse.getMessage("data saved successfully ")
        this.futsalService.saveData(futsalPojo);
        return globalApiResponse;

    }
    @PutMapping("/update")
    public void saveData(@RequestBody FutsalPojo futsalPojo) {
        this.futsalService.saveData(futsalPojo);
    }

    @DeleteMapping("/delete/{id}")
    public GlobalApiResponse<Integer> deleteData(@PathVariable Integer id){
        GlobalApiResponse<Integer> globalApiResponse = new GlobalApiResponse<>();
        globalApiResponse.setStatus(200);
        globalApiResponse.setData(id);
        globalApiResponse.setMessage("Data deleted successfully");
        this.futsalService.deleteById(id);
        return globalApiResponse;
    }
    @GetMapping("/getById/{id}")
    public Optional<Futsal> findById(@PathVariable Integer id){
        return this.futsalService.findById(id);
    }

}
