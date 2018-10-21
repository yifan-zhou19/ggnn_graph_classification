package <missing>;

public class GlobalMembers
{
	public static int layout(int m,int n)
	{
			int means;
			int i;
			means = 0;
			if (n == 1)
			{
				means = 1;
			}
			else
			{
				if (m >= n)
				{
					m -= n;
					for (i = 1;i <= n;i++)
					{
						means += layout(m, i);
					}
					n--;
				}
				else
				{
					n--;
				}
			}
			return means;
	}

	public static int Main()
	{
		int t;
		int[] M = new int[21];
		int[] N = new int[21];
		int[] K = new int[21];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (j = 0;j < t;j++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 M[j] = Integer.parseInt(tempVar2);
						 }
						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 N[j] = Integer.parseInt(tempVar3);
						 }
						 K[j] = layout(M[j] + N[j], N[j]);
		}
		for (j = 0;j < t;j++)
		{
						 System.out.printf("%d\n",K[j]);
		}
		return 0;
	}
}

