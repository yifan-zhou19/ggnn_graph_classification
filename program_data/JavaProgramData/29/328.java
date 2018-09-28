package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int p;
		int q;
		int t;
		float sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0; i < m; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			sum = 0F;
			p = 2;
			q = 1;
			for (j = 0; j < n; j++)
			{
				sum += (float)p / (float)q;
				t = p;
				p = p + q;
				q = t;
			}
			System.out.printf("%.3f\n", sum);
		}
	}
}

