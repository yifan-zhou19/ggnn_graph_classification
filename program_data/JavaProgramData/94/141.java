package <missing>;

public class GlobalMembers
{
	/********************************************
	 * ??????								*
	 *											*
	 *  Created on: 2010-12-24					*
	 *      Author: ??							*
	 ********************************************/
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int N = n;
		int[] a = new int[N]; //???????????????????????????
		int[] b = new int[N];
		int i;
		int j;
		int k = 0;
		int h;
		for (i = 0;i < n;i++) //??????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] % 2 == 1) //????
			{
				b[k] = a[i];
				k++;
			}
		}
		for (i = 1;i < k;i++) //?????????
		{
			for (j = 0;j < k - i;j++)
			{
				if (b[j] >= b[j + 1])
				{
					h = b[j];
					b[j] = b[j + 1];
					b[j + 1] = h;
				}
			}
		}
		System.out.print(b[0]);
		for (i = 1;i < k;i++)
		{
			System.out.print(",");
			System.out.print(b[i]);
		}
		return 0;
	}

}

