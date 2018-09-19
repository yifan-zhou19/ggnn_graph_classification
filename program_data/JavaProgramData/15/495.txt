package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] shumu = new int[1000][1000];
		int b;
		int n;
		int a;
		int d;
		int e;
		int f;
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 0;m < n;m++)
		{
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					shumu[m][i] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (m = 1;m < n - 1;m++)
		{
			for (i = 1;i < n - 1;i++)
			{
				if (shumu[m][i] == 0)
				{
					a = m;
					d = i;
				}
			}
		}
		for (m = n - 1;m > 0;m--)
		{
			for (i = n - 1;i > 0;i--)
			{
				if (shumu[m][i] == 0)
				{
				e = m;
				f = i;
				}
			}
		}
		b = (e - a + 1) * (f - d + 1);
		System.out.printf("%d",b);
		return 0;



	}
}

