package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int i;
		int j;
		int[] k = new int[8];
		int[] m = new int[8];
		int[][] c = new int[8][8];
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
			}
		}
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b - 1;j++)
			{
				if (c[i][j] < c[i][j + 1])
				{
				k[i] = j + 1;
				}
			}
		}
			for (j = 0;j < b;j++)
			{
			for (i = 0;i < a - 1;i++)
			{
				if (c[i][j] > c[i + 1][j])
				{
				m[j] = i + 1;
				}
			}
			}
			for (i = 0;i <= a;i++)
			{
				if (i == a)
				{
				System.out.print("No");
				}
				else if (m[k[i]] == i)
				{
			System.out.printf("%d+%d",i,k[i]);
			break;
				}

			}
	}

}

