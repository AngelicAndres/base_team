package com.base_team.dto;

import com.base_team.model.TeamModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder 
@Data
@NoArgsConstructor 
@AllArgsConstructor 
public class TeamDto {
    private Integer id;
    private String name;
    private String jersey;
    private String country;
    private String position;
    
    public TeamModel toModel() {
        return TeamModel.builder()
                .id(this.id)
                .name(this.name)
                .country(this.country)
                .build();
    }


}
