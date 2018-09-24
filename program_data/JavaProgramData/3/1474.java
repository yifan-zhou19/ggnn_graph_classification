package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int k;
	int j;
	int m = 0;
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
	int[] a = new int[1000000];
	int[] b = new int[1000000];
	for (i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i < n;i++)
	{
	b[i] = k - a[i];
	}
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < n;j++)
	{
	if (b[i] == a[j])
	{
	m = m + 1;
	}
	if (b[i] != a[j])
	{
	m = m;
	}
	}
	}
	if (m != 0)
	{
	System.out.print("yes\n");
	}
	if (m == 0)
	{
	System.out.print("no\n");
	}
	}
}

