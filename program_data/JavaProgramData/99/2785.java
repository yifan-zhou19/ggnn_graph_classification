package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		double j = 0;
		double k = 0;
		double m = 0;
		double p = 0;
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
		for (i = 0;i < n;i++)
		{
			if (a[i] <= 18)
			{
				j = j + 1;
			}
			else if (a[i] <= 35)
			{
				k = k + 1;
			}
			else if (a[i] <= 60)
			{
				m = m + 1;
			}
			else
			{
				p = p + 1;
			}
		}
		j = j / n * 100;
		k = k / n * 100;
		m = m / n * 100;
		p = p / n * 100;
		System.out.printf("1-18: %.2lf%\n19-35: %.2lf%\n36-60: %.2lf%\n60??: %.2lf%",j,k,m,p);
	}


}

