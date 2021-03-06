package com.jse.inheritance;

import java.util.Scanner;
import javax.swing.JOptionPane;
import com.jse.util.*;  //*aster = all
import com.jse.util.Constants;
public class Engine {

	public static void main(String[] args) {
		
//		Scanner scanner  = new Scanner(System.in);
		PhoneService service = new PhoneService();
		
		
//		CelPhone celPhone = new CelPhone();
//		System.out.println(service.toString()); 
//		- 여기서 나온답을 보면 골뱅이@123123이런게 나오는데 이런거 (Alt +Shift+s,   >>   toString)오버라이드를 설정해줘야함 
		while(true) {
//			System.out.println("0. 종료    1.핸드폰정보 입력   2. 핸드폰정보 출력");
			switch(JOptionPane.showInputDialog(Constants.MENU)) {
			case "0":  JOptionPane.showInputDialog(" 종료 "); return; //"0. 종료    1.핸드폰정보 입력   2. 핸드폰정보 출력"
			case "1":
					
	//				String msg = JOptionPane.showInputDialog("0. 종료    1.핸드폰정보 입력   2. 핸드폰정보 출력");
	//				JOptionPane.showMessageDialog(null, values[0]);//scanner대체할자리,  
					for(int i=0;i<3;i++) {
	//				System.out.println("원하는 정보를 적어주세요(전화번호,이름,회사)");
						String[] values = JOptionPane.showInputDialog(Constants.PHONE_MENU).split(",");
						service.add(new Phone(values[0],values[1],values[2]));
				}
			break;
			case "2": 
//					System.out.println("핸드폰정보 출력");
					Phone[] phones = service.getPhones();
					String message = "";
					for(int i=0;i<3;i++) {
						message += phones[i].toString();
//								String.format("귀하께서 입력하신 정보는(전화번호,이름,회사) :\n %s\n, %s\n, %s\n 입니다.",
//								phones[i].getPhoneNumber(),
//								phones[i].getName(), 
//								phones[i].getCompany());
					}
					JOptionPane.showMessageDialog(null, message);
			break;
			case "3":
					for(int i=0;i<3;i++) {
						String[] values = JOptionPane.showInputDialog(Constants.CELPHONE_MENU).split(",");
						service.add(new CelPhone(values[0],values[1],values[2],true));//결국은 위에있는 case1에서 복사해서 "new 뒤"와"true"만 조정하면됨.
					}
			break;
			case "4":
					CelPhone[] celPhones = service.getCelPhones();//Cel만 바꿔서 넣어주면 됨.
					message ="";//위에와 공유할수있는 장점이있음
					for(int i=0; i<3; i++) {
					message += celPhones[i].toString();
							
//							String.format("입력하신 회사 제품은(제품명,이름,회사,휴대가능유무): %s, %s, %s, %s 입니다.",
//							celPhones[i].getPhoneNumber(),
//							celPhones[i].getName(), 
//							celPhones[i].getCompany(),
//							celPhones[i].getMove());
					}
					JOptionPane.showMessageDialog(null, message);
			break;
			case "5":
					for(int i=0;i<3;i++) {
						String[] values = JOptionPane.showInputDialog(Constants.IPHONE_MENU).split(",");
						service.add(new Iphone(values[0],values[1],values[2],true,values[4]));//결국은 위에있는 case1에서 복사해서 "new 뒤"와"true"만 조정하면됨.
				}
			break;
			case "6":
					Iphone[] iphones = service.getIphones();
					message ="";
					for(int i=0;i<3;i++) {
						message += iphones[i].toString()+"\n";
//								String.format("입력하신 회사 제품은(제품명,이름,회사,휴대가능유무, 검색가능 유무): %s, %s, %s, %s, %s 입니다.\n",
//							iphones[i].getPhoneNumber(),
//							iphones[i].getName(), 
//							iphones[i].getCompany(),
//							iphones[i].getMove(),
//							iphones[i].getSearch());
				}
				JOptionPane.showMessageDialog(null, message);
			break;	
			case "7":
					for(int i=0;i<3;i++) {
					String[] values = JOptionPane.showInputDialog( Constants.GALAXT_NOTE_PHONE_MENU).split(",");
					service.add(new GalaxyNote(values[0],values[1],values[2],true,values[4],values[5]));//결국은 위에있는 case1에서 복사해서 "new 뒤"와"true"만 조정하면됨.
				}
			break;	
			case "8":
					GalaxyNote[] galaxyNotes = service.getGalaxyNotes();
					message ="";
					for(int i=0;i<3;i++) {
					message += galaxyNotes[i].toString()+"\n";
//							String.format("입력하신 회사 제품은(제품명,이름,회사,휴대가능유무, 검색가능 유무, 사이즈): %s\n, %s\n, %s\n, %s, %s, %s 입니다.",
//							galaxyNotes[i].getPhoneNumber(),
//							galaxyNotes[i].getName(), 
//							galaxyNotes[i].getCompany(),
//							galaxyNotes[i].getMove(),
//							galaxyNotes[i].getSearch(),
//							galaxyNotes[i].getBigSize());	
				}
					JOptionPane.showMessageDialog(null, message);
			break;	
			}
		}
	}
}
