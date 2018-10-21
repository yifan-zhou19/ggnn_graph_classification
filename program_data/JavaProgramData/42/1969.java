package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[n];
	m = n;
	for (int i = 0;i < n;i++)
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
	for (int i = 0;i < n;i++)
	{
	if (a[i] == k)
	{
		for (int j = i;j < n - 1;j++)
		{
			a[j] = a[j + 1];
		}
		i--;
		n--;
	}
	}
	for (int i = 0;i < n - 1;i++)
	{
	System.out.printf("%d ",a[i]);
	}
	System.out.printf("%d",a[n - 1]);
	}
}

