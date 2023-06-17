package com.jamiltonquintero.user.model.entity;

import com.jamiltonquintero.company.model.Company;
import com.jamiltonquintero.companyconfiguration.reward.model.entity.Reward;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class User {

    public static final int INITIAL_POINTS = 0;

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String identification;
    private Integer totalPoints;
    private List<Company> companies;
    private List<Reward> rewards;

    public User(Long id, String firstName, String lastName, String email, String identification, Integer totalPoints) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.identification = identification;
        this.totalPoints = totalPoints;
    }

    public User(String firstName, String lastName, String email, String identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.identification = identification;
    }

    public void setFieldsToEdit(String firstName,
                                String lastName,
                                String email,
                                String identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.identification = identification;
    }

    public User(Long id, String firstName, String lastName, String email, String identification, Integer totalPoints, List<Company> companies) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.identification = identification;
        this.totalPoints = totalPoints;
        this.companies = companies;
    }

    public void addRewards(List<Reward> rewards){
        this.rewards.addAll(rewards);
    }
}