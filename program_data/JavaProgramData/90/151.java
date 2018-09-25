package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f1 = new int(int x,int y);
	int f2 = new int(int x,int y);
	int n;
	int[] a = new int[20];
	int[] b = new int[20];
	int i;
	int[] k = new int[20];
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
		a[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i < n;i++)
	{
		if (b[i] == 1)
		{
			k[i] = 1;
		}
	else
	{
		k[i] = f1(a[i], b[i]) + f2(a[i], b[i]);
	}
	System.out.printf("%ld\n",k[i]);
	}
	}

	public static int f1(int x,int y)
	{
		int z;
	if (y > 2)
	{
		z = f1(x, y - 1) + f2(x, y - 1);
	}
	else if (y == 2)
	{
		z = 1;
	}
	return (z);
	}

	public static int f2(int x,int y)
	{
		int w;
	if (x - y >= 0)
	{
		w = f1(x - y, y) + f2(x - y, y);
	}
	else
	{
		w = 0;
	}
	return (w);
	}
}

