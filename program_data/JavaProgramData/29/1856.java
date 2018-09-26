package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int i;
		int n;
		int m;
		double sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n > 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			sum = 0;
			a = 1;
			b = 2;
			for (i = 1;i <= m;i++)
			{
				sum += (double)(b) / a;
				c = b + a;
				a = b;
				b = c;
			}
			System.out.printf("%.3f\n",sum);
			n--;
		}
	}
}

