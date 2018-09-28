package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int i;
		int n;
		int p;
		a = b = c = d = 0;
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
				p = Integer.parseInt(tempVar2);
			}
			if (p <= 18)
			{
			a++;
			}
			else if (p >= 19 && p <= 35)
			{
			b++;
			}
			else if (p >= 36 && p <= 60)
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
		System.out.printf("Over60: %.2lf%%\n",d * 100.0 / n);



		return 0;

	}

}

