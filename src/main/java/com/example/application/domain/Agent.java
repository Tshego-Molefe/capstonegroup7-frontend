/*
 * Agent.java
 * Author: Sibusiso Dwayi(220226466)
 * Date: 14 June 2023
 * */
package com.example.application.domain;

import java.io.Serializable;
import java.util.Objects;

public class Agent implements Serializable {
    private String agentId;

    private String firstname;

    private String lastname;

    private String contactnumber;

    private String email;

    private String password;

    private String address;

    private Agent(Builder builder){
        this.agentId = builder.agentId;
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.contactnumber = builder.contactnumber;
        this.email = builder.email;
        this.password = builder.password;
        this.address = builder.address;


    }

    public Agent(String agentId, String firstname, String lastname, String contactnumber, String email, String password, String address) {
        this.agentId = agentId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.contactnumber = contactnumber;
        this.email = email;
        this.password = password;
        this.address = address;
    }

    public String getAgentId() {
        return agentId;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public String getContactnumber() {
        return contactnumber;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agent agent = (Agent) o;
        return Objects.equals(agentId, agent.agentId) && Objects.equals(firstname, agent.firstname) && Objects.equals(lastname, agent.lastname)&& Objects.equals(contactnumber, agent.contactnumber)&& Objects.equals(email, agent.email)&& Objects.equals(password, agent.password)&& Objects.equals(address, agent.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentId, firstname, lastname, contactnumber, email, password, address);
    }

    public static class Builder{
        private String agentId;
        private String firstname;
        private String lastname;

        private String contactnumber;

        private String email;

        private String password;

        private String address;

        public Builder setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        public Builder setFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }
        public Builder setContactnumber(String contactnumber) {
            this.contactnumber = contactnumber;
            return this;
        }
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }
        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder copy(Agent agent){
            this.agentId = agent.agentId;
            this.firstname = agent.firstname;
            this.lastname = agent.lastname;
            this.contactnumber = agent.contactnumber;
            this.email = agent.email;
            this.password = agent.password;
            this.address =agent.address;
            return this;
        }

        public Agent build(){
            return new Agent(this);
        }
    }

    @Override
    public String toString() {
        return "Agent{" +
                "agentId='" + agentId + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", contactnumber='" + contactnumber + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}