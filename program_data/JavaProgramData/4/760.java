package <missing>;

public class GlobalMembers
{
	/*
	 * erweishuzuzuoshangyouxiabianli.cpp
	 *
	 *  Created on: 2012-12-13
	 *      Author: Justin
	 */

	public static int Main()
	{
		int[][] a = new int[100][100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int raw;
		int col;
		raw = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (p = a[0];p < a[0] + raw * col;p++)
		{
			*p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		if (col != 1)
		{
		System.out.print(a[0][0]);
		System.out.print("\n");
		for (p = a[0] + 1;p < a[0] + col - 1;p++)
		{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			int * q;
			q = p;
			do
			{
				System.out.print(q);
				System.out.print("\n");
				q += col - 1;
			}while ((q + 1 - a[0]) % col != 0 && q < a[0] + raw * col);
		}

		for (p = a[0] + col - 1;p < a[0] + col * raw;p += col)
		{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
				int * q;
				q = p;
				do
				{
					System.out.print(q);
					System.out.print("\n");
					q += col - 1;
				}while ((q + 1 - a[0]) % col != 0 && q < a[0] + raw * col);
		}
		}
		if (col == 1)
		{
			for (p = a[0];p < a[0] + raw * col;p++)
			{
					System.out.print(p);
					System.out.print("\n");
			}
		}
		return 0;
	}
}

