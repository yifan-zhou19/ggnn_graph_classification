package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	int b;
	int c;
	int d;
	int i;
	a = 0;
	b = 0;
	c = 0;
	d = 0;
	int[] sz = new int[100];
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
			sz[i] = Integer.parseInt(tempVar2);
		}
	}
	for (i = 0;i < n;i++)
	{
		if (sz[i] <= 18)
		{
			a++;
		}
		else if (sz[i] > 18 && sz[i] <= 35)
		{
			b++;
		}
		else if (sz[i] > 35 && sz[i] <= 60)
		{
			c++;
		}
		else
		{
			d++;
		}
	}
	System.out.printf("1-18: %.2lf%%\n",(1.0 * a / n * 100));
	System.out.printf("19-35: %.2lf%%\n",(1.0 * b / n * 100));
	System.out.printf("36-60: %.2lf%%\n",(1.0 * c / n * 100));
	System.out.printf("60??: %.2lf%%\n",(1.0 * d / n * 100));
		return 0;
	}



}

