package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] a = new int[30];
	int[] b = new int[30];
	int i;
	int j;
	int k;
	int n;
	int m = 1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	b[i] = 1;
	}
	for (i = n - 1;i >= 1;i--)
	{
	for (j = i + 1;j <= n;j++)
	{
	if (a[i] >= a[j] != 0 && b[i] < b[j] + 1)
	{
	b[i] = b[j] + 1;
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

