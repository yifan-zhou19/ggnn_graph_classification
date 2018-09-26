package <missing>;

public class GlobalMembers
{
	/*
	 * temperary.cpp
	 *
	 *  Created on: 2011-12-25
	 *      Author: ???
	 */

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 0)
		{
			n--;
			String a = new String(new char[100]);
			String b = new String(new char[100]);
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int l1 = a.length();
			int l2 = b.length();
			int i;
			int[] c = new int[100];
			for (i = 0;i < l2;i++)
			{
				if (a.charAt(l1 - 1 - i) < b.charAt(l2 - 1 - i))
				{
					a.charAt(l1 - 2 - i)--;
					a.charAt(l1 - 1 - i) += 10;
				}
				c[i] = a.charAt(l1 - 1 - i) - b.charAt(l2 - 1 - i);
			}
			for (i = l2;i < l1;i++)
			{
				if (a.charAt(l1 - 1 - i) < '0')
				{
					a.charAt(l1 - 2 - i)--;
					a.charAt(l1 - 1 - i) += 10;
				}
				c[i] = a.charAt(l1 - 1 - i) - 48;
			}
			while (c[i - 1] == 0)
			{
				i--;
			}
			while (i > 0)
			{
				i--;
				System.out.print(c[i]);
			}
					   System.out.print("\n");
		}
		return 0;
	}


}

