package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] a = new int[100000];
	int n;
	int i;
	int d;
	int j;
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
		a[i - 1] = Integer.parseInt(tempVar2);
	}
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		d = Integer.parseInt(tempVar3);
	}
	for (i = 0;i <= n - 1;i++)
	{
	if (a[i] == d)
	{
		for (j = i;j <= n - 1;j++)
		{
				   a[j] = a[j + 1];
		}
					   i = i - 1;
					   n = n - 1;
	}
	}
	for (i = 0;i <= n - 1;i++)
	{
		System.out.printf("%d",a[i]);
	if (i < n - 1)
	{
		System.out.print(" ");
	}
	}
	}
}

