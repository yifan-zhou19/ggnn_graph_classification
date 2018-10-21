package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int max;
	int sec;
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
	max = a[0];
	sec = a[0];
	for (i = 0;i < n;i++)
	{
	if (a[i] > max)
	{
	max = a[i];
	}
	else if (a[i] < max && a[i]> sec)
	{
	sec = a[i];
	}
	}
	System.out.printf("%d\n%d",max,sec);
	return 0;
	}
}

