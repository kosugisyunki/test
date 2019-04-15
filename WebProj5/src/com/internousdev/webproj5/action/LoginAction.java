package com.internousdev.webproj5.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.webproj5.dao.LoginDAO;
import com.internousdev.webproj5.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{
	private String username;
	private String password;
	private List<LoginDTO>loginDTOList=new ArrayList<LoginDTO>();
	private Map<String,Object>session;

	public String execute(){
		String ret=ERROR;
		System.out.println(username);
		System.out.println(password);
		LoginDAO dao=new LoginDAO();

		loginDTOList=dao.select(username, password);
		if(this.username.equals(loginDTOList.get(0).getUsername))

}

}
