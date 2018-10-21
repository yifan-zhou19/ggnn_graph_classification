package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[300];
		int[] b = new int[300];
		int i;
		int p;
		int k;
		int j = 1;
		int q;
		double s = 0;
		double m = 0;
		double t;
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
				s = s + a[i];
		}
		s = s / n;
		for (i = 0;i < n;i++)
		{
			t = Math.abs(a[i] - s);
			if (t > m)
			{
				m = t;
				k = i;
				p = 1;
			}
			else if (Math.abs(t - m) <= 1e-6)
			{
				p++;
			}
		}
		b[0] = a[k];
		if (p == 1)
		{
			System.out.printf("%d",a[k]);
		}
		else
		{
			for (i = k + 1;i < n;i++)
			{
				if (Math.abs(Math.abs(a[i] - s) - m) <= 1e-6)
				{
					b[j] = a[i];
					j++;
				}
			}
			for (j = 0;j < p;j++)
			{
				q = j;
				for (i = j + 1;i < p;i++)
				{
					if (b[q] > b[j])
					{
						q = i;
					}
				}
				b[j] = b[q];
			}
			for (j = 0;j < p;j++)
			{
				System.out.printf("%d",b[j]);
				if (j < p - 1)
				{
					System.out.print(",");
				}
			}
		}
	}
}

