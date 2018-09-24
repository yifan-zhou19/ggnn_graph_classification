package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int r;
		int j = 0;
		int k = 0;
		String s = new String(new char[7]);
		double[] a = new double[100];
		double[] b = new double[100];
		double h;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				h = Double.parseDouble(tempVar3);
			}
			if (*s == 'm')
			{
				a[j] = h;
				j++;
			}
			if (*s == 'f')
			{
				b[k] = h;
				k++;
			}
		}
		for (r = j - 1;r > 0;r--)
		{
			for (i = 0;i < r;i++)
			{
				if (a[i] > a[i + 1])
				{
				   h = a[i + 1];
				   a[i + 1] = a[i];
				   a[i] = h;
				}
			}
		}
		for (r = k - 1;r > 0;r--)
		{
			for (i = 0;i < r;i++)
			{
				if (b[i] > b[i + 1])
				{
				   h = b[i + 1];
				   b[i + 1] = b[i];
				   b[i] = h;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%.2lf ",a[i]);
		}
		for (i = k - 1;i > 0;i--)
		{
			System.out.printf("%.2lf ",b[i]);
		}
		System.out.printf("%.2lf",b[0]);

	}



}

