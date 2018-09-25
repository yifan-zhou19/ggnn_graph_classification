package <missing>;

public class GlobalMembers
{
	/*
	 * 11.161.cpp
	 *
	 *  Created on: 2012-11-4
	 *      Author: ???
	 */
	public static int Main()
	{
		int[] a = new int[500]; //????????
		int[] b = new int[500];
		int i;
		int k = 0;
		int j;
		int m;
		int n;
		int t;
		int c;
		int d;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 0;j < n;j++) //?a????????b????
		{
			if (a[j] % 2 == 1)
			{
				b[k] = a[j];
				k++;
			}
		}
		for (m = 0;m < k - 1;m++) //?b?????
		{
			for (c = 0;c < k - m - 1;c++)
			{
				if (b[c] > b[c + 1])
				{
					t = b[c];
					b[c] = b[c + 1];
					b[c + 1] = t;
				}
			}
		}
		for (d = 0;d < k - 1;d++) //????
		{

			System.out.print(b[d]);
			System.out.print(",");
		}

			System.out.print(b[k - 1]);

	}


}

