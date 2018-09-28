package <missing>;

public class GlobalMembers
{
	/*
	 * 1204.cpp
	 *
	 *  Created on: 2012-12-4
	 *      Author: wangyinzhi
	 */
	public static int Main()
	{
		String a = new String(new char[500]);
		int i;
		int j;
		int k;
		int t;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 2;i <= a.length();i++)
		{ //?????
			for (j = i - 1;j < a.length();j++)
			{ //????
				for (k = 0;k < i / 2;k++)
				{
					if (a.charAt(j - k) != a.charAt(j - i + k + 1)) //????
					{
						break;
					}
				}
				if (k == i / 2)
				{
					for (t = 0;t < i;t++)
					{
						System.out.print(a.charAt(j - i + t + 1));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

