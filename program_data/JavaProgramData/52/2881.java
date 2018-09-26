package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int m;
		int[] a = new int[200];
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
	for (i = n - 1;i >= 0;i--)
	{
		a[i + m] = a[i];
	}
	for (i = 0;i < m;i++)
	{
		a[i] = a[i + n];
	}
	System.out.printf("%ld",a[0]);
	for (i = 1;i < n;i++)
	{
	System.out.printf(" %ld",a[i]);
	}
	}
}

