package <missing>;

public class GlobalMembers
{
	/*
	 * huiwen_zichuan.cpp
	 *
	 *  Created on: 2014-1-4
	 *      Author: ??
	 */
	public static int Main()
	{
		String a = new String(new char[600]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int n;
		int i;
		int j;
		int l = a.length();
		for (n = 2;n <= l;n++)
		{
			for (i = 0;i < l - 1;i++)
			{
				if (i + n - 1 >= l)
				{
					break;
				}
				for (j = 0;i + j < i + n - 1 - j;j++)
				{
					if (a.charAt(i + j) != a.charAt(i + n - 1 - j))
					{
						break;
					}
				}
				if (a.charAt(i + n - 1 - j) == a.charAt(i + j) && (i + n - 1 - j) - (i + j) < 3)
				{
					for (int ii = i;ii <= i + n - 1;ii++)
					{
						System.out.print(a.charAt(ii));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

