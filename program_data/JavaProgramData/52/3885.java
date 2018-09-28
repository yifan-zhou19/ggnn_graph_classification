package <missing>;

public class GlobalMembers
{
	/************************************
	 * ????							*
	 *									*
	 *  Created on: 2010-12-14			*
	 *      Author: ??					*
	 ************************************/
	public static void move(tangible.RefObject<Integer> p, int m, int n) //???????????
	{
		int a;
		a = (p.argValue + m - 1); //?????????????a?
		for (int i = m - 1;i > 0;i--)
		{
			*(p.argValue + i) = *(p.argValue + i - 1); //??????????
		}
		p.argValue = a;
	}
	public static int Main()
	{
		int a;
		int b;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int a1 = a;
		int[] num = new int[a1];
		for (int j = 0;j < a;j++)
		{
			num[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		while (b > 0)
		{
			move(num[0], a, b); //??????
			b--;
		}
		System.out.print(num[0]);
		for (int j = 1;j < a;j++)
		{
			System.out.print(" ");
			System.out.print(num[j]);
		}
		return 0;
	}

}

