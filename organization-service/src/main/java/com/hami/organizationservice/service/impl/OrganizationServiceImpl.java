package com.hami.organizationservice.service.impl;

import com.hami.organizationservice.dto.OrganizationDto;
import com.hami.organizationservice.entity.Organization;
import com.hami.organizationservice.mapper.OrganizationMapper;
import com.hami.organizationservice.repository.OrganizationRepository;
import com.hami.organizationservice.service.OrganizationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {

    private OrganizationRepository organizationRepository;

    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {

        // convert OrganizationDto into Organization jpa entity
        Organization organization = OrganizationMapper.organization(organizationDto);

        Organization savedOrganization = organizationRepository.save(organization);

        return OrganizationMapper.organizationDto(savedOrganization);
    }

    @Override
    public OrganizationDto getOrganizationCode(String organizationCode) {
        Organization organization = organizationRepository.findByOrganizationCode(organizationCode);
        return OrganizationMapper.organizationDto(organization);
    }
}
