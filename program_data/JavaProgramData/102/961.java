package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int r;
		int j = 0;
		int k = 0;
		int n;
		double[] a = new double[41];
		double[] b = new double[41];
		String s = new String(new char[10]);
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
				s = tempVar2.charAt(0);
			}
			if (s.length() == 4)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Double.parseDouble(tempVar3);
				}
				j++;
			}
			if (s.length() == 6)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					b[k] = Double.parseDouble(tempVar4);
				}
				k++;
			}
		}
		for (i = j - 1;i > 0;i--)
		{
			for (r = 0;r < i;r++)
			{
				if (a[r + 1] < a[r])
				{
					double tmp;
					tmp = a[r + 1];
					a[r + 1] = a[r];
					a[r] = tmp;
				}
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			for (r = k - 1;r > 0;r--)
			{
				if (b[r - 1] < b[r])
				{
					double tmp;
					tmp = b[r - 1];
					b[r - 1] = b[r];
					b[r] = tmp;
				}
			}
		}
		r = 0;
		for (i = j;i <= (j + k - 1);i++)
		{
			a[i] = b[r];
			r++;
		}
		System.out.printf("%.2lf",a[0]);
		for (i = 1;i <= (j + k - 1);i++)
		{
			System.out.printf(" %.2lf",a[i]);
		}
		return 0;
	}





















}

