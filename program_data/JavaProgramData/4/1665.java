package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] p = new int[1000][1000];

		int a;
		int b;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
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
					p[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < a + b - 1;i++)
		{
			if (i < b)
			{
				k = 0;
			}
			if (i >= b)
			{
				k = i - b + 1;
			}
			for (j = k;j <= i != 0 && j < a;j++)
			{
				System.out.printf("%d\n",p[j][i - j]);
			}
		}
	}

}

