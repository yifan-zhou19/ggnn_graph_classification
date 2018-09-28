package <missing>;

public class GlobalMembers
{
	/*
	 * fx01.cpp
	 *
	 *  Created on: 2013-1-11
	 *      Author: SONY
	 */
	public static int Main()
	{
		String str = new String(new char[501]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len;
		len = str.length();
		int i;
		int j;
		for (i = 2;i <= len;i++)
		{
			for (j = 0;j <= len - i;j++)
			{
				int m;
				int k;
				int t;
				int b = 0;
					k = j;
					t = j + i - 1;
					for (m = 1;m <= i / 2;m++)
					{
						if (str.charAt(k) == str.charAt(t))
						{
							b++;
							k++;
							t--;
						}
						else
						{
							break;
						}
					}
					if (b == i / 2)
					{
						for (m = j;m <= j + i - 1;m++)
						{
							System.out.print(str.charAt(m));
						}
						System.out.print("\n");
					}
					b = 0;
			}
		}
		return 0;
	}

}

