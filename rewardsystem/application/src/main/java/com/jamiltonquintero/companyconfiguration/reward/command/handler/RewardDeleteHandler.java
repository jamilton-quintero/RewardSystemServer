package com.jamiltonquintero.companyconfiguration.reward.command.handler;

import com.jamiltonquintero.companyconfiguration.reward.port.repository.RewardRepository;
import org.springframework.stereotype.Component;

@Component
public class RewardDeleteHandler {


    private final RewardRepository rewardRepository;

    public RewardDeleteHandler(RewardRepository rewardRepository) {
        this.rewardRepository = rewardRepository;
    }

    public void execute(Long Id){
        rewardRepository
                .delete(Id);
    }

}
