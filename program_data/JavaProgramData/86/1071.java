package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012739_final_7.cpp
	 *
	 *  Created on: 2010-12-17
	 *      Author: ???
	 *		Title: 1049 ????
	 */



	public static int Main()
	{
		int time; //?????????
		int cnt;
		int i;
		int j;
		int useless;
		int n;
		int icnt;
		int pausecnt;
		int trial;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			icnt = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (icnt == 0) //??0????60????????
			{
				System.out.print(60);
				System.out.print("\n");
				continue;
			}
			pausecnt = 0; //???????
			time = 0; //???????
			cnt = 0; //???????
			trial = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			do
			{
				if (trial == cnt) //???????
				{
					pausecnt++; //??????
					time += 3; //???3
					if (time >= 60) //???????
					{
						break;
					}
					if (pausecnt != icnt) //?????????????
					{
						trial = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					}
				}
				time++; //????
				cnt++; //????
			} while (time < 60);
			System.out.print(cnt);
			System.out.print("\n");
			for (j = pausecnt;j < icnt - 1;j++) //????????
			{
				useless = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		return 0;
	}
}

