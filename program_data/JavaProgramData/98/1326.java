package <missing>;

public class GlobalMembers
{
	/*
	 * ????.cpp
	 *  Created on: 2012-12-9
	 *  Author: ???
	 */
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String a = new String(new char[50]);
		String p = a;
		for (int i = 0, num = 0; i < n; i++)
		{ //num??????????????
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			m = a.length(); //???????
			if (num == 0)
			{ //??????????
				for (int j = 0; j < m; j++)
				{ //???
					System.out.print((p.Substring(j)));
				}
				num += m; //num??m
			}
			else if (num + m + 1 <= 80)
			{ //???????????80
				System.out.print(' ');
				for (int j = 0; j < m; j++)
				{ //????????
					System.out.print((p.Substring(j)));
				}
				num += m + 1; //num=num+m+1
			}
			else
			{ //??????????80
				System.out.print("\n");
				for (int j = 0; j < m; j++)
				{ //???????
					System.out.print((p.Substring(j)));
				}
				num = m; //num??m
			}
		}
		return 0;
	}

}

