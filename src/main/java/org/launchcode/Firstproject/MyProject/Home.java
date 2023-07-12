package org.launchcode.Firstproject.MyProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value ="prototype")
public class Home {
    public Home(){
        System.out.println("Home Home");
    }
    //POJO Classes
    private String owner;
    private int doorNo;
    @Autowired
    @Qualifier("abc")
    private InternetConnection modem;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }

    public void connect() {

        System.out.println("Connecting to internet");
        modem.switchOn();
    }
}