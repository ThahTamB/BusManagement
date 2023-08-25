/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.btt.repository;

import com.btt.pojo.Company;
import java.util.List;

/**
 *
 * @author bthta
 */
public interface CompanyRepository {
    List<Company> findAllCompany();
    Boolean addOrUpdateCompany(Company company); 
    Boolean deleteCompany(Company company);
}
