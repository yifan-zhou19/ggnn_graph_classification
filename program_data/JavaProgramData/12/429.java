package <missing>;

public class GlobalMembers
{
	/*
	 * ????.cpp
	 *
	 *  Created on: 2010-11-17
	 *      Author: IBM
	 */


	public static int Main()
	{
		int n; //n?2?????
		int k;
		int i;
		int j;
		int[] a = new int[16];
		while ((a[0] != 0 && a[0] != -1 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{ //?????????-1
			k = 1; //????????
			n = 0;
			while ((a[k] != 0 && a[k] != 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0) //???????0
			{
				k++; //??????1
			}
			for (i = 0;i < k - 1;i++)
			{
				for (j = i + 1;j < k;j++)
				{
					if ((a[i] == a[j] * 2) || (a[j] == a[i] * 2)) //??????????2??1/2
					{
						n++; //2?????1
					}
				}
			}
			System.out.print(n);
			System.out.print("\n");
		}
		return 0;
	}


}

