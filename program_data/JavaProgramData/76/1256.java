package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[50000];
	int[] b = new int[50000];
	int n;
	int i;
	int t;
	int y = 0;
	int j;
	int k;
	int x;
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
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i < n - 1;i++)
	{
	for (j = n - 1;j > i;j--)
	{
	if (a[j] < a[j - 1])
	{
	k = a[j],x = b[j];
	a[j] = a[j - 1],b[j] = b[j - 1];
	a[j - 1] = k,b[j - 1] = x;
	}
	}
	}
	for (i = 0;i < n - 1;i++)
	{
	if (b[i] < a[i + 1])
	{
	y++;
	}
	if (b[i] >= b[i + 1])
	{
	t = b[i];
	b[i] = b[i + 1];
	b[i + 1] = t;
	}
	}
	if (y != 0)
	{
	System.out.print("no");
	}
	else
	{
	System.out.printf("%d %d",a[0],b[n - 1]);
	}
	return 0;
	}


}

