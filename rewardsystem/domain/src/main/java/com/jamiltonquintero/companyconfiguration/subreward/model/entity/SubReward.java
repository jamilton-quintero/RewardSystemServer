package com.jamiltonquintero.companyconfiguration.subreward.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Getter
public class SubReward {

    private Long id;
    private Integer pointsToRedeem;
    private String name;

    public SubReward(Integer pointsToRedeem, String name) {
        this.pointsToRedeem = pointsToRedeem;
        this.name = name;
    }

}