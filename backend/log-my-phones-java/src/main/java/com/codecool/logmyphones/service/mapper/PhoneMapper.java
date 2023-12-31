package com.codecool.logmyphones.service.mapper;

import com.codecool.logmyphones.model.DTO.PhoneDTO;
import com.codecool.logmyphones.model.Phone;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Set;

@Mapper(componentModel = "spring")
public interface PhoneMapper {

    @Mapping(source = "phoneNumber", target = "phoneNumber")
    PhoneDTO toPhoneDTO(Phone phone);
    Set<PhoneDTO> toPhoneDTOs(Set<Phone> phone);
    Phone toPhone(PhoneDTO phoneDTO);
    Set<Phone> toPhones(Set<PhoneDTO> phoneDTO);
}
