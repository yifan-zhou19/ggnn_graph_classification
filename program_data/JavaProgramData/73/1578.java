package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] a = new int[5][5];
		int max;
		int min;
		int k = 0;
		int i;
		int j;
		int l;
		int f;
		int g = 1;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}


		for (i = 0;i < 5;i++)
		{
			max = a[i][0];
			for (j = 0;j < 5;j++)
			{
				if (max <= a[i][j])
				{
					max = a[i][j];
					k = j;
				}
			}
			min = a[0][k];
			for (l = 0;l < 5;l++)
			{
				if (min >= a[l][k])
				{
					min = a[l][k];
					f = l;
				}
			}
			if (f == i)
			{
				System.out.printf("%d %d %d",f + 1,k + 1,a[f][k]);
				g = 0;
			}
		}
		if (g != 0)
		{
			System.out.print("not found");
		}
	}


}

