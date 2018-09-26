package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		i = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n)
		{
			int x;
			int k;
			float sum;
			float c;
			float a;
			float b;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			a = 1F;
			b = 2F;
			k = 1;
			sum = 0F;
			c = 2F;
			while (k <= x)
			{
				sum = sum + c;
				b = a + b;
				a = -a + b;
				c = b / a;
				k = k + 1;
			}
			System.out.printf("%.3f\n", sum);
			i = i + 1;
		}
		return 0;
	}
}

