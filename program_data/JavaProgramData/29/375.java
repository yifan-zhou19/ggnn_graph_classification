package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[] d = new int[100];
		int[] c = new int[100];
		float sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			d[0] = 2;
			c[0] = 1;
			sum = (float)d[0] / c[0];
			for (j = 1;j < n;j++)
			{
				d[j] = d[j - 1] + c[j - 1];
				c[j] = d[j - 1];
				sum += (float)d[j] / c[j];
			}
			System.out.printf("%.3f\n",sum);
		}
		return 0;
	}
}

