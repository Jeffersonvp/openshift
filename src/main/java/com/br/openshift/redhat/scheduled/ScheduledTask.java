package com.br.openshift.redhat.scheduled;


import com.br.openshift.redhat.services.RedHatService;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@EnableScheduling
@Component
public class ScheduledTask {

    RedHatService redHatService;

    public ScheduledTask(RedHatService redHatService) {
        this.redHatService = redHatService;
    }

    @Scheduled(fixedDelay = 20)
    public void enablePrint(){
        redHatService.printaAlgo();
    }
}
