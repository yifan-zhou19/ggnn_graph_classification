package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int m;
	int n;
	int i;
	int j = 0;
	int[] a = new int[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	for (i = 0;i <= 99;i++)
	{
		a[i] = 0;
	}
	int su = new int(int a,int b);
	int hui = new int(int c,int d);
	for (i = m;i <= n;i++)
	{
		if (su(i, 2) == 1 && i == hui(i, 0))
		{
			a[j++] = i;
		}
	}
	if (a[0] == 0)
	{
		System.out.print("no");
	}
	else
	{
		System.out.printf("%d",a[0]);
	for (i = 1;a[i] > 0;i++)
	{
		System.out.printf(",%d",a[i]);
	}
	}


	}
	public static int su(int a,int b)
	{
	if (b == a)
	{
		return 1;
	}
	else if (a % b == 0)
	{
		return 0;
	}
	else
	{
		return (su(a, b + 1));
	}
	}
	public static int hui(int c,int d)
	{
	if (c == 0)
	{
		return d;
	}
	else
	{
		return (hui(c / 10, d * 10 + c % 10));
	}


	}
}

