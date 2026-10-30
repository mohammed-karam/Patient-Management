package com.pm.patientservice.mapper;

import com.pm.patientservice.dto.PatientRequestDTO;
import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.model.Patient;

import java.time.LocalDate;

public class PatientMapper {
    public static PatientResponseDTO toDTO(Patient p) {
        PatientResponseDTO patientDTO = new PatientResponseDTO();
        patientDTO.setId(p.getId().toString());
        patientDTO.setName(p.getName());
        patientDTO.setEmail(p.getEmail());
        patientDTO.setAddress(p.getAddress());
        patientDTO.setDateOfBirth(p.getDateOfBirth().toString());

        return patientDTO;
    }

    public static Patient toModel(PatientRequestDTO patientRequestDTO) {
        Patient p = new Patient();
        p.setName(patientRequestDTO.getName());
        p.setAddress(patientRequestDTO.getAddress());
        p.setEmail(patientRequestDTO.getEmail());
        p.setDateOfBirth(LocalDate.parse(patientRequestDTO.getDateOfBirth()));
        p.setRegisterDate(LocalDate.parse(patientRequestDTO.getRegisterDate()));

        return p;
    }

}
