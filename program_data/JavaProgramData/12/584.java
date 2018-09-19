package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int NO;
	int tmp;
	int[] a = new int[101];
	while (true)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		tmp = Integer.parseInt(tempVar);
	}
	if (tmp == -1)
	{
		break;
	}
	NO = 0;
	for (i = 0; i < 101; i++)
	{
	a[i] = 0;
	}
	a[tmp] = 1;
	while (scanf("%d", tmp) == 1 && tmp != 0)
	{
	a[tmp] = 1;
	}
	for (i = 0; i < 50; i++)
	{
	if (a[i] != 0 && a[2 * i] != 0)
	{
	NO++;
	}
	}
	System.out.printf("%d\n",NO);
	}
	return 0;
	}
}

