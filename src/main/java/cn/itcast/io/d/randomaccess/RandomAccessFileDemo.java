package cn.itcast.io.d.randomaccess;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		/*
		 * RandomAccessFile��
		 * 1��������ʡ�
		 * 2�������ļ���
		 * 3���ȿ��Զ��ֿ���д��
		 * 4���ڲ�ά�������ڴ洢���ݵ�byte���顣
		 * 5���ṩ��һ��������������ļ�ָ�롣
		 * 6�� �ļ�ָ�����ͨ��getFilePointer ������ȡ����ͨ�� seek �������á� 
		 * 
		 * ע�⣺�����д��������Ҫ���ɣ���RandomAccessFile����Ҫ��ȷҪ���������ݵ�λ�á�
		 */

//		writeFile();
		
		readFile();
		
	}

	public static void readFile() throws IOException {
	
		RandomAccessFile raf = new RandomAccessFile("tempfile\\random.txt", "r");
		//�ı�ָ���λ�ã����˭�Ͷ�˭��
		raf.seek(8*3);
		
		
		byte[] buf = new byte[4];
		raf.read(buf);
		String name = new String(buf);
		System.out.println("name="+name);
		
		int age = raf.readInt();
		System.out.println("age="+age);
		
		raf.close();
		
	}

	public static void writeFile() throws IOException {
		
		
	
		RandomAccessFile raf = new RandomAccessFile("tempfile\\random.txt", "rw");
		
		//дһЩ�ַ���Ϣ������ +���䡣
//		raf.write("����".getBytes());
//		raf.writeInt(97);//��֤�ֽڵ�ԭ���ԡ�
//		raf.write("����".getBytes());
//		raf.writeInt(99);//��֤�ֽڵ�ԭ���ԡ�
		
		raf.seek(4);
		
		raf.write("����".getBytes());
		raf.writeInt(102);
		
		System.out.println(raf.getFilePointer());
		
		raf.close();
		
	}

}
