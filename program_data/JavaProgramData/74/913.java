package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int m;
	int n;
	int p;
	int q;
	int c;
	int i;
	int k;
	int[] a = new int[20];
	int f;
	int[] b = new int[10];
	k = 0;
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
	for (c = m;c >= m != 0 && c <= n;c++)
	{
		for (i = 2;i <= c / 2;i++)
		{
	if (c % i == 0)
	{
	break;
	}
		}
	if (i == c / 2 + 1)
	{
		f = c;
	for (p = 0;f > 0;p++)
	{
		b[p] = f - 10 * (f / 10);
		f = f / 10;
	}
	p = p - 1;
	for (q = 0;q <= p;q++)
	{
	if (b[q] != b[p - q])
	{
		break;
	}
	}
	if (q == p + 1)
	{
		a[k] = c;
	k = k + 1;
	}
	}
	}
	k = k - 1;
	if (k < 0)
	{
		System.out.print("no");
	}
	else
	{
	for (i = 0;i <= k - 1;i++)
	{
	System.out.printf("%d,",a[i]);
	}
	System.out.printf("%d",a[k]);
	}
	}
}

