/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.btt.repository;

import com.btt.pojo.Station;
import java.util.List;

/**
 *
 * @author bthta
 */
public interface StationRepository {
     List<Station> findAllStation();
     
}
