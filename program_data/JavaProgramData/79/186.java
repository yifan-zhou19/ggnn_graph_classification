package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f = new int(int n,int m);
	int[] a = new int[100];
	int[] b = new int[100];
	int[] c = new int[100];
	int i;
	for (i = 0;i < 100;i++)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b[i] = Integer.parseInt(tempVar2);
		}
	if (a[i] == 0 && b[i] == 0)
	{
	break;
	}
	c[i] = f(a[i], b[i]);
	}
	for (i = 0;a[i] != 0;i++)
	{
	System.out.printf("%d\n",c[i]);
	}
	}

	public static int f(int n,int m)
	{
		int z;
	if (n == 1)
	{
	z = 1;
	}
	if (n != 1)
	{
		z = (f(n - 1, m) + m) % n;
	if (z == 0)
	{
	z = n;
	}
	}
	return (z);
	}
}

