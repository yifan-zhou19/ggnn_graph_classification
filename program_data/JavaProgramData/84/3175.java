package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int[] a = new int[100];
	int passer1;
	int passer2;
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
	for (i = 0;i < n - 1;i++)
	{
	if (a[i + 1] < a[i])
	{
	passer1 = a[i + 1];
	a[i + 1] = a[i];
	a[i] = passer1;
	}
	}
	for (j = 0;j < n - 2;j++)
	{
	if (a[j + 1] < a[j])
	{
	passer2 = a[j + 1];
	a[j + 1] = a[j];
	a[j] = passer2;
	}
	}
	System.out.printf("%d\n%d\n",a[n - 1],a[n - 2]);
	return 0;
	}
}

