package <missing>;

public class GlobalMembers
{
	/*
	 * 00073.cpp
	 *??????
	 *  Created on: 2011-11-16
	 *      Author: ???
	 */
	public static int Main()
	{ //???
		   int[] a = new int[20];
		   int[] b = new int[20];
		   int x;
		   int y;
		   int i;
		   int j;
		   int n = 1;
		   int m = 1;
		   x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   while (x != 1)
		   {
			   a[n] = x;
			   x = x / 2;
			   n++;
		   }
		   a[n] = 1;
		   while (y != 1)
		   {
					  b[m] = y;
					  y = y / 2;
					  m++;
		   }
		   b[m] = 1;
		   for (i = 1;i <= n;i++)
		   {
			   for (j = 1;j <= m;j++)
			   {
				   if (a[i] == b[j])
				   {
					   System.out.print(a[i]);
					   System.out.print("\n");
					   i = j = 20;
				   }
			   }
		   }
		   return 0;
	}

}

