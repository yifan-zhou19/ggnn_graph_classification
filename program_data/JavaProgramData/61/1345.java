package <missing>;

public class GlobalMembers
{
	/*
	 * ??????.cpp
	 *
	 *  Created on: 2012-10-4
	 *      Author:LiMingyang
	 *      ???????????????
	 */
	public static int Main()
	{
		int i; //????
		int j;
		int k;
		int n;
		int[] fei = new int[20];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int n1 = n; //?????n1??????
		int[] a = new int[n1]; //?????????????
		int[] b = new int[n1];
		for (i = 0;i < n1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		fei[0] = fei[1] = 1; //???????1,2????1
		for (j = 2;j <= 20;j++)
		{
			fei[j] = fei[j - 1] + fei[j - 2]; //?????????
		}
		b[0] = fei[a[0]]; //b[]??????
		System.out.print(fei[a[0] - 1]);
		for (k = 1;k < n1;k++)
		{
			b[k] = fei[a[k] - 1];
			System.out.print("\n");
			System.out.print(b[k]);
		}
	}
}

