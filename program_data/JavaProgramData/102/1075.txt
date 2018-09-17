package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		int h;
		double[] sz = new double[50];
		double[] a = new double[50];
		double[] b = new double[50];
		double[] c = new double[50];
		double k;
		String s = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		t = h = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sz[i] = Double.parseDouble(tempVar3);
			}
			 if (strcmp(s,"male") == 0)
			 {
				a[t] = sz[i];
				t++;
			 }
			else
			{
				b[h] = sz[i];
				h++;
			}
		}
		for (j = 0;j < t;j++)
		{
			for (i = 0;i < t - 1;i++)
			{
				if (a[i + 1] < a[i])
				{
					k = a[i + 1];
					a[i + 1] = a[i];
					a[i] = k;
				}
			}
		}
		for (j = 0;j < h;j++)
		{
			for (i = 0;i < h - 1;i++)
			{
				if (b[i + 1] > b[i])
				{
					k = b[i + 1];
					b[i + 1] = b[i];
					b[i] = k;
				}
			}
		}
		for (i = 0;i < t;i++)
		{
			c[i] = a[i];
		}
		for (i = 0;i < h;i++)
		{
			c[i + t] = b[i];
		}
		for (i = 0;i < t + h - 1;i++)
		{
			System.out.printf("%.2lf ",c[i]);
		}
		System.out.printf("%.2lf",c[t + h - 1]);
		return 0;
	}

}

