package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int[] n = new int[100];
		int i;
		int str;
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
			double sum = 0;
			int p = 1;
			int q = 2;
			int t = 0;
			while (t < n[i])
			{
				sum += (double)q / p;
				str = q;
				q = p + q;
				p = str;
				t++;
			}
			System.out.printf("%.3lf\n",sum);
		}
		return 0;
	}

}

