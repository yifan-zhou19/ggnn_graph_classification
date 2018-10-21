package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] a = new int[300];
	int m;
	int t;
	int s;
	int h;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	while (m != 0 && n != 0)
	{
		s = 1;
		h = 0;
	for (t = 0;t < n;t++)
	{
	a[t] = t + 1;
	}
	t = 0;
	while (h < n - 1)
	{
		if (a[t] != 0)
		{
		if (s == m)
		{
			a[t] = 0,s = 0,h++;
		}
		s++;
		}
		t++;
		if (t == n)
		{
			t = 0;
		}
	}
	t = 0;
	while (a[t] == 0)
	{
		t++;
	}
	System.out.printf("%d\n",a[t]);
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		n = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		m = Integer.parseInt(tempVar4);
	}
	}
	return 0;
	}
}

