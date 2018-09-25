package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		int[][] C = new int[1000][1000];
		int n;
		int s;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					(C[i][j]) = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			int sum = 0;
			for (j = 0;j < n;j++)
			{
				if (C[i][j] == 0)
				{
					sum = sum + 1;
				}

			if (sum > 2)
			{
				a = sum;
			}
			}
		}
		for (j = 0;j < n;j++)
		{
			int um = 0;
			for (i = 0;i < n;i++)
			{
				if (C[i][j] == 0)
				{
				um = um + 1;
				}

			if (um > 2)
			{
				b = um;
			}
			}
		}

		s = (a - 2) * (b - 2);
		System.out.printf("%d\n",s);
	}


}

