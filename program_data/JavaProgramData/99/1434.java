package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int s = 0;
		int q = 0;
		int z = 0;
		int l = 0;
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
			if (a[i] <= 18)
			{
				s += 1;
			}
			else if (a[i] > 18 && a[i] <= 35)
			{
				q += 1;
			}
			else if (a[i] > 35 && a[i] <= 60)
			{
				z += 1;
			}
			else if (a[i] > 60)
			{
				l += 1;
			}
		}
		System.out.printf("1-18: %.2lf%\n",100.0 * s / n);
		System.out.printf("19-35: %.2lf%\n",100.0 * q / n);
		System.out.printf("36-60: %.2lf%\n",100.0 * z / n);
		System.out.printf("60??: %.2lf%\n",100.0 * l / n);
		return 0;
	}
}

