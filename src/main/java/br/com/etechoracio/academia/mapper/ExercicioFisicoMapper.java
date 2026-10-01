package br.com.etechoracio.academia.mapper;

import br.com.etechoracio.academia.dto.ExercicioFisicoResponseDTO;
import br.com.etechoracio.academia.entity.ExercicioFisico;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface ExercicioFisicoMapper {
    ExercicioFisicoResponseDTO toResponse(ExercicioFisico entity);
    List<ExercicioFisicoResponseDTO> toResponseList(List<ExercicioFisico> entities);
}