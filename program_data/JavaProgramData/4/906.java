package <missing>;

public class GlobalMembers
{
	/*
	 * ???5.cpp
	 * Created on: 2012-12-11
	 * Author: ???
	 * ??:??????????
	 */
	public static int Main()
	{
		int n; //????
		int m;
		int i;
		int j;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[n][m]; //????
		int[] p = new int[m]; //????
		p = a; //?P???
		for (i = 0;i < n;i++) //??????
		{
			for (j = 0;j < m;j++)
			{
			  *(p[i] + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		while (k <= m + n - 2) //????
		{
		   for (i = 0;i < n;i++) //??????
		   {
			 for (j = 0;j < m;j++)
			 {
				if (k == i + j) //?????????
				{
					System.out.print((p[i] + j));
					System.out.print("\n");
				}
			 }
		   }
		   k++; //?????1
		}
	return 0; //????
	}

}

