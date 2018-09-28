package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int flag = 0;
		int[][] a = new int[8][8];
		int max;
		int[] c = new int[2];
		int min;

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
			max = a[i][0];
			c[0] = i;
			c[1] = 0;
			for (j = 1;j < n;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					c[1] = j;
				}
			}

			min = max;
			j = c[1];
			for (k = 0;k < m;k++)
			{
				if (a[k][j] < min)
				{
				min = a[k][j];
				c[0] = k;
				}
			}

			if (c[0] == i && c[1] == j)
			{
				System.out.printf("%d+%d",c[0],c[1]);
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("No");
		}




	}
}

