package com.hami.organizationservice.service;

import com.hami.organizationservice.dto.OrganizationDto;
import com.hami.organizationservice.entity.Organization;

public interface OrganizationService {
    OrganizationDto saveOrganization(OrganizationDto organizationDto);
    OrganizationDto getOrganizationCode(String organizationCode);
}
