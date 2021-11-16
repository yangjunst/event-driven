package cn.itcast.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegexTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		matchesDemo();
		
//		splitDemo();
		
//		replaceDemo();
		
		getDemo();
	}

	public static void getDemo() {
		
		/*
		 * ʵ�ֻ�ȡ�������Ϲ��������ȡ������
		 * �õ�������ʽ����java.util.regex.Pattern
		 * 
		 * 1,���ַ��������װ��Pattern����compile(regex);
		 * 2,ͨ����������ȡƥ���������öԽ�����������õ�Ҫ�������ַ����ϡ�
		 * 3��ͨ��ƥ��������ķ��������ַ������в�����
		 *  Pattern p = Pattern.compile("a*b");//���������ɶ���
		 *  Matcher m = p.matcher("aaaaab"); //��Ҫ�������ַ�������������ƥ��������
		 *  boolean b = m.matches();//ʹ��ƥ����󷽷����ַ���������
		 */
		//��ȡ�ַ����з��Ϲ�������ݡ�
		String temp = "da jia zhu yi le,ming tian fang jia le!";
		System.out.println(temp);
		//ȡ����������ĸ��ɵĵ��ʡ�
		String regex = "\\b[a-zA-Z]{3}\\b";
		
		//1,����������Pattern����
		Pattern p = Pattern.compile(regex);
		
		//2,���ַ�����������ȡƥ��������
		Matcher m = p.matcher(temp);
		
//		System.out.println(m.find());
//		System.out.println(m.group());
		while(m.find()){
			System.out.println(m.start()+":"+m.group()+":"+m.end());
		}
		
	}

	public static void replaceDemo() {
		
//		String temp = "15900001111";		
//		temp = temp.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");//$�����ڶ����ʱ��
//											����Ĳ�������ͨ��$��ŵ���ʽȡ��ǰһ���������顣
		
		String temp = "qwe##rty$$$$$iouzzzzzzztyu";
		temp  = temp.replaceAll("(.)\\1+", "$1");
		System.out.println(temp);
		
	}

	public static void splitDemo() {
		
//		String temp = "zhangsan    lisi       wangwu";
//		String regex = " +";
//		String temp = "zhangsan.lisi.wangwu";
//		String regex = "\\.";
		
		String temp = "qwe##rty$$$$$iouzzzzzzztyu";
		String regex = "(.)\\1+";//Ϊ��ʵ�ֹ���ĸ��ã���()����Ҫ���õĹ����װ��
//								�ͳ�Ϊ��������ʽ�е��飬ÿһ���鶼�б�ţ���1��ʼ��
//								ͨ��ʹ�ñ�žͿ��Ը��ö�Ӧ��Ĺ������ݡ�ע�⣺��ű����õ���ĺ��档
//								Ҳ����˵���ȷ�װ���ڵ��á�
		
		
		String[] names = temp.split(regex);
		for(String name : names){
			System.out.println("-"+name+"-");
		}
		
		
	}

	public static void matchesDemo() {

		// ����У���ֻ������Ƿ���ȷ��

		String tel = "15800001111";
		String regex = "1[358]\\d{9}";
		boolean b = tel.matches(regex);
		System.out.println(tel+":"+b);
	}

}
