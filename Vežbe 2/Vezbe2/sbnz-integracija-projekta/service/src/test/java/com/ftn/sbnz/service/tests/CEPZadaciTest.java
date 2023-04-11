package com.ftn.sbnz.service.tests;

import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.ftn.sbnz.model.TransactionEvent;

public class CEPZadaciTest {

  @Test
  public void testCEPZadaci() {
    KieServices ks = KieServices.Factory.get();
    KieContainer kc = ks.newKieClasspathContainer();
    KieSession ksession = kc.newKieSession("cepKsession");
    Long customerId = 1L;
    ksession.insert(new TransactionEvent(customerId, 10.00));
    ksession.insert(new TransactionEvent(customerId, 10.00));
    long ruleFireCount = ksession.fireAllRules();
    System.out.println(ruleFireCount);
  }
}