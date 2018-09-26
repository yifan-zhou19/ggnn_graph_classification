package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int m;
		int n;
		int i;
		int j;
		int t = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	}
	for (j = n - m;j < n;j++)
	{
		if (t == 0)
		{
			System.out.printf("%d",a[j]);
			t = t + 1;
		}
	else
	{
		System.out.printf(" %d",a[j]);
	}
	}
	for (j = 0;j < n - m;j++)
	{
	System.out.printf(" %d",a[j]);
	}
	}
}

