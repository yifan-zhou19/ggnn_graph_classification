package <missing>;

public class GlobalMembers
{
	/*
	 * ????apple.cpp
	 * ???00948343_??
	 * ?????2012/11/19
	 * ???????
	 */



	public static int fenjie(int a, int start)
	{
		int i;
		int sum = 1;
		if (start == a)
		{
			sum = 1;
		}
		else
		{
			for (i = start;i <= Math.sqrt(a);i++)
			{
				if (a % i == 0)
				{
					sum = sum + fenjie(a / i, i);
				}
			}
		}
		return sum;
	}

	public static int Main()
	{
		int n;
		int i;
		int integ;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			integ = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(fenjie(integ, 2));
			System.out.print("\n");
		}
		return 0;
	}

}

