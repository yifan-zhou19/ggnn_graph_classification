package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int[] a = new int[N];
	int[] b = new int[N];
	int[] c = new int[N];
	int s = 0;
	int t = 0;
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
	if (a[i] == b[i])
	{
	c[i] = 0;
	}
	else if (a[i] == 0 && b[i] == 1)
	{
	c[i] = 1;
	}
	else if (a[i] == 0 && b[i] == 2)
	{
	c[i] = -1;
	}
	else if (a[i] == 1 && b[i] == 0)
	{
	c[i] = -1;
	}
	else if (a[i] == 1 && b[i] == 2)
	{
	c[i] = 1;
	}
	else if (a[i] == 2 && b[i] == 0)
	{
	c[i] = 1;
	}
	else if (a[i] == 2 && b[i] == 1)
	{
	c[i] = -1;
	}
	}
	for (i = 0;i < n;i++)
	{
	if (c[i] == 1)
	{
	s++;
	}
	else if (c[i] == -1)
	{
	t++;
	}
	}
	if (s > t)
	{
	System.out.print("A");
	}
	else if (s < t)
	{
	System.out.print("B");
	}
	else
	{
		System.out.print("Tie");
	}
	return 0;
	}
}

