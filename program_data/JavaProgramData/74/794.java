package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int zhi = int;
		int hui = int;
		int[] a = new int[100];
	int m;
	int n;
	int i;
	int s = 1;
	int p;
	int q;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	for (i = m,p = 0;i <= n;i++)
	{
		if (zhi(i) == 1 && hui(i) == 1)
		{
		   a[p] = i;
		   p += 1;
			s = 0;
		}
	}
	if (s != 0)
	{
	  System.out.print("no");
	}
	else
	{
	for (q = 0;q <= p - 2;q++)
	{
	System.out.printf("%d,",a[q]);
	}
	System.out.printf("%d",a[p - 1]);
	}
	return 0;
	}
	public static int zhi(int n)
	{
		int i;
		int m;
	if (n == 2)
	{
	m = 1;
	}
	else
	{
	for (i = 2;i <= Math.sqrt(n);i++)
	{
		if (n % i == 0)
		{
			break;
		}
	}
	if (i > Math.sqrt(n))
	{
		m = 1;
	}
	else
	{
		m = 0;
	}
	}
	return (m);
	}
	public static int hui(int n)
	{
	int[] a = new int[10];
	int i;
		int s = 1;
		int j;
		for (i = 0;n > 0;i++)
		{
		   a[i] = n % 10;
		   n = n / 10;
		}
	for (j = 0;j <= i - 1;j++)
	{
		   if (a[j] != a[i - 1 - j])
		   {
			 s = 0;
		   }
	}

		return s;

	}

}

