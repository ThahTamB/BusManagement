/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btt.services.Impl;

import com.btt.pojo.Districts;
import com.btt.pojo.Provinces;
import com.btt.repository.LocationRepository;
import com.btt.services.LocationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author bthta
 */
@Service
public class LocationServiceImpl implements LocationService{
    @Autowired
    private LocationRepository repo;
    
    @Override
    public List<Provinces> findAllProvinces(){
        return this.repo.findAllProvinces();
    }
    @Override
    public List<Districts> findDistricByProvinces(String code){
    return this.repo.findDistricByProvinces(code);
    }
}
