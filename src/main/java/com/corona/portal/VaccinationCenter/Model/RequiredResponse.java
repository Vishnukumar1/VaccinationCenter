package com.corona.portal.VaccinationCenter.Model;

import com.corona.portal.VaccinationCenter.Entity.VaccinationCenter;
import lombok.Data;

import java.util.List;

@Data
public class RequiredResponse
{
    private VaccinationCenter center;
    private List<CitizenEntity> citizens;
}
