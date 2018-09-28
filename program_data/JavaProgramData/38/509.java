package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	int i;
	int j;
	int n;
	int m;
	double sum;
	double ans;
	double[] a = new double[100];
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
			m = Integer.parseInt(tempVar2);
		}
		sum = 0,ans = 0;
		for (j = 0;j < m;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[j] = Double.parseDouble(tempVar3);
			}
			sum += a[j];
		}
		sum = sum / m;
		for (j = 0;j < m;j++)
		{
			ans += (a[j] - sum) * (a[j] - sum);
		}
		ans = ans / m;
		ans = Math.sqrt(ans);
		System.out.printf("%.5lf\n",ans);
	}

	}
}

