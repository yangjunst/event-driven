package cn.itcast.regex;

public class RegexDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * ������ʽ:��ȷ�Ĺ���
		 * ר�����ڶ��ַ����Ĳ�����
		 * �������ɷ�����ɵġ��ò����ַ�����ü򵥡�
		 * �׶ˣ��Ķ��Խ����ˡ�
		 * ����ѧϰ������ʵ����ѧϰ���ŵ�ʹ�á�
		 * 
		 * 1��ƥ�䡣
		 * 	String �����ṩ��ƥ��boolean matches(regex)�ķ�����
		 * 
		 * 2���и
		 * String �����ṩ��ƥ��String[] split(regex)�ķ���
		 * 
		 * 3���滻��
		 * String �����ṩ��ƥ��String replaceAll(regex,string)�ķ���
		 * 
		 * 4����ȡ��
		 * 
		 * 
		 * 
		 */

		String QQ = "1234";
//		boolean b = checkQQ(QQ);
//		if(b){
//			System.out.println(QQ+" is  ok");
//		}else{
//		System.out.println(QQ+" is  nononon");
//		}
		
		boolean b = QQ.matches("[1-9]\\d{4,14}");  
		System.out.println(QQ+":"+b);
	
		
		
		String temp = "a12357389";
		
		boolean res = temp.matches("a\\d{5,7}");
		System.out.println(temp+":"+res);
	}

	/**
	 * У��QQ�š�5~15 ֻ�������֣�0���ܿ�ͷ��
	 */
	public static boolean checkQQ(String QQ) {

		boolean b = false;
		// 1,��ȡ���ȣ�
		int len = QQ.length();

		// 2,�жϳ��ȡ�
		if (len >= 5 && len <= 15) {

			// 3,�ж��Ƿ�0��ͷ��
			if (!QQ.startsWith("0")) {
				try {
					long qq_num = Long.parseLong(QQ);
					System.out.println("QQ:" + qq_num);

					b = true;
				} catch (NumberFormatException e) {
					System.out.println("�Ƿ�QQ��");
				}

			} else {
				System.out.println("����0��ͷ");
			}

		} else {
			System.out.println("���ȴ���");
		}

		return b;
	}

}
