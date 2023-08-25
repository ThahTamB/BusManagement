/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btt.services;

import com.btt.pojo.Districts;
import com.btt.pojo.Provinces;
import java.util.List;

/**
 *
 * @author bthta
 */
public interface LocationService {
    List<Provinces> findAllProvinces();
    List<Districts> findDistricByProvinces(String code);
}
