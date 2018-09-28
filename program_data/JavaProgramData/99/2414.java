package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int z = 0;
		int u = 0;
		int m = 0;
		int o = 0;
		int p = 0;
		double h;
		double j;
		double k;
		double l;
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
			if (a[i] < 19)
			{
				u++;
			}
			else if (a[i] < 36)
			{
				m++;
			}
			else if (a[i] < 61)
			{
				o++;
			}
			else
			{
				p++;
			}

			z = n;
		}
		h = (float)u / z * 100;
		j = (float)m / z * 100;
		k = (float)o / z * 100;
		l = (float)p / z * 100;
		System.out.printf("1-18: %.2lf%\n",h);
		System.out.printf("19-35: %.2lf%\n",j);
		System.out.printf("36-60: %.2lf%\n",k);
		System.out.printf("60??: %.2lf%\n",l);
	}
}

