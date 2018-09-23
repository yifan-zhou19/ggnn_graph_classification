package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		double[] b = new double[50];
		double[] a = new double[50];
		double m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String s = new String(new char[10]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m = Double.parseDouble(tempVar3);
			}
			if (strcmp(s,"male") == 0)
			{
				a[j] = m;
				j++;
			}
			else
			{
				b[k] = m;
				k++;
			}
		}
		int c;
		for (c = 1;c <= j;c++)
		{
			for (i = 0;i < j - c;i++)
			{
				if (a[i] > a[i + 1])
				{
					m = a[i];
					a[i] = a[i + 1];
					a[i + 1] = m;
				}
			}
		}
		for (c = 1;c <= k;c++)
		{
			for (i = 0;i < k - c;i++)
			{
				if (b[i] < b[i + 1])
				{
					m = b[i];
					b[i] = b[i + 1];
					b[i + 1] = m;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%.2lf ",a[i]);
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%.2lf ",b[i]);
		}
		System.out.printf("%.2lf",b[k - 1]);
		return 0;
	}



}

