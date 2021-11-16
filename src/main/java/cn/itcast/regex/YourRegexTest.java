package cn.itcast.regex;

import java.util.Arrays;

public class YourRegexTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
//		test_1();
//		test_2();
		checkMail();
	}
	
	/*
	 * "����....������....��Ҫ....Ҫ...ҪҪ....ҪҪ..ѧѧѧ...ѧѧ��...���..���̳�....��..�̳�"
	 * ��ԭ�ɣ���Ҫѧ��̡�
	 * 
	 */
	public static void test_1(){
		String temp = "����....������....��Ҫ....Ҫ...ҪҪ....ҪҪ..ѧѧѧ...ѧѧ��...���..���̳�....��..�̳�";
		
		//1,��ȷҪʹ���滻��replaceAll(regex,String);
		
		//2,����ɵ���
		temp = temp.replaceAll("\\.+", "");
		//3,�����ʸɵ���
		temp = temp.replaceAll("(.)\\1+", "$1");
		System.out.println(temp);
		
		
	}
	
	
	
	

	
	/* ��ϰ2����ip��ַ��������
	 * 192.168.1.200  10.10.10.10   3.3.50.3  127.0.0.1
	 */
	public static void test_2(){
		
		String temp = "192.168.1.200  17.10.10.10    3.3.50.3  127.0.0.1";
		
		
		
		/*
		������������ˡ��ǰ����ַ����ֵ�˳���ŵ���
		���������أ�����Ϊÿһ����ַ�ε�λ�����ԡ�
		���λ��������λ�Ϳ����ˡ�ֻ�в�0�ˡ�
		ÿһ��λ������ͬ��զ����
		�ɴ࣬�����������0�ĸ������롣ÿһ�ζ�������0.
		*/
		
		
//		String[] ips = temp.split(" +");
//		Arrays.sort(ips);
//		for(String ip : ips){
//			System.out.println(ip);
//		}
		
		
		//������0.
		temp = temp.replaceAll("(\\d+)", "00$1");
		System.out.println(temp);//00192.00168.001.00200  0017.0010.0010.0010    003.003.0050.003  00127.000.000.001
		
		//�������ÿ��3λ��
		temp = temp.replaceAll("0*(\\d{3})", "$1");
		System.out.println(temp);
		
		String[] ips = temp.split(" +");
		Arrays.sort(ips);
		for(String ip : ips){
			System.out.println(ip.replaceAll("0*(\\d+)", "$1"));
		}
	}
	
	
	/*
	 * У���ʼ���ַ��
	 */
	public static void checkMail(){
		
		String  mail = "abc12@sina.com";
		
		String regex = "\\w+@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,3}){1,3}";
		regex = "\\w+@\\w+(\\.\\w+)+";//1@1.1
		
		boolean b = mail.matches(regex);
		
		System.out.println(mail+":"+b);
		
		
	}
	
	
	
}
