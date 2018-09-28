package <missing>;

public class GlobalMembers
{
	//************************************************************
	//*????1000012912_004.cpp                                *
	//*??????												 *
	//*?????2010.12.09                                      *
	//*???????    										 *
	//************************************************************
	public static int Main()
	{
		int n; //n?????m?????
		int m;
		int[] num = new int[200];
		int[] p = num;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (p = num; p < num + n; p++)
		{
			if (p + m >= num + n) //???m????????n?
			{
				p[m - n] = ConsoleInput.readToWhiteSpace(true);
			}
			else
			{
				p[m] = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (p = num; p < num + n - 1; p++)
		{
			System.out.print(p);
			System.out.print(' ');
		}
		System.out.print(p);
		System.out.print("\n");
		return 0;
	}
}

