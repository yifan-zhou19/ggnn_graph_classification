package <missing>;

public class GlobalMembers
{
	/*
	 * temperary.cpp
	 *
	 *  Created on: 2011-12-25
	 *      Author: ???
	 */

	public static void sort(String a, int n)
	{ //?asc2?????
		int i;
		int j;
		char t;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[i].compareTo(a[j]) > 0)
				{
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
	}
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int l1 = a.length();
		int l2 = b.length();
		if (l1 != l2)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
			sort(a, l1);
			sort(b, l2); //?????????
			if (strcmp(a,b) == 0)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
		}
		return 0;
	}


}

