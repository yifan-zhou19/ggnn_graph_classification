package <missing>;

public class GlobalMembers
{
	/*
	 * WenziPaiban.cpp
	 *
	 *  Created on: 2012-12-18
	 *      Author: ThinkPad
	 */
	public static int Main()
	{
		int n;
		int i;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[n][40];
		for (i = 0;i < n;i++)
		{
			*(a + i) = ConsoleInput.readToWhiteSpace(true);
		}
		for (i = 0;i < n;i++)
		{
			count = count + String.valueOf(*(a + i)).length() + 1;

			if (count <= 80 && count + String.valueOf(*(a + i + 1)).length() <= 80 && i < n - 1)
			{
				System.out.print(a[i]);
				System.out.print(" ");
			}
			if (count == 81 || count + String.valueOf(*(a + i + 1)).length() > 80 || i == n - 1)
			{
				System.out.print((a + i));
				count = 0;
				System.out.print("\n");
			}
		}

		return 0;

	}

}

