package <missing>;

public class GlobalMembers
{
	/*
	 * huiwen.cpp
	 *
	 *  Created on: 2011-12-18
	 *      Author: admin
	 */
	public static int Main()
	{
		int i;
		int begin;
		int begin1;
		int end1;
		int flag;
		int len;
		int length;
		String a = new String(new char[501]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		length = a.length();
		for (len = 2;len <= length;len++)
		{ //???????
			for (begin = 0;begin <= length - len;begin++)
			{ //??????
				begin1 = begin;
				end1 = begin + len - 1;
				flag = 1;
				while (begin1 < end1)
				{ //?????????????
					if (a.charAt(begin1) != a.charAt(end1))
					{
						flag = 0;
						break;
					}
					begin1++;
					end1--;
				}
				if (flag != 0)
				{
					for (i = begin;i <= begin + len - 1;i++)
					{ //??????
						System.out.print(a.charAt(i));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

