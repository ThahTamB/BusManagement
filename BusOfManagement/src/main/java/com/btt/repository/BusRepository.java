/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.btt.repository;

import com.btt.pojo.Bus;
import java.util.List;
import java.util.Map;

/**
 *
 * @author bthta
 */
public interface BusRepository {
    List<Bus> getBus(Map<String, String> params);
    int countBus();
    boolean addOrUpdateBus(Bus b);
    Bus getBusById(int id);
    boolean deleteBus(int id);
}
