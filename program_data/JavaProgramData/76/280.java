package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] a = new int[50001];
	int[] b = new int[50001];
	int[] c = new int[50001];
	int x;
	int d;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < n;i++)
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
	x = a[0];
	d = b[0];
	for (int i = 0;i < n;i++)
	{
	if (a[i] < x)
	{
		x = a[i];
	}
	if (b[i] > d)
	{
		d = b[i];
	}
	}
	for (int i = x;i < d;i++)
	{
	c[i] = 1;
	}
	for (int i = 0;i < n;i++)
	{
	for (int k = a[i];k < b[i];k++)
	{
	c[k] = 0;
	}
	}
	int s = 0;
	for (int i = x;i < d;i++)
	{
	s += c[i];
	}
	if (s == 0)
	{
	System.out.printf("%d %d",x,d);
	}
	else
	{
	System.out.print("no");
	}
	return 0;
	}
}

