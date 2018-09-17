package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[700]);
		double[] m = new double[700];
		double[] f = new double[700];
		double t;
		int n;
		int i;
		int j = 0;
		int k = 0;
		int ml = 0;
		int fl = 0;
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
				a = tempVar2.charAt(0);
			}
			if (a.charAt(0) == 'm')
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					m[j++] = Double.parseDouble(tempVar3);
				}
			}
			else
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					f[k++] = Double.parseDouble(tempVar4);
				}
			}
		}
		for (k = ml - 1;k > 0;k--)
		{
			for (j = 0;j < k;j++)
			{
				if (m[j] > m[j + 1])
				{
					t = m[j];
					m[j] = m[j + 1];
					m[j + 1] = t;
				}
			}
		}
		for (k = fl - 1;k > 0;k--)
		{
			for (j = 0;j < k;j++)
			{
				if (f[j] < f[j + 1])
				{
					t = f[j];
					f[j] = f[j + 1];
					f[j + 1] = t;
				}
			}
		}
		for (i = 0;i < ml;i++)
		{
			System.out.printf("%.2lf ",m[i]);
		}
		for (i = 0;i < fl - 1;i++)
		{
			System.out.printf("%.2lf ",f[i]);
		}
		System.out.printf("%.2lf",f[fl - 1]);
	}
}

