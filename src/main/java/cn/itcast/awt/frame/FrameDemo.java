package cn.itcast.awt.frame;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//1,����һ�����塣Frame
		Frame f = new Frame("my frame");
		//2, �Դ�����л������á�
		f.setSize(500, 400);
		f.setLocation(400, 200);
		//���ò��֡�
		f.setLayout(new FlowLayout());
		
		//��������������
		 Button but = new Button("my button");

		 //����һ���ı��������
		 TextField tf = new TextField(40);

		 //�������ӵ������С�
		 f.add(tf);
		 f.add(but);
		 
		 
		 
		 /*
		  * ������Ҫ�����ť��Ч���������ӡһ�仰��
		  * ˼·��
		  * 1��ȷ���¼�Դ����ť��
		  * 2��ȷ������������ť��Ӽ���������ť���������������ť�����в��ҡ�
		  * 3�����崦��ʽ��
		  * 
		  * ����Ĺ淶��XXXLinstener:XXX�������� --��Ӧ��XXXEvent�¼���
		  */
		 //1,�ڰ�ť���������ļ�������
		 but.addActionListener(new ActionListener() {

//			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println("��ť��������....."+e);
//				System.exit(0);
				/*
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 5; j++) {
						System.out.print("*");
					}
					System.out.println();
				}*/
			}
		});
		 
		 
		 
		 /*
		  * ������Ҫʵ�ֵ������X�Ϳ���ʵ�ִ���Ĺرա�
		  * ˼·��
		  * 1���¼�Դ�����塣
		  * 2����������ͨ�����ڶ���ȥ�顣
		  * 3���¼�����
		  * 
		  * ������Щ�����ӿ����������ࣿ
		  * ֻҪ�����ӿڵ��еķ�����2�����ڣ���û���������ࡣ�������ĳ���ֻΪ���㴴������������
		  * ����һ������ӿڶ�����������
		  * 
		  */
		 
		 
		 f.addWindowListener(new WindowAdapter() {
	
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("window closing");
				System.exit(0);
			}

			@Override
			public void windowOpened(WindowEvent e) {
				
				System.out.println("��ȸ������window open");
			}
			
			
		
		});
		 
		 
		 
		 
		 
		 
		 
		 /*
		  * ��ʾ��������
		  * 
		  * ��ť�¼�Դ��
		  * ��������ע�ᵽ��ť�ϡ�
		  * 
		  * 
		  * ���.addXXXListener(new XXXAdapter()
		  * {
		  * 	public void methodName(XXXEvent e){}
		  * }));
		  * 
		  */
		 
		but.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				/*
				 * ��Ҫ�����˫�����д���Ӧ��������¼�������Ϊ�¼�����һ�������ڲ���Ȼ��װ�¼�Դ�Լ��¼�������ݡ�
				 * Ҫ��MouseEvent����
				 */
				if(e.getClickCount() == 2){

					System.out.println("mouse double click");
				}
			}

		});

		 
		 
		
		/*
		 * ����:�ı�����ֻ���������֡�
		 * �¼�Դ���ı���
		 * �ı���ע����̼�����
		 * �¼�����
		 */
		
		tf.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {

				//1,��λ�ȡ¼������ݡ�ͨ�������¼������ȡ��
//				char key = e.getKeyChar();
//				int code = e.getKeyCode();
//				System.out.println(code+"...."+KeyEvent.getKeyText(code));

//				int code = e.getKeyCode();
//				if(!(code>=KeyEvent.VK_0 && code<=KeyEvent.VK_9)){
//					System.out.println("������0-9����");
//					e.consume();//ֱ��ȡ��Ĭ�ϴ���ʽ��
//				}


				if(e.isControlDown() && e.getKeyCode()==KeyEvent.VK_ENTER){
					System.out.println("ctrl+enter run");

				}

			}

		});

		
		//3���ô�����ʾ��
		f.setVisible(true);
		
		System.out.println("over");
	}

}
