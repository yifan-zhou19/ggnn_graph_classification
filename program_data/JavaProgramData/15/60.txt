package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int[][] c = new int[100][100];
		int a1;
		int a2;
		int b1;
		int b2;
		int a;
		int b;
		int s;
			for (i = 0;i < n;i++)
			{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					c[i][j] = Integer.parseInt(tempVar2);
				}
			}
			}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (c[i][j] == 0)
				{
					a1 = i;
					b1 = j;
				}
			}
		}
		for (i = n - 1;i >= 0;i--)
		{
			for (j = n - 1;j >= 0;j--)
			{
				if (c[i][j] == 0)
				{
				 a2 = i;
				 b2 = j;
				}
			}
		}
		a = a1 - a2 - 1;
		b = b1 - b2 - 1;
		s = a * b;
		System.out.printf("%d",s);
	}
}

