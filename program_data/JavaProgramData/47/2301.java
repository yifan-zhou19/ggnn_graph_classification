package <missing>;

public class GlobalMembers
{
	/*
	 * 12.10.10b.cpp
	 *  Created on: 2012-10-10
	 *      Author: ???
	 *      ???????
	 */
	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[100];
		int i = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = n;
		while (n-- != 0)
		{
				i = i + 1;
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		while (m-- != 0)
		{
			   if (m != 0)
			   {
			   System.out.print(a[i]);
			   System.out.print(' ');
			   i = i - 1;
			   }
		   else
		   {
			   System.out.print(a[1]);
		   }
		}
	return 0;
	}
}

