package cn.itcast.io.c.bytearraystream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrayStreamDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Դ��Ŀ�Ķ��ڴ�Ķ�д���̡�
		
		//Դ���ڴ档
		ByteArrayInputStream bis = new ByteArrayInputStream("abcde".getBytes());//�����Ķ�д˼����������е����ݡ�
		
//		byte[] buf = "abcde".getBytes();
//		for(byte b : buf){
//			bos.write(b);
//		}
		
		//Ŀ�ģ��ڴ档
		ByteArrayOutputStream bos = new ByteArrayOutputStream();//�ڲ���һ�����Զ����������顣
		
		//���ϵĶ�д��
		int ch = 0;
		while((ch=bis.read())!=-1){
			bos.write(ch);
		}
		//��Ϊû�е��õײ���Դ�����Բ�Ҫ�رգ���ʹ������close��Ҳû���κ�Ч���������׳�IOException.
		
		System.out.println(bos.toString());

	}

}
