package com.example.application.factory;

import com.example.application.domain.Application;
import com.example.application.util.Helper;
import java.time.LocalDate;

/* ApplicationFactory.java
 *  This is a factory class for Application entity.
 *  Zachariah Matsimella 220097429
 */
public class ApplicationFactory {
    public static Application createApplication(boolean bankStatement, boolean paySlip, String status, String adress,
                                                String email, String contactNumber, int id, String firstName, String lastName,
                                                LocalDate applicationDate, String propertyId, String tenantId, boolean copyOfId, String references) {
        if (Helper.isNullOrEmpty(String.valueOf(bankStatement))
                || Helper.isNullOrEmpty(String.valueOf(paySlip))
                || Helper.isNullOrEmpty(status)
                || Helper.isNullOrEmpty(adress)
                || Helper.isNullOrEmpty(email)
                || Helper.isNullOrEmpty(contactNumber)
                || Helper.isNullOrEmpty(String.valueOf(id))
                || Helper.isNullOrEmpty(firstName)
                || Helper.isNullOrEmpty(lastName)
                || Helper.isNullOrEmpty(String.valueOf(applicationDate))
                || Helper.isNullOrEmpty(propertyId)
                || Helper.isNullOrEmpty(tenantId)
                || Helper.isNullOrEmpty(String.valueOf(copyOfId))
                || Helper.isNullOrEmpty(references)){
            return null;
        }

        String applicationId = Helper.generateId();

        Application application = new Application.Builder()
                .setBankStatement(bankStatement)
                .setPaySlip(paySlip)
                .setStatus(status)
                .setAdress(adress)
                .setEmail(email)
                .setContactNumber(contactNumber)
                .setId(id)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setApplicationDate(applicationDate)
                .setPropertyId(propertyId)
                .setTenantId(tenantId)
                .setApplicationId(applicationId)
                .setCopyOfId(copyOfId)
                .setReferences(references)
                .build();
        return application;
    }

    public static Application createApplicationWId(boolean bankStatement, boolean paySlip, String status, String adress,
                                                String email, String contactNumber, int id, String firstName, String lastName,
                                                LocalDate applicationDate, String propertyId, String tenantId, String applicationId, boolean copyOfId, String references) {
        if (Helper.isNullOrEmpty(String.valueOf(bankStatement))
                || Helper.isNullOrEmpty(String.valueOf(paySlip))
                || Helper.isNullOrEmpty(status)
                || Helper.isNullOrEmpty(adress)
                || Helper.isNullOrEmpty(email)
                || Helper.isNullOrEmpty(contactNumber)
                || Helper.isNullOrEmpty(String.valueOf(id))
                || Helper.isNullOrEmpty(firstName)
                || Helper.isNullOrEmpty(lastName)
                || Helper.isNullOrEmpty(String.valueOf(applicationDate))
                || Helper.isNullOrEmpty(propertyId)
                || Helper.isNullOrEmpty(tenantId)
                || Helper.isNullOrEmpty(applicationId)
                || Helper.isNullOrEmpty(String.valueOf(copyOfId))
                || Helper.isNullOrEmpty(references)){
            return null;
        }

        Application application = new Application.Builder()
                .setBankStatement(bankStatement)
                .setPaySlip(paySlip)
                .setStatus(status)
                .setAdress(adress)
                .setEmail(email)
                .setContactNumber(contactNumber)
                .setId(id)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setApplicationDate(applicationDate)
                .setPropertyId(propertyId)
                .setTenantId(tenantId)
                .setApplicationId(applicationId)
                .setCopyOfId(copyOfId)
                .setReferences(references)
                .build();
        return application;
    }
}