package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int o = 0;
		int p = 0;
		int k = 0;
		int q = 0;
		int[] a = new int[100];
		char m = '%';
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
			if (a[i] < 19)
			{
				o++;
			}
			else if (a[i] > 18 && a[i] < 36)
			{
				p++;
			}
			else if (a[i] > 35 && a[i] < 61)
			{
				k++;
			}
			else
			{
				q++;
			}
		}
		System.out.printf("1-18: %.2lf%c\n",100 * o * 1.0 / n,m);
		System.out.printf("19-35: %.2lf%c\n",100 * p * 1.0 / n,m);
		System.out.printf("36-60: %.2lf%c\n",100 * k * 1.0 / n,m);
		System.out.printf("60??: %.2lf%c\n",100 * q * 1.0 / n,m);
		return 0;
	}


}

