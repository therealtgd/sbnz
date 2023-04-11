package com.ftn.sbnz.backward.service.services;

import com.ftn.sbnz.backward.model.models.Man;
import com.ftn.sbnz.backward.model.models.Parent;
import com.ftn.sbnz.backward.model.models.Woman;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivateZadatakRulesService {

    private final KieContainer kieContainer;

    @Autowired
    public ActivateZadatakRulesService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public void fireRules() {
        KieSession ksession = kieContainer.newKieSession();
        // grand parentsÏ
        ksession.insert(new Man("john"));
        ksession.insert(new Woman("janet"));
        // parent
        ksession.insert(new Man("adam"));
        ksession.insert(new Parent("john", "adam"));
        ksession.insert(new Parent("janet", "adam"));
        ksession.insert(new Man("stan"));
        ksession.insert(new Parent("john", "stan"));
        ksession.insert(new Parent("janet", "stan"));
        // grand parents
        ksession.insert(new Man("carl"));
        ksession.insert(new Woman("tina"));
        //
        // parent
        ksession.insert(new Woman("eve"));
        ksession.insert(new Parent("carl", "eve"));
        ksession.insert(new Parent("tina", "eve"));
        //
        // parent
        ksession.insert(new Woman("mary"));
        ksession.insert(new Parent("carl", "mary"));
        ksession.insert(new Parent("tina", "mary"));
        ksession.insert(new Man("peter"));
        ksession.insert(new Parent("adam", "peter"));
        ksession.insert(new Parent("eve", "peter"));
        ksession.insert(new Man("paul"));
        ksession.insert(new Parent("adam", "paul"));
        ksession.insert(new Parent("mary", "paul"));
        ksession.insert(new Woman("jill"));
        ksession.insert(new Parent("adam", "jill"));
        ksession.insert(new Parent("eve", "jill"));

        System.out.println("--------------------Woman--------------------");
        ksession.getAgenda().getAgendaGroup("woman").setFocus();
        ksession.fireAllRules();
        System.out.println("---------------------------------------------");

        System.out.println("--------------------Man--------------------");
        ksession.getAgenda().getAgendaGroup("man").setFocus();
        ksession.fireAllRules();
        System.out.println("---------------------------------------------");

        System.out.println("--------------------Father--------------------");
        ksession.getAgenda().getAgendaGroup("father").setFocus();
        ksession.fireAllRules();
        System.out.println("---------------------------------------------");

        System.out.println("--------------------Mother--------------------");
        ksession.getAgenda().getAgendaGroup("mother").setFocus();
        ksession.fireAllRules();
        System.out.println("---------------------------------------------");
    }
}
