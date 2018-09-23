package <missing>;

public class GlobalMembers
{
	/*????
	 * divide.cpp
	 *
	 *  Created on: 2011-12-1
	 *      Author: WJ
	 */

	public static int sum = 1; //?????1?????
	public static void f(int b,int a) //??????????????
	{
		for (int i = b;i <= a;i++)
		{ //????????
		if ((a % i == 0) && (i <= a / i))
		{
			sum = sum + 1; //???1
			f(i, a / i); //???????????
		}
		if (i > a / i)
		{
			break;
		}
		}
	}
	public static int Main()
	{
		int a;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 0)
		{ //??????
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = 1;
			f(2, a); //????
			System.out.print(sum);
			System.out.print("\n");
			n--;
		}
		return 0;
	}

}

