package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[256][256];
		int[] b = new int[256];
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 1;j <= n;j++)
		{
			for (i = j + 1;i <= n;i++)
			{
				if (b[i] <= b[j])
				{
					a[i][j] = 1;
				}
				else
				{
					a[i][j] = 0;
				}
	//			printf("[%d][%d]%d ",i,j,a[i][j]);
			}
	//		printf("\n");
		}
		b[1] = 0;
		j = 1;
		while (j <= n)
		{
			for (i = j + 1;i <= n;i++)
			{
				if (a[i][j] == 1)
				{
					a[i][j] = 1 + b[j];
	//			printf("a[%d][%d]%d ",i,j,a[i][j]);
				}
			}
			j++;
			b[j] = 0;
			for (i = 1;i < j;i++)
			{
				if (b[j] < a[j][i])
				{
					b[j] = a[j][i];
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (b[1] < b[i])
			{
				b[1] = b[i];
			}
		}
		System.out.printf("%d\n",b[1] + 1);
	}



}

