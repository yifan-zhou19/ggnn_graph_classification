package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int t;
		int[] a = new int[100];
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
	for (j = n - 1;j > 0;j--)
	{
	if (a[j] > a[j - 1])
	{
		t = a[j];
	a[j] = a[j - 1];
	a[j - 1] = t;
	}
	}
	System.out.printf("%d\n",a[0]);
	for (j = n - 1;j > 1;j--)
	{
	if (a[j] > a[j - 1])
	{
		t = a[j];
	a[j] = a[j - 1];
	a[j - 1] = t;
	}
	}
	System.out.printf("%d",a[1]);

	}
}

