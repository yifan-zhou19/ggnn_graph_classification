package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int n;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] a = new double[100];
		double[] b = new double[100];
		double max;
		double[] s = new double[1000];
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				s[j - i + (2 * n - i) * (i - 1) / 2] = Math.sqrt((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]));
			}
		}
		max = s[1];
		for (i = 1;i <= (n - 1) * n / 2;i++)
		{
			if (max < s[i])
			{
				max = s[i];
			}
		}
		System.out.printf("%.4lf",max);
	}
}

