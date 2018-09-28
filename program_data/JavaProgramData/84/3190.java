package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[200];
	int i;
	int t;
	int x;
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
	}
	t = a[i];
	x = 0;
	for (i = 0;i < n;i++)
	{
		if (a[i] > t)
		{
			t = a[i];
			x = i;
		}
	}
	a[x] = a[0];
	a[0] = t;
	t = a[1];
	x = 1;
	for (i = 1;i < n;i++)
	{
		if (a[i] > t)
		{
			t = a[i];
			x = i;
		}
	}
	a[x] = a[1];
	a[1] = t;
	System.out.printf("%d\n%d\n",a[0],a[1]);
	}
}

