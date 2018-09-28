package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2012-11-25
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int t;
		int i;
		int j = 0;
		int[] b = new int[125];
		String a = new String(new char[100050]);
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= t; i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b, 0, (Integer.SIZE / Byte.SIZE));
			j = 0;

		while (a.charAt(j) != '\0')
		{
			b[a.charAt(j)]++;
			j++;
		}
		j = 0;
		while (a.charAt(j) != '\0')
		{
			if (b[a.charAt(j)] == 1)
			{
				System.out.print(a.charAt(j));
				System.out.print("\n");
				break;
			}
			j++;
		}
		int len = a.length();
		if (j == len)
		{
			System.out.print("no");
			System.out.print("\n");
		}
		}
		return 0;


	}

}

