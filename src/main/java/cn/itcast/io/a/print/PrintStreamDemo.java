package cn.itcast.io.a.print;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//����ϣ��дһ����������Ŀ�ĵ������ı�����ʽ���䡣���Խ�����ת���ַ�����д�뵽Ŀ�ĵء�
		
//		FileOutputStream fos = new FileOutputStream("tempfile\\int.txt");
//		fos.write(String.valueOf(97));//�ֽ�����write����ֻ��һ������������ֽ�д�뵽Ŀ�ĵ�;//00000000 00000000 00000001 01100001
//		fos.close();
		
		
//		FileOutputStream fos = new FileOutputStream("tempfile\\int.txt");
//		//��Ҫ���⹦���𣿱�֤����ֵ�ı�ʾ��ʽ����Ҫ��
//		PrintStream ps = new PrintStream(fos);
////		ps.write(97);// ֻ��д������ֽڡ�
//		ps.print(97);//������ת���ַ�����д�롣��֤����ֵ�ı�����ʽ��
//		ps.close();
		
		
		PrintStream ps = new PrintStream("tempfile\\int.txt");
		ps.print(98);
		ps.close();
	}

}
