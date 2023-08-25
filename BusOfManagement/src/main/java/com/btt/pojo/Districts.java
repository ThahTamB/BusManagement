/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btt.pojo;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author bthta
 */
@Entity
@Table(name = "districts")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Districts.findAll", query = "SELECT d FROM Districts d"),
    @NamedQuery(name = "Districts.findByCode", query = "SELECT d FROM Districts d WHERE d.code = :code"),
    @NamedQuery(name = "Districts.findByName", query = "SELECT d FROM Districts d WHERE d.name = :name"),
    @NamedQuery(name = "Districts.findByNameEn", query = "SELECT d FROM Districts d WHERE d.nameEn = :nameEn"),
    @NamedQuery(name = "Districts.findByFullName", query = "SELECT d FROM Districts d WHERE d.fullName = :fullName"),
    @NamedQuery(name = "Districts.findByFullNameEn", query = "SELECT d FROM Districts d WHERE d.fullNameEn = :fullNameEn"),
    @NamedQuery(name = "Districts.findByCodeName", query = "SELECT d FROM Districts d WHERE d.codeName = :codeName")})
public class Districts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "code")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name")
    private String name;
    @Size(max = 255)
    @Column(name = "name_en")
    private String nameEn;
    @Size(max = 255)
    @Column(name = "full_name")
    private String fullName;
    @Size(max = 255)
    @Column(name = "full_name_en")
    private String fullNameEn;
    @Size(max = 255)
    @Column(name = "code_name")
    private String codeName;
    @OneToMany(mappedBy = "departureId")
    private Set<Route> routeSet;
    @OneToMany(mappedBy = "destinationId")
    private Set<Route> routeSet1;
    @JoinColumn(name = "province_code", referencedColumnName = "code")
    @ManyToOne
    private Provinces provinceCode;
    @OneToMany(mappedBy = "districtsCode")
    private Set<Station> stationSet;
    @OneToMany(mappedBy = "districtsCode")
    private Set<Company> companySet;

    public Districts() {
    }

    public Districts(String code) {
        this.code = code;
    }

    public Districts(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullNameEn() {
        return fullNameEn;
    }

    public void setFullNameEn(String fullNameEn) {
        this.fullNameEn = fullNameEn;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    @XmlTransient
    public Set<Route> getRouteSet() {
        return routeSet;
    }

    public void setRouteSet(Set<Route> routeSet) {
        this.routeSet = routeSet;
    }

    @XmlTransient
    public Set<Route> getRouteSet1() {
        return routeSet1;
    }

    public void setRouteSet1(Set<Route> routeSet1) {
        this.routeSet1 = routeSet1;
    }

    public Provinces getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(Provinces provinceCode) {
        this.provinceCode = provinceCode;
    }

    @XmlTransient
    public Set<Station> getStationSet() {
        return stationSet;
    }

    public void setStationSet(Set<Station> stationSet) {
        this.stationSet = stationSet;
    }

    @XmlTransient
    public Set<Company> getCompanySet() {
        return companySet;
    }

    public void setCompanySet(Set<Company> companySet) {
        this.companySet = companySet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Districts)) {
            return false;
        }
        Districts other = (Districts) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.btt.pojo.Districts[ code=" + code + " ]";
    }
    
}
