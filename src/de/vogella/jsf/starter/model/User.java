package de.vogella.jsf.starter.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "userData")
@SessionScoped
public class User {

	public String name;
	public String password;

    public String getName() {
            return name;
    }
    public void setName(String name) {
            this.name = name;
    }
    public String getPassword() {
            return password;
    }
    public void setPassword(String password) {
            this.password = password;
    }

    public String login(){
            // Image here a database access to validate the users
            if (name.equalsIgnoreCase("tester") && password.equalsIgnoreCase("tester")){
                    return "success";
            } else {
                    return "failed";
            }

    }
}
