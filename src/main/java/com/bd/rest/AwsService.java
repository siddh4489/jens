/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bd.rest;

import com.offbytwo.jenkins.JenkinsServer;
import java.net.URI;
import java.sql.Connection;
import java.sql.SQLException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.json.simple.parser.ParseException;
import com.offbytwo.jenkins.JenkinsServer;
import com.offbytwo.jenkins.model.Job;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

/**
 *
 * @author Siddharaj Atodaria
 */
@Path("/aws")
public class AwsService {

    @GET
    @Path("/{param}")
    public Response getMsg(@PathParam("param") String msg) throws IOException, URISyntaxException {

        String output = "Jersey say : " + msg;
        JenkinsServer jenkins = new JenkinsServer(new URI("http://10.150.0.181:8088/job/GSP/job/Indirect/job/PartnerEnroll_To_OpptyReg_QuoteSubmit/lastBuild/consoleText"), "executor", "executor");
        //return Response.status(201).entity(jenkins.getJobXml("PartnerEnroll_To_OpptyReg_QuoteSubmit")).build();
        return Response.status(201).entity(output).build();
    }

    @POST
    @Path("/jenkins")
    public Response someMethod(String x, @HeaderParam("data") String data) throws URISyntaxException, IOException {
        JenkinsServer jenkins = new JenkinsServer(new URI("http://10.150.0.181:8088/job/GSP/job/Indirect/job/PartnerEnroll_To_OpptyReg_QuoteSubmit/lastBuild/consoleText"), "executor", "executor");
        return Response.status(201).entity(jenkins.getJobXml("PartnerEnroll_To_OpptyReg_QuoteSubmit")).build();        // process string x, for example parse using JAXB and so on ...
    }

}
