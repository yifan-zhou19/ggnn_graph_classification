package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int a = 1;
		int b = 2;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int x;
		double[] s = new double[100];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			for (int j = 0;j < x;j++)
			{
				s[i] = s[i] + (double)b / a;
				c = a;
				a = b;
				b = b + c;
			}
			a = 1;
			b = 2;
		}
		for (int h = 0;h < n;h++)
		{
			System.out.printf("%.3lf\n",s[h]);
		}
	}

}

