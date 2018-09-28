package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int p;
		int q;
		int t;
		int i;
		int j;
		float sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			j = 1;
			sum = 0F;
			p = 2;
			q = 1;
			do
			{
				sum = sum + (float)p / q;
				t = p;
				p = p + q;
				q = t;
				j = j + 1;
			} while (j <= n);
			System.out.printf("%.3lf\n",sum);
		}
	}

}

