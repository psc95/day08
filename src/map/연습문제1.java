package map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class 연습문제1 {

	public static void main(String[] args)   {
		Scanner input = new Scanner(System.in);
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		int num = 0;
		String menu = null, price = null;

		while (true) {
			System.out.println("1.메뉴 등록");
			System.out.println("2.메뉴별 가격 보기");
			System.out.println("3.종 료");
			System.out.println(">>>");
			num = input.nextInt();

			switch (num) {
			case 1:
				System.out.println("등록할 메뉴를 입력해 주세요: ");
				menu = input.next();
				if (map.containsKey(menu) == false) {
					System.out.println("가격 입력 :");
					price = input.next();
					map.put(menu, price);
					System.out.println(menu + "이등록 되었습니다.");
				} else {
					System.out.println("이미 등록된 메뉴입니다");
				}
				break;

			case 2:

				Iterator<String> it = map.keySet().iterator();
				while (it.hasNext()) {

					String k = it.next();
					System.out.println(k + " : " + map.get(k));
				}

				int innerWhileSwitch = 0;
				while (innerWhileSwitch == 0) {
					System.out.println("1.수정 2.삭제 3.나가기");
					System.out.println(">>>");
					int choise = input.nextInt();
					if (choise == 1) {
						System.out.println("수정할 메뉴이름 : ");
						menu = input.next();
						if (map.containsKey(menu)) {
							System.out.println("수정할 가격 :");
							price = input.next();
							System.out.println(map.get(menu) + "=>" + price);
							System.out.println("변경됐습니다");
							map.replace(menu, price);
						} else {
							System.out.println("메뉴가 없습니다");
						}
					}

					if (choise == 2) {
						System.out.println("삭제할 메뉴 이름 : ");
						menu = input.next();
						if (map.containsKey(menu)) {
							map.remove(menu);
							System.out.println(menu + "이 삭제 됐습니다");
						} else {
							System.out.println("없는 메뉴입니다");
						}
					}

					if (choise == 3) {
						innerWhileSwitch++;
					}
				}
				break;
			case 3:
				System.out.println("종료합니다!!!");
				input.close();
				return;
			}
		}

	}
}
