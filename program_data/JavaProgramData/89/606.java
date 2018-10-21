package <missing>;

public class GlobalMembers
{
	//****************************
	//????1000012825         *
	//??????               *
	//???12.10                *
	//?????????         *
	//****************************
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int p;
		int flag = 0;
		int[][] a = new int[100000][2];
		int[] count = new int[100000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; ; i++)
		{
			for (j = 0; j < 2; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			if (a[i][0] == 0 && a[i][1] == 0) //?? 0.0 ?????
			{
				break;
			}
			else
			{
				count[a[i][1]]++; //?????????
			}
		}
		for (k = 0; k <= n - 1; k++)
		{
			if (count[k] >= n - 1) //????????????????????
			{
				for (p = 0; p < n; p++)
				{
					if (a[p][0] == k)
					{
						break;
					}
				}
				if (p == n) //????????
				{
					System.out.print(k);
					System.out.print("\n");
					flag = 1;
				}
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT?FOUND");
			System.out.print("\n");
		}
		return 0;
	}


}

