package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 1;
		int p = 1;
		float sum = 0F;
		float m = 1F;
		float q = 2F;
		float k;

		int a;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			while (p <= a)
			{
				sum = (float)sum + (q / m);
				k = q;
				q = q + m;
				m = k;
				p = p++;


			}
			p = 1;
			System.out.printf("%.3f\n",sum);
			m = 1F;
			q = 2F;
	i = i++;
	sum = 0F;
		}
		return 0;

	}

}

