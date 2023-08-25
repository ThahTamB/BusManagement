/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.btt.repository;

import com.btt.pojo.Districts;
import com.btt.pojo.Provinces;
import java.util.List;

/**
 *
 * @author bthta
 */
public interface LocationRepository {
    List<Provinces> findAllProvinces();
    List<Districts> findDistricByProvinces(String code);
}
