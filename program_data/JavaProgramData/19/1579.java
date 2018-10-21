package <missing>;

public class GlobalMembers
{
	/*
	 * ?????.cpp
	 *
	 *  Created on: 2010-11-7
	 *      Author: acer
	 */

	public static int Main()
	{
		char[][] Data = new char[20][20]; //Data???????  Word_1,Word_2?????????????
		String Word_1 = new String(new char[20]);
		String Word_2 = new String(new char[20]);
		int i;
		int t;

		int get_data = char Data[20][20]; //????+????
		t = get_data(Data);
		Word_1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		Word_2 = ConsoleInput.readToWhiteSpace(true).charAt(0);

		if (strcmp(Data[0],Word_1) == 0) //???????????????????????
		{
			Data[0] = Word_2;
		}
		System.out.print(Data[0]);
		for (i = 1;i < t;i++)
		{
			if (strcmp(Data[i],Word_1) == 0)
			{
				Data[i] = Word_2;
			}
			System.out.print(' ');
			System.out.print(Data[i]);
		}
		return 0;
	}
	public static int get_data(String[] Data)
	{
		int i = 0;
		int j = 0;
		char c;
		while ((c = System.in.read()) != '\n') //??????
		{
			if (c == ' ') //?????? ??????????????????????????????????????
			{
				Data[i][j] = '\0';
				i++;
				j = 0;
				continue;
			}
			Data[i][j] = c;
			j++;
		}
		Data[i][j] = '\0';
		return i + 1; //????????
	}

}

