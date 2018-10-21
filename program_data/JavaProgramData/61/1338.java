package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2012-10-8
	 *      Author: Lixurong
	 */



	public static int add(int a)
	{
		 if (a == 1)
		 {
			 return 1;
		 }
		 else if (a == 2)
		 {
			 return 1;
		 }
		 else
		 {
			 return (add(a - 1) + add(a - 2));
		 }
	}

	public static int Main()
	{
		int n; //????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			int a; //????
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a == 1 || a == 2)
			{
				System.out.print(1);
				System.out.print("\n");
				continue;
			}
			System.out.print(add(a));
			System.out.print("\n");
		}
		return 0; //??
	}
}

