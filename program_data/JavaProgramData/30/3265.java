package <missing>;

public class GlobalMembers
{
	/*
	 * ?The number has no relative to seven?.cpp
	 *
	 *  Created on: 2010-11-4
	 *      Author: acer
	 */

	public static int Main()
	{
		int Num;
		int i;
		int Sum = 0;
		Num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int exam = int Num; //??????

		for (i = 0;i <= Num;i++) //????
		{
			if (exam(i) != 0)
			{
				Sum += i * i; //????
			}
		}
		System.out.print(Sum);
		return 0;
	}

	public static int exam(int Num) //????
	{
		if (((Num % 10) == 7) || (((Num - Num % 10) / 10) == 7) || (Num % 7 == 0))
		{
			return 0; //??7???7?????0  ????1
		}
		else
		{
			return 1;
		}
	}

}

