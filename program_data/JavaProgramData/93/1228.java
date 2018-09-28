package <missing>;

public class GlobalMembers
{
	/**
	*@file 5.cpp
	*@author ??? 1300012841
	*@date 2013-09-25
	*@description ??3?5?7????
	*/


	public static int Main()
	{
	int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
	 int x;
	x = 0;
	if (num % 3 == 0)
	{
			System.out.print("3");
			x = 1;
	}
	if (num % 5 == 0)
	{
			if (x == 1)
			{
				System.out.print(" ");
			}
			  System.out.print("5");
			 x = 1;
	}
	if (num % 7 == 0)
	{
			if (x == 1)
			{
				System.out.print(" ");
			}
			System.out.print("7");
	}
	if ((num % 7 == 0 || num % 3 == 0 || num % 5 == 0) == 0)
	{
		System.out.print("n");
		System.out.print("\n");
	}
	else
	{
		System.out.print("\n");
	}
		return 0;
	}
}

