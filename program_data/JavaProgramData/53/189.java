package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
	int[] a = new int[300];
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
	System.out.printf("%d",a[0]);
	for (i = 1;i < n;i++)
	{
	if (a[i] == a[0])
	{
		a[i] = 80;
	}
	}
	for (i = 1;i < n;i++)
	{
		if (a[i] != 80)
		{
	System.out.printf(",%d",a[i]);
		}
	for (j = i + 1;j < n;j++)
	{
	if (a[j] == a[i])
	{
		a[j] = 80;
	}
	}
	}
	}
}

