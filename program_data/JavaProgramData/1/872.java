package <missing>;

public class GlobalMembers
{
	public static int chu(int i, int n)
	{
		int j;
		int m;
		int t;
		t = 1;
		m = n;
		for (j = i;j <= Math.sqrt(m);j++)
		{
			if (m % j == 0)
			{

			  t += chu(j, (m / j));
			}
		}
		return t;
	}
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[] sum = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= (n - 1);i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			sum[i] = 0;
			for (j = 2;j <= Math.sqrt(m);j++)
			{
				if (m % j == 0)
				{
					sum[i] += chu(j, m / j);
				}
			}


		}
		for (i = 0;i <= (n - 1);i++)
		{
			System.out.printf("%d\n",sum[i] + 1);
		}
	}
}

