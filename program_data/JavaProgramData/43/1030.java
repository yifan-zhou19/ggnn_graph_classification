package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int[] a = new int[20000];
		int i;
		int j;
		int sign = 0;

		for (i = 1;i <= 20000;i++)
		{
			a[i] = -10000;
		}
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				m = Integer.parseInt(tempVar);
			}
		for (i = 2;i <= m;i++)
		{
			{
				for (j = 2;j < i;j++)
				{
					if (i % j == 0)
					{
					sign += 1;
					}
				}
		}
				if (sign > 0)
				{
					sign = 0;
				}
				else
				{
					a[i] = i;
				}
		}
		for (i = 2;i < m;i++)
		{
			for (j = i;j < m;j++)
			{
				if (a[j] + a[i] == m)
				{
					System.out.printf("%d %d\n",i,j);
				}
			}
		}
		return 0;
	}


}

