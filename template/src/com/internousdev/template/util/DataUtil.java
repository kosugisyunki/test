package com.internousdev.template.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {
	public String getData(){
		Date date=new Date();
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		return simpleDateFormat.format(date);
	}

}
