package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f = new int(int a,int n,int m);
		int[] a = new int[100];
		int i;
		int j = 1;
		int n;
		int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	for (i = 1;i <= n;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
	}
	a[0] = a[1];
	for (i = 1;i <= n - 1;i++)
	{
		a[j] = a[f(j, n, m)];
		j = f(j, n, m);
	}
	a[j] = a[0];
	System.out.printf("%d",a[1]);
	for (i = 2;i <= n;i++)
	{
		System.out.printf(" %d",a[i]);
	}
	System.out.print("\n");

	}
	public static int f(int a,int n,int m)
	{
		if (a <= m)
		{
			return (a + n - m);
		}
	else
	{
		return (a - m);
	}
	}
}

