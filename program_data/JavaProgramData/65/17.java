package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int c = 0;
	int d = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[n];
	int[] b = new int[n];
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b[i] = Integer.parseInt(tempVar3);
	}
	if (a[i] == 0)
	{
	if (b[i] == 1)
	{
		c++;
	}
	if (b[i] == 2)
	{
		d++;
	}
	}
	if (a[i] == 1)
	{
	if (b[i] == 2)
	{
		c++;
	}
	if (b[i] == 0)
	{
		d++;
	}
	}
	if (a[i] == 2)
	{
	if (b[i] == 0)
	{
		c++;
	}
	if (b[i] == 1)
	{
		d++;
	}
	}
	}
	if (c > d)
	{
		System.out.print("A");
	}
	if (c < d)
	{
		System.out.print("B");
	}
	if (c == d)
	{
		System.out.print("Tie");
	}
	return 0;
	}

}

