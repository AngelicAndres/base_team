
package com.base_team.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.base_team.dto.TeamDto;
import com.base_team.model.TeamModel;
import com.base_team.repository.TeamRepository;




@Service 
public class TeamService {
    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    //Devolver el listado de la base de datos
    public List<TeamDto> findAll() {
       List<TeamDto>list =teamRepository.findAll().stream().map(TeamModel::toDto).toList();
       return list;
    }

}
