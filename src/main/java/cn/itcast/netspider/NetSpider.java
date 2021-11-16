package cn.itcast.netspider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetSpider {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		//1,���ļ���װ��File����
		File file = new File("mail.html");
		String regex = "\\w+@\\w+(\\.\\w+)+";
		List<String> mailList = getMails(file,regex);
		
		for(String mail : mailList){
			System.out.println(mail);
		}
		
	}

	public static List<String> getMails(File file,String regex) throws IOException {
		
		
		//1����ȡ���ݡ�
		BufferedReader bufr = new BufferedReader(new FileReader(file));
		
		//2���������װ�ɶ���
		Pattern p = Pattern.compile(regex);
		
		//3,����list���ϡ�
		List<String> list = new ArrayList<String>();
		
		String line = null;
		while((line=bufr.readLine())!=null){
			
			Matcher m = p.matcher(line);
			
			while(m.find()){
				list.add(m.group());
			}
		
		}
		
		
		return list;
	}

}
