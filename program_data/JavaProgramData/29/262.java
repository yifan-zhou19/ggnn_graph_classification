package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[] a = new int[1000];
		int i;
		int j;
		int k;
		int o = 0;
		int p = 1;
		double b = 1;
		double c = 2;
		double w = 3;
		double[] s = new double[100];
		double y = 0;
		double[] e = new double[100];
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		do
		{
			s[o] = 1;
			o++;
		} while (o == 0);
		do
		{
			s[p] = 2;
			p++;
		} while (p == 1);
		for (i = 0;i < 100;i++)
		{
			e[i] = 0;
		}
		for (k = 2;k < 100;k++)
		{
			s[k] = s[k - 1] + s[k - 2];
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == 1)
			{
				System.out.printf("%.3lf\n",(double)c / b);
			}
			if (a[i] == 2)
			{
				e[i] = c / b + w / c;
				System.out.printf("%.3lf\n",e[i]);
			}
			if (a[i] > 2)
			{
				for (j = 0;j < a[i];j++)
				{
					e[i] += s[j + 1] / s[j];
				}
				System.out.printf("%.3lf\n",e[i]);
			}
		}
	}

}

