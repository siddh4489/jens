/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bd.jenkins;

import com.offbytwo.jenkins.JenkinsServer;
import com.offbytwo.jenkins.model.Job;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

/**
 *
 * @author Siddhrajsinh_Atodari
 */
public class JenkinsInvoke {
    public static String getLog() throws URISyntaxException, IOException {
        JenkinsServer jenkins = new JenkinsServer(new URI("http://10.150.0.181:8088/job/GSP/job/Indirect/job/PartnerEnroll_To_OpptyReg_QuoteSubmit/lastBuild/consoleText"), "executor", "executor");
        String logs =  jenkins.getJobXml("PartnerEnroll_To_OpptyReg_QuoteSubmit");
        return logs;
    }
    
}
