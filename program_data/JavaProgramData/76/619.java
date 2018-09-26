package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] a = new int[50000];
	int[] b = new int[50000];
	int i;
	int j;
	int p;
	int t;
	int s;
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
		(a[i]) = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		(b[i]) = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i < n;i++)
	{
	for (j = n - 1;j > i;j--)
	{
	if (a[j] < a[j - 1])
	{
	t = a[j];
	a[j] = a[j - 1];
	a[j - 1] = t;
	p = b[j];
	b[j] = b[j - 1];
	b[j - 1] = p;
	}
	}
	}
	s = 0;
	for (i = 1;i < n;i++)
	{
	for (j = 0;j < i;j++)
	{
	if (a[i] < b[j] + 1)
	{
	s = s + 1;
	break;
	}
	}
	}
	if (s == n - 1)
	{
	for (i = 0;i < n;i++)
	{
	for (j = n - 1;j > i;j--)
	{
	if (b[j] < b[j - 1])
	{
	t = b[j];
	b[j] = b[j - 1];
	b[j - 1] = t;
	}
	}
	}
	System.out.printf("%d %d",a[0],b[n - 1]);
	}
	else
	{
		System.out.print("no");
	}
	return 0;
	}

}

