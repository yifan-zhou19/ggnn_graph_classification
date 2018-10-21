package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] z = new int[1000];
		int[] m = new int[1000];
		int k;
		double sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < k;j++)
			{
				z[0] = 2;
				z[1] = 3;
				m[0] = 1;
				m[1] = 2;
				if (j > 1)
				{
					z[j] = z[j - 1] + z[j - 2];
					m[j] = m[j - 1] + m[j - 2];
				}
				sum += ((double)z[j]) / m[j];
			}
			System.out.printf("%.3lf\n",sum);
			sum = 0;
		}
		return 0;
	}
}

