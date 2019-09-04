package routezero.java.training3;

import java.util.Scanner;

public class Marubatsugame {

	public static void main(String[] args) {

		String[][] map = {{"＼︎", "①", "②", "③"},
		{"⑴|", "", "", ""},
		{"⑵|", "", "", ""},
		{"⑶|", "", "", ""}};

		String[] player = {"○|", "×|"};
		String str;
		int x, y, i = 0;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);

		while(flag) {
			System.out.println("プレイヤー:" + player[i % 2]);

			System.out.print("列番号:");
			str = sc.next();
			x = Integer.parseInt(str);

			System.out.print("行番号:");
			str = sc.next();
			y = Integer.parseInt(str);

			map[x][y] = player[i % 2];

			// 入力は1〜3の数字のみ。0は含まない。
			
			for(int a=0; a<4; a++) {
				for(int b=0; b<4; b++) {
					System.out.print(map[a][b]);
				}
				System.out.println();
			}

			if((player[i % 2].equals(map[1][1]) && player[i % 2].equals(map[1][2]) && player[i % 2].equals(map[1][3])) ||
					(player[i % 2].equals(map[2][1]) && player[i % 2].equals(map[2][2]) && player[i % 2].equals(map[2][3])) ||
					(player[i % 2].equals(map[3][1]) && player[i % 2].equals(map[3][2]) && player[i % 2].equals(map[3][3])) ||
					(player[i % 2].equals(map[1][1]) && player[i % 2].equals(map[2][1]) && player[i % 2].equals(map[3][1])) ||
					(player[i % 2].equals(map[1][2]) && player[i % 2].equals(map[2][2]) && player[i % 2].equals(map[3][2])) ||
					(player[i % 2].equals(map[1][3]) && player[i % 2].equals(map[2][3]) && player[i % 2].equals(map[3][3])) ||
					(player[i % 2].equals(map[1][1]) && player[i % 2].equals(map[2][2]) && player[i % 2].equals(map[3][3])) ||
					(player[i % 2].equals(map[1][3]) && player[i % 2].equals(map[2][2]) && player[i % 2].equals(map[3][1]))) {

				flag = false;
				System.out.println(player[i % 2] + "の勝ち");
			}
			i++;
			System.out.println("--------------------next-------------------");
		}

	}

}
