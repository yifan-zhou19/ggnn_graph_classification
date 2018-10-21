package <missing>;

public class GlobalMembers
{
	/*
	 * liangbei.cpp
	 *
	 *  Created on: 2010-11-12
	 *      Author: ??
	 */

	public static int Main()
	{
		int[] a = new int[20];
		int i;
		int n = 0;
		int num = 0;
		int j;
		while (true)
		{
			n = 0; //??
			num = 0;
			for (i = 0;i < 20;i++) //??????
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i] == 0) //????0???????
				{
					break;
				}
				if (a[i] == -1) //????-1???????
				{
					return 0;
				}
				n++; //?????????
			}
			for (i = 0;i < n;i++)
			{
				for (j = i + 1;j < n;j++)
				{
					if (a[i] == 2 * a[j] || 2 * a[i] == a[j]) //???????????????
					{
						num++; //???????
					}
				}
			}
			System.out.print(num);
			System.out.print("\n");
		}
		return 0;

	}

}

