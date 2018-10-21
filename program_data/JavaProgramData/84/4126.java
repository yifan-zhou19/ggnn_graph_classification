package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int n;
	int[] a = new int[100];
	int max = 0;
	int min = 0;
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
	for (i = 0;i < n;i++)
	{
	if (a[i] > max)
	{
		min = max;
		max = a[i];
	}
	else if (a[i] > min)
	{
		min = a[i];
	}
	}
	System.out.printf("%d\n%d",max,min);
	}
}

