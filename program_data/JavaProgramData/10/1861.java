package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int i;
	int j;
	int m;
	int[] a = new int[30];
	int[] b = new int[30];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	m = 1;
	for (i = 1;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	b[i] = 1;
	}
	for (i = n;i >= 1;i--)
	{
	for (j = i + 1;j <= n;j++)
	{
	if (a[i] >= a[j])
	{
	if (b[i] < b[j] + 1)
	{
	b[i] = b[j] + 1;
	}
	}
	}
	if (b[i] > m)
	{
	m = b[i];
	}
	}
	System.out.printf("%d",m);
	}

}

