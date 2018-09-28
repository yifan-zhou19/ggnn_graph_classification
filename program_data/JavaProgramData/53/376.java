package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int y = 0;
	int x;
	int i;
	int j;
	int n;
	int[] a = new int[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		x = Integer.parseInt(tempVar2);
	}
	a[0] = x;
	System.out.printf("%d",x);
	for (i = 1;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		x = Integer.parseInt(tempVar3);
	}
	a[i] = x;
	y = 0;
	for (j = 0;j < i;j++)
	{
	if (a[j] == x)
	{
		y = 1;
	}
	}
	if (y == 0)
	{
	System.out.print(",");
	System.out.printf("%d",x);
	}

	}
	}
}

