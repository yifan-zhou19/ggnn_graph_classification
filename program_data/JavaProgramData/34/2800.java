package <missing>;

public class GlobalMembers
{
	/*
	 * qmfx03.cpp
	 *
	 *  Created on: 2011-1-1
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			if (n == 1)
			{
				System.out.print("End");
				System.out.print("\n");
				break;
			}
			if (n != 1 && n % 2 == 1)
			{
				System.out.print(n);
				System.out.print("*3+1=");
				System.out.print(n * 3 + 1);
				System.out.print("\n");
				n = n * 3 + 1;
			}
			if (n % 2 == 0)
			{
				System.out.print(n);
				System.out.print("/2=");
				System.out.print(n / 2);
				System.out.print("\n");
				n = n / 2;
			}
			if (n == 1)
			{
				System.out.print("End");
				System.out.print("\n");
				break;
			}
		}
		return 0;
	}

}

