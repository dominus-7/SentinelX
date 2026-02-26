// src/main/java/com/giteck/academy/sentinelx/mapping/FeeComputationMapper.java
package org.impact.sentinelx.mapping;

import org.impact.sentinelx.entity.FeeComputation;
import org.impact.sentinelx.dto.FeeComputationDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class FeeComputationMapper {
    public FeeComputationDTO toDto(FeeComputation entity) {
        if (entity == null) return null;
        FeeComputationDTO dto = new FeeComputationDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }
    public FeeComputation toEntity(FeeComputationDTO dto) {
        if (dto == null) return null;
        FeeComputation entity = new FeeComputation();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }
}