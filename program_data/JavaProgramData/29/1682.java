package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int n;
		int i;
		int m;
		int b;
		int c;
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
			sum = 0F;
			b = 1;
			c = 1;
			for (a = 1;a <= n;a++)
			{
				b = b + c;
				c = b - c;
				sum = sum + (double)(b) / (double)(c);
			}
			System.out.printf("%.3f\n",sum);
		}
		return 0;
	}
}

