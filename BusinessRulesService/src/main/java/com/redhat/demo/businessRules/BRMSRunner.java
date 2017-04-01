package com.redhat.demo.businessRules;

import org.kie.api.KieBase;
import org.kie.api.runtime.KieSession;

public class BRMSRunner {
	
	//The releaseId uses maven GAV (groupId, artifactId and version) to specify a kjar
	public static final String GROUPID = "RedHat";
	public static final String ARTIFACTID = "rules";
	public static final String VERSION = "LATEST";
	
	private KieBase kieBase;

    public BRMSRunner() {
    	initKieSession();
    }
    
    private void initKieSession() {
		KieBaseProvider kbp = new KieBaseProvider(GROUPID,ARTIFACTID,VERSION);
		kieBase = kbp.getKieBase();
    }
    
    public DataSet fireRules( DataSet event ) {	
    	
    	
		KieSession kieSession = kieBase.newKieSession();
		
		kieSession.insert(event);
		kieSession.fireAllRules();
		kieSession.dispose();    
			
		return event;
	}
}
