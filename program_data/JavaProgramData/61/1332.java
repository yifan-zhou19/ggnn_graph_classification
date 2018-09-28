package <missing>;

public class GlobalMembers
{
	/*
	 * 8.cpp
	 *??????
	 *  Created on: 2012-10-15
	 *      Author: ???
	*/
	public static int Main()
	{
		int n; //????
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++) //??for??
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int x1 = 1;
			int x2 = 1;
			int t;
			for (int k = 2;k < a;k++) //??for??
			{
				t = x2;
				x2 = x2 + x1;
				x1 = t; //?????????????????
			}
			System.out.print(x2);
			System.out.print("\n");
		}
	}

}

