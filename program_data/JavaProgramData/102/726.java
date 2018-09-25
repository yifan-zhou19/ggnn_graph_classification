package <missing>;

public class GlobalMembers
{
	public static int n;
	public static double[] b = new double[40];
	public static double[] c = new double[40];
	public static int Main()
	{
		String a = new String(new char[10]);
		int t = 0;
		int k = 0;
		double len;
		double temp;
		int i;
		int j;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				len = Double.parseDouble(tempVar3);
			}
			if (a.charAt(0) == 'm')
			{
				b[k++] = len;
			}
			else
			{
				c[t++] = len;
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			for (j = 0;j < k - i - 1;j++)
			{
				if (b[j] > b[j + 1])
				{
					temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < t - 1;i++)
		{
			for (j = 0;j < t - i - 1;j++)
			{
				if (c[j] < c[j + 1])
				{
					temp = c[j];
					c[j] = c[j + 1];
					c[j + 1] = temp;
				}
			}
		}

		for (i = 0;i < k;i++)
		{
			System.out.printf("%.2f ",b[i]);
		}
		for (i = 0;i < t - 1;i++)
		{
			System.out.printf("%.2f ",c[i]);
		}
			System.out.printf("%.2f",c[t - 1]);
	}
}

