package org.impact.sentinelx.mapping;

import org.impact.sentinelx.entity.ProfilingTrace;
import org.impact.sentinelx.dto.ProfilingTraceDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ProfilingTraceMapper {
    public ProfilingTraceDTO toDto(ProfilingTrace entity) {
        if (entity == null) return null;
        ProfilingTraceDTO dto = new ProfilingTraceDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }
    public ProfilingTrace toEntity(ProfilingTraceDTO dto) {
        if (dto == null) return null;
        ProfilingTrace entity = new ProfilingTrace();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }
}