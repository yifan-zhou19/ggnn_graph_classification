package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int i;
	int[] a = new int[1000];
	int[] b = new int[1000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	}
	int p = 0;
	int s = 0;
	int d = 0;
	for (i = 0;i < n;i++)
	{
	b[p] = a[i];
	p++;
	}
	for (p = 0;p < n;p++)
	{
	for (i = 0;i < n;i++)
	{
	if (b[p] + a[i] == k)
	{
	s++;
	if (p == i)
	{
	d++;
	}
	}
	}
	}
	if ((s - d) != 0)
	{
	System.out.print("yes");
	}
	else
	{
	System.out.print("no");
	}
	return 0;
	}

}

