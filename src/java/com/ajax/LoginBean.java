/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ajax;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author armel
 */
@ManagedBean
@SessionScoped
public class LoginBean {

    private String name;
    /**
     * Creates a new instance of LoginBean
     */
    public LoginBean() {
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String _name ){
        name=_name;
    }
}
