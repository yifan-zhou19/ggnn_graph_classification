package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	double e = 0;
	double b = 0;
	double c = 0;
	double d = 0;
	int[] a = new int[100];
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
			(a[i]) = Integer.parseInt(tempVar2);
		}
	}
	for (i = 0;i < n;i++)
	{
	if (a[i] <= 18)
	{
	  e++;
	}
	else if (a[i] <= 35)
	{
	  b++;
	}
	else if (a[i] <= 60)
	{
	  c++;
	}
	else
	{
	  d++;
	}
	}
	System.out.printf("1-18: %.2f%%\n",e * 100 / n);
	System.out.printf("19-35: %.2f%%\n",b * 100 / n);
	System.out.printf("36-60: %.2f%%\n",c * 100 / n);
	System.out.printf("60??: %.2f%%\n",d * 100 / n);
	return 0;
	}

}

