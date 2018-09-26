package <missing>;

public class GlobalMembers
{
	public static int m; // wide variable in front of all the functions
	public static int n;

	public static char cmin(int[][] a, char i, char k)
	{
		char l;
		for (l = 0;l < m;l++)
		{
			if (l == i)
			{
				continue;
			}
			else if (a[l][k] < a[i][k])
			{
				return (0);
			}
		}
		return (1);
	}


	public static void Main()
	{
		char i;
		char j;
		char k;
		char flag = 0;
		int[][] a = new int[N][N];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (i = 0;i < m;i++)
		{
			for (k = 0,j = 0;j < n;j++)
			{
				if (a[i][j] > a[i][k])
				{
					k = j;
				}
			}

			if (cmin(a, i, k) != 0)
			{
				flag = 1;
				System.out.printf("%d+%d",i,k);
				return;
			}
		}
		if (flag == 0)
		{
			System.out.print("No");
		}
	}



}

