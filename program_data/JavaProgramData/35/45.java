package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int a;
		int b;
		int[][] c = new int[8][8];
		int[][] d = new int[8][8];
		int[] e = new int[8];
		int temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					c[i][j] = Integer.parseInt(tempVar3);
				}
				d[i][j] = c[i][j];
			}
		}
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b - 1;j++)
			{
				for (k = 0;k < b - j - 1;k++)
				{
				   if (c[i][k] > c[i][k + 1])
				   {
					  temp = c[i][k];
					  c[i][k] = c[i][k + 1];
					  c[i][k + 1] = temp;
				   }
				}
			}
			for (j = 0;j < b;j++)
			{
				if (d[i][j] == c[i][b - 1])
				{
					e[i] = j;
				}
			}
		}
		for (i = 0;i < a;i++)
		{
			k = 0;
			for (j = 0;j < a;j++)
			{
				if (c[i][b - 1] > d[j][e[i]])
				{
					k = 1;
				}
			}
			if (k == 0)
			{
				System.out.printf("%d+%d",i,e[i]);
				break;
			}
		}
		if (k == 1)
		{
			System.out.print("No");
		}
	}
}

