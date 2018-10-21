package <missing>;

public class GlobalMembers
{
	/*
	 * duobianxingyouxi3.cpp
	 *
	 *  Created on: 2012-12-6
	 *      Author: w
	 */
	public static int Main()
	{
		String a = new String(new char[500]); //?????
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = 0;
		len = a.length(); //???????
		int i = 0;
		int j = 0;
		int k = 0;
		int x = 0;
		for (i = 2;i <= len;i++)
		{ //?????
			for (j = 0;j < len;j++)
			{ //???????
				x = 0; //???
				if (i % 2 == 0)
				{ //???????
					for (k = j;k <= j + (i / 2) - 1;k++)
					{ //????????
						if (a.charAt(k) != a.charAt(2 * j + i - 1 - k))
						{ //???????????
							x = 1;
							break;
						}
					}
				}
				else
				{ //??????
					for (k = j;k <= j + ((i - 1) / 2) - 1;k++)
					{
						if (a.charAt(k) != a.charAt(2 * j + i - 1 - k))
						{
							x = 1;
							break;
						}
					}
				}
				if (x == 0)
				{
					for (k = j;k <= j + i - 1;k++)
					{ //???????
						System.out.print(a.charAt(k));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

