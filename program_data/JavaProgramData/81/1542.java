package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int hanshu = new int(int s[5][5],int n,int m);
			int[][] a = new int[5][5];
			int[][] b = new int[1][5];
		int n;
		int m;
		int i;
		int j;
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}
			if (hanshu(a, n, m) == 0)
			{
				System.out.print("error\n");
			}
			if (hanshu(a, n, m) == 1)
			{
				for (j = 0;j <= 4;j++)
				{
				b[0][j] = a[n][j];
				a[n][j] = a[m][j];
				a[m][j] = b[0][j];
				}
			  for (i = 0;i <= 4;i++)
			  {
					System.out.printf("%d %d %d %d %d\n",a[i][0],a[i][1],a[i][2],a[i][3],a[i][4]);
			  }

			}
	}

	public static int hanshu(int[][] a, int n, int m)
	{
		int z;
		if (n >= 5 || m >= 5)
		{
			z = 0;
		}
		if (n < 5 && m < 5)
		{
			z = 1;
		}
			return (z);
	}

}

