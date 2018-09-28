package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] a = new int[100000];
	int n;
	int k;
	int i;
	int j;
	int m;
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
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		k = Integer.parseInt(tempVar3);
	}
	m = n;
	for (i = 0;i < m;i++)
	{
	if (a[i] == k)
	{
	for (j = i;j < m;j++)
	{
	a[j] = a[j + 1];
	}
		i--;
	m--;
	}
	}
	for (i = m;i <= n - 1;i++)
	{
	a[i] = '*';
	}
	for (i = 0;i < m - 1;i++)
	{
	System.out.printf("%d ",a[i]);
	}
	System.out.printf("%d",a[m - 1]);
	}
}

