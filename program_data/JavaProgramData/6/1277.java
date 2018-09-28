package <missing>;

public class GlobalMembers
{
	//******************************************
	//*  ??????????                  *
	//*  ??????                          *
	//*  ?????2011?10?27?              *
	//******************************************
	public static int Main()
	{
		int k;
		int m;
		int n;
		int[][] a = new int[100][100];
		int sum;
		int p;
		int q;
		int i;
		int j;
		int h;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (h = 1;h <= k;h++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p = 0; //p??????????,??????0
			q = 0; //q???????????????
			for (i = 1;i <= m;i++)
			{
				for (j = 1;j <= n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					p = p + a[i][j]; //????
				}
			}
			for (i = 2;i < m;i++)
			{
				for (j = 2;j < n;j++)
				{
					q = q + a[i][j]; //????????
				}
			}
			sum = p - q; //sum??????????
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

