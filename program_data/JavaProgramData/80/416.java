package <missing>;

public class GlobalMembers
{
	/*
	 * 3.cpp
	 *
	 *  Created on: 2011-1-9
	 *      Author: jsgl
	 */
	public static int Main()
	{
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		int sum = 0;
		int i;

		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = {0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


		if (y1 < y2)
		{
		if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
		{
			a[2] = 29;
		}
		else
		{
			a[2] = 28;
		}
		for (i = m1 + 1;i < 12;i++)
		{
			sum = sum + a[i];
		}
		sum = sum + a[m1] - d1;
		if ((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0))
		{
				a[2] = 29;
		}
		else
		{
			a[2] = 28;
		}
		for (i = 1;i < m2;i++)
		{
			sum = sum + a[i];
		}
		sum = sum + d2;
		for (i = y1 + 1;i < y2;i++)
		{
		if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
		{
			sum = sum + 366;
		}
		else
		{
			sum = sum + 365;
		}
		}
		System.out.print(sum + 1 + 30);
		}
	   if (y1 == y2)
	   {
		   if ((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0))
		   {
					   a[2] = 29;
		   }
			 else
			 {
				 a[2] = 28;
			 }
		   if (m1 == m2)
		   {
			   sum = d2 - d1;
			   System.out.print(sum);
		   }
		   else
		   {
		   for (i = m1 + 1;i < m2;i++)
		   {
			   sum = sum + a[i];
		   }
		   sum = sum + a[m1] - d1 + d2;
		   System.out.print(sum);
		   }
	   }
		return 0;
	}

}

