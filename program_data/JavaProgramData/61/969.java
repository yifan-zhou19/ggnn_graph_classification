package <missing>;

public class GlobalMembers
{
	/*
	 * Homework3.5FibonacciSequence.cpp
	 *
	 * ?????????????: ?????????????1????????????2?????
	 * ???????a???????????a??????
	 *  Created on: 2013-10-27
	 *      Author: JuiceHe
	 */
	public static int Main()
	{
	   int[] str = {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	   int[] num = new int[20];
	   int n;
	   int i;
	   for (i = 2;i < 50;i++)
	   {
		   str[i] = str[i - 1] + str[i - 2]; //????????
	   }
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 0;i <= n - 1;i++)
	   {
		   num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   }
	   for (i = 0;i <= n - 1;i++)
	   {
		   System.out.print(str[num[i] - 1]);
		   System.out.print("\n");
	   }

	   return 0;
	}

}

