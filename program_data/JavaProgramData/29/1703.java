package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		int k;
		float s;
		float a;
		float b;
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
			a = 1F;
			b = 1F;
			s = 0F;
			for (k = 1;k <= n;k++)
			{
				a = a + b;
				b = a - b;
				s = s + a / b;
			}
			System.out.printf("%.3lf\n",s);
		}

		return 0;
	}
}

