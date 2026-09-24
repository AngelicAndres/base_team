package com.base_team.model;

import com.base_team.dto.TeamDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder 
@Data
@NoArgsConstructor 
@AllArgsConstructor 
@Entity 
@Table(name = "Team")
public class TeamModel {
    
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name", columnDefinition = "VARCHAR(80)")
    private String name;
    @Column(name = "country", columnDefinition = "VARCHAR(80)")
    private String country;


    public TeamDto toDto() {
        return TeamDto.builder()
                .id(this.id)
                .name(this.name)
                .country(this.country)
                .build();
    }
    
}