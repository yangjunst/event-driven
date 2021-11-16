package cn.itcast.io.b.datastream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		
//		writeData();
		
		readData();

	}

	public static void readData() throws IOException {
	
		FileInputStream fis = new FileInputStream("tempfile\\data.txt");
		
		//��ȡһ����������Ҫ���⹦�ܡ�
		DataInputStream dis = new DataInputStream(fis);
		
		int num = dis.readInt();
		System.out.println("num="+num);
		dis.close();
		
	}

	public static void writeData() throws IOException {
		
		FileOutputStream fos = new FileOutputStream("tempfile\\data.txt");
		//��Ҫ���⹦������Ҫ������дһ��������ֵ��ԭ�ֽڲ��䡣
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeInt(97);//00000000 00000000 00000000 01100001 
		
		dos.close();
		
	}

}
