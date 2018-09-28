package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int[] shuzu = new int[100];
		int i;
		int j;
		double x;
		double s;
		double e;
		double a;
		double b;
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
				shuzu[i] = Integer.parseInt(tempVar2);
			}
		}

		for (i = 0;i < m;i++)
		{
			s = 0;
			a = 1;
			b = 2;
			x = b / a;
			for (j = 0;j < shuzu[i];j++)
			{
				s = s + x;
				e = a;
				a = b;
				b = e + b;
				x = b / a;
			}
			System.out.printf("%.3lf\n",s);
		}
		return 0;
	}
}

