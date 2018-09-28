package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int k;
		int a;
		int b;
		int[][] s = new int[100][100];
		int sum;
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			for (j = 0;j <= a - 1;j++)
			{
							   for (k = 0;k <= b - 1;k++)
							   {
								   String tempVar4 = ConsoleInput.scanfRead();
								   if (tempVar4 != null)
								   {
									   s[j][k] = Integer.parseInt(tempVar4);
								   }
							   }
			}
			sum = 0;
			for (k = 0;k <= b - 1;k++)
			{
				sum = sum + s[0][k];
			}
			for (j = 1;j <= a - 1;j++)
			{
				sum = sum + s[j][b - 1];
			}
			for (k = 0;k <= b - 2;k++)
			{
				sum = sum + s[a - 1][k];
			}
			for (j = 1;j <= a - 2;j++)
			{
				sum = sum + s[j][0];
			}
			System.out.printf("%d\n", sum);
		}

		return 0;
	}

}

