package com.hami.organizationservice.mapper;

import com.hami.organizationservice.dto.OrganizationDto;
import com.hami.organizationservice.entity.Organization;

public class OrganizationMapper {
    public static OrganizationDto organizationDto(Organization organization) {

        return new OrganizationDto(
                organization.getId(),
                organization.getOrganizationName(),
                organization.getOrganizationDescription(),
                organization.getOrganizationCode(),
                organization.getCreateDate()
        );
    }

    public static Organization organization(OrganizationDto organizationDto) {

        return new Organization(
                organizationDto.getId(),
                organizationDto.getOrganizationName(),
                organizationDto.getOrganizationDescription(),
                organizationDto.getOrganizationCode(),
                organizationDto.getCreateDate()
        );
    }
}
