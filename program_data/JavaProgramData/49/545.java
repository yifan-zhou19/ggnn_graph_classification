package <missing>;

public class GlobalMembers
{
	/*
	 * huiwenzichuan.cpp
	 *
	 *  Created on: 2011-12-21
	 *      Author: Administrator
	 */
	public static int Main()
	{
		String chuan = new String(new char[500]);
		chuan = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int lenth = chuan.length();
		int i;
		int j;
		for (int k = 1;k < lenth;k++)
		{
			for (i = 0,j = k;j < lenth;i++,j++)
			{
				int begin = i;
				int end = j;
				while (begin < end)
				{
					if (chuan.charAt(begin) != chuan.charAt(end))
					{
						break;
					}
					else
					{
						begin++;
						end--;
					}
				if (begin >= end)
				{
					for (int a = i;a <= j;a++)
					{
						System.out.print(chuan.charAt(a));
					}
					System.out.print("\n");
				}
				}
			}
		}
		return 0;
	}
}

