package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int[] a = {0, 0, 0, 0, 0};
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	if ((n - 10000) > 0)
	{
	a[0] = n - (n / 10 * 10);
	a[1] = n / 10 - (n / 100 * 10);
	a[2] = n / 100 - (n / 1000 * 10);
	a[3] = n / 1000 - (n / 10000 * 10);
	a[4] = n / 10000;
	System.out.printf("%d%d%d%d%d",a[0],a[1],a[2],a[3],a[4]);
	}
	else if ((n - 1000) > 0)
	{
	a[0] = n - (n / 10 * 10);
	a[1] = n / 10 - (n / 100 * 10);
	a[2] = n / 100 - (n / 1000 * 10);
	a[3] = n / 1000;
	System.out.printf("%d%d%d%d",a[0],a[1],a[2],a[3]);
	}
	else if ((n - 100) > 0)
	{
	a[0] = n - (n / 10 * 10);
	a[1] = n / 10 - (n / 100 * 10);
	a[2] = n / 100;
	System.out.printf("%d%d%d",a[0],a[1],a[2]);
	}
	else if ((n - 10) > 0)
	{
	a[0] = n - (n / 10 * 10);
	a[1] = n / 10;
	System.out.printf("%d%d",a[0],a[1]);
	}
	else if ((n - 10) < 0)
	{
	a[0] = n;
	System.out.printf("%d",a[0]);
	}



	}


}

