package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k = 0;
		int m = 0;
		int t = 0;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[100];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] <= 18)
			{
				k += 1;
			}
			else if (a[i] > 18 && a[i] <= 35)
			{
				m += 1;
			}
			else if (a[i] > 35 && a[i] <= 60)
			{
				t += 1;
			}
			else
			{
				s += 1;
			}
		}
		System.out.printf("1-18: %.2lf%\n",(double)(k * 100) / n);
		System.out.printf("19-35: %.2lf%\n",(double)(m * 100) / n);
		System.out.printf("36-60: %.2lf%\n",(double)(t * 100) / n);
		System.out.printf("60??: %.2lf%\n",(double)(s * 100) / n);
		return 0;
	}
}

