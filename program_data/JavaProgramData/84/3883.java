package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[100];
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (int i = 0 ;i < k;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		(a[i]) = Integer.parseInt(tempVar2);
	}
	}
	for (int j = 0;j < k - 1;j++)
	{
	for (int i = 0;i < k - 1 - j;i++)
	{
	if (a[i] <= a[i + 1])
	{
	int p = a[i];
	a[i] = a[i + 1];
	a[i + 1] = p;
	}
	}
	}
	System.out.printf("%d\n%d",a[0],a[1]);
	return 0;
	}
}

