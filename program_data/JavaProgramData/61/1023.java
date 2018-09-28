package <missing>;

public class GlobalMembers
{
	/*
	 * phoenix3+1.cpp
	 *Author: ???
	 *  Created on: 2013-9-28
	 *    ??????
	 */
	public static int Main()
	{
		int i;
		int n;
		int c;
		int[] a = new int[20];
		int[] b = new int[20];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (i = 0;i < n;i++)
		 {
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		 }
		 for (i = 0;i < 20;i++)
		 {
			 if ((i == 0) || (i == 1))
			 {
				 b[i] = 1;
			 }
			 else
			 {
				 b[i] = b[i - 1] + b[i - 2];
			 }
		 }
		 for (i = 0;i < n;i++)
		 {
			 c = a[i];
			 System.out.print(b[c - 1]);
			 System.out.print("\n");
		 }

		 return 0;
	}








}

