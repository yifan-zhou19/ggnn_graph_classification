package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[] a = new int[20000];
		int n;
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
		for (j = 0;j < i;)
		{
		if (a[i] == a[j])
		{
			j = i + 1;
		}
	else
	{
		j++;
	}
	if (j == i)
	{
		System.out.printf(" %d",a[i]);
	}
		}
	}
	}
}

