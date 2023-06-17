package com.jamiltonquintero.companyconfiguration.reward.model.entity;

import com.jamiltonquintero.company.model.Company;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Reward {

    private Long id;
    private Integer pointsToRedeem;
    private String name;
    private boolean multiReward;
    private Integer dailyPointsLimit;
    private Integer weeklyPointsLimit;
    private String pointsAccumulatedMessage;
    private String redemptionMessage;
    private Integer pointsRange;
    private LocalDate expirationDate;
    private Company company;

    public Reward(Integer pointsToRedeem,
                  String name,
                  boolean multiReward,
                  Integer dailyPointsLimit,
                  Integer weeklyPointsLimit,
                  String pointsAccumulatedMessage,
                  String redemptionMessage,
                  Integer pointsRange,
                  LocalDate expirationDate) {

        this.pointsToRedeem = pointsToRedeem;
        this.name = name;
        this.multiReward = multiReward;
        this.dailyPointsLimit = dailyPointsLimit;
        this.weeklyPointsLimit = weeklyPointsLimit;
        this.pointsAccumulatedMessage = pointsAccumulatedMessage;
        this.redemptionMessage = redemptionMessage;
        this.pointsRange = pointsRange;
        this.expirationDate = expirationDate;

    }


}