// src/main/java/com/giteck/academy/sentinelx/mapping/AuditEventMapper.java
package org.impact.sentinelx.mapping;

import org.impact.sentinelx.entity.AuditEvent;
import org.impact.sentinelx.dto.AuditEventDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AuditEventMapper {
    public AuditEventDTO toDto(AuditEvent entity) {
        if (entity == null) return null;
        AuditEventDTO dto = new AuditEventDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }
    public AuditEvent toEntity(AuditEventDTO dto) {
        if (dto == null) return null;
        AuditEvent entity = new AuditEvent();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }
}