package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sm = new int[100];
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int i;
		int n;
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
			sm[i] = Integer.parseInt(tempVar2);
		}
		if (sm[i] <= 18)
		{
			a++;
		}
		else if (sm[i] <= 35)
		{
			b++;
		}
		else if (sm[i] <= 60)
		{
			c++;
		}
		else
		{
			d++;
		}
		}
		System.out.printf("1-18: %.2lf%%\n",a * 100.0 / n);
		System.out.printf("19-35: %.2lf%%\n",b * 100.0 / n);
		System.out.printf("36-60: %.2lf%%\n",c * 100.0 / n);
		System.out.printf("60??: %.2lf%%\n",d * 100.0 / n);
		return 0;
	}

}

