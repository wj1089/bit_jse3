package com.jse.inheritance;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Engine {

	public static void main(String[] args) {
		
//		Scanner scanner  = new Scanner(System.in);
		PhoneService service = new PhoneService();
		CelPhone celPhone = new CelPhone();
		
		while(true) {
//			System.out.println("0. 종료    1.핸드폰정보 입력   2. 핸드폰정보 출력");
			switch(JOptionPane.showInputDialog("0. 종료    1.핸드폰정보 입력   2. 핸드폰정보 출력"
												  + "\t 3. 휴대전화입력\t4.휴대전화출력.")) {
			case "0":  JOptionPane.showInputDialog(" 종료 "); return; //"0. 종료    1.핸드폰정보 입력   2. 핸드폰정보 출력"
			case "1":
					
	//				String msg = JOptionPane.showInputDialog("0. 종료    1.핸드폰정보 입력   2. 핸드폰정보 출력");
	//				JOptionPane.showMessageDialog(null, values[0]);//scanner대체할자리,  
					for(int i=0;i<3;i++) {
	//				System.out.println("원하는 정보를 적어주세요(전화번호,이름,회사)");
						String[] values = JOptionPane.showInputDialog("  전화번호,   이름,  회사").split(",");
						service.add(new Phone(values[0],values[1],values[2]));
				}
			break;
			case "2": 
//					System.out.println("핸드폰정보 출력");
					Phone[] phones = service.getPhones();
					String message = "";
					for(int i=0;i<3;i++) {
						message += String.format("귀하께서 입력하신 정보는(전화번호,이름,회사) : %s, %s, %s 입니다.\n",
								phones[i].getPhoneNumber(),
								phones[i].getName(), 
								phones[i].getCompany());
					}
					JOptionPane.showMessageDialog(null, message);
			break;
			case "3":
					for(int i=0;i<3;i++) {
						String[] values = JOptionPane.showInputDialog(" 제품이름 , 이름  , 회사, 휴대가능유무").split(",");
						service.add(new celPhoneAdd(values[0],values[1],values[2],true));//결국은 위에있는 case1에서 복사해서 "new 뒤"와"true"만 조정하면됨.
					}
			break;
			case "4":
					CelPhone[] celPhones = service.getCelPhones();//Cel만 바꿔서 넣어주면 됨.
					message ="";//위에와 공유할수있는 장점이있음
					message += String.format("입력하신 회사 제품은(제품명,이름,회사,휴대가능유무): %s, %s, %s, %s 입니다.",
							celPhones[i].getPhoneNumber(),
							celPhones[i].getName(), 
							celPhones[i].getCompany()
							celPhones[i].g);
				break;
			
			}
		}
	}
}
