package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int[] n = new int[1000];
		double t;
		double k;
		double l;
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
				n[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < m;i++)
		{
			t = 0;
			k = 2;
			l = 1;
			for (j = 0;j < n[i];j++)
			{
				t = t + k / l;
				k = k + l;
				l = k - l;

			}
			System.out.printf("%.3lf\n",t);
		}
		return 0;
	}

}

