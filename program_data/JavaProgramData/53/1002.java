package <missing>;

public class GlobalMembers
{
	public static void pd(int[] a, int k)
	{
	int i;
	int j;
	for (i = 0;i < k;i++)
	{
	for (j = i + 1;j < k;j++)
	{
	if (a[i] == a[j])
	{
		a[j] = 0;
	}
	}
	}
	System.out.printf("%d",a[0]);
	for (i = 1;i < k;i++)
	{
	if (a[i] != 0)
	{
		System.out.printf(",%d",a[i]);
	}
	}
	}
	public static int Main()
	{
	int[] a = new int[300];
	int k;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (n = 0;n < k;n++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[n] = Integer.parseInt(tempVar2);
	}
	}
	for (n = 0;n < k;n++)
	{
	System.out.print("");
	}
	pd(a, k);
	return 0;
	}

}

