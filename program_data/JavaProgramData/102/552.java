package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a = 0;
		int b = 0;
		double[] z = new double[39];
		double[] t = new double[39];
		double c;
		double d;
		String zff = new String(new char[7]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zff = tempVar2.charAt(0);
			}
			if (zff.charAt(0) == 'f')
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					z[a] = Double.parseDouble(tempVar3);
				}
				a++;
			}
			else
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					t[b] = Double.parseDouble(tempVar4);
				}
				b++;
			}
		}
		for (i = 1;i <= b;i++)
		{
			for (j = 0;j < b - i;j++)
			{
				if (t[j] >= t[j + 1])
				{
					c = t[j];
					t[j] = t[j + 1];
					t[j + 1] = c;
				}
			}
		}
		for (i = 1;i <= a;i++)
		{
			for (j = 0;j < a - i;j++)
			{
				if (z[j] >= z[j + 1])
				{
					d = z[j];
					z[j] = z[j + 1];
					z[j + 1] = d;
				}
			}
		}
		for (i = 0;i < b;i++)
		{
			if (i == 0)
			{
				System.out.printf("%.2lf",t[i]);
			}
			else
			{
				System.out.printf(" %.2lf",t[i]);
			}
		}
		for (i = a - 1;i >= 0;i--)
		{
			System.out.printf(" %.2lf",z[i]);
		}
		return 0;
	}

}

