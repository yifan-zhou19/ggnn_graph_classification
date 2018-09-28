package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int a;
		int b;
		int j;
		int max = 0;
		int min = 30000;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] l = new int[10001];
	for (i = 1;i <= 10000;i++)
	{
	l[i] = 0;
	}
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
	if (max < b)
	{
		max = b;
	}
	if (min > a)
	{
		min = a;
	}
	for (j = a + 1;j < b;j++)
	{
	l[j] = 1;
	}
	if (l[a] == 0)
	{
		l[a] = 2;
	}
	else
	{
		l[a] = 1;
	}
	if (l[b] == 0)
	{
		l[b] = 2;
	}
	else
	{
		l[b] = 1;
	}
	}
	l[min] = l[max] = 1;
	j = 1;
	for (i = min;i <= max;i++)
	{
	if (l[i] != 1)
	{
		j = 0;
		break;
	}
	}
	if (j == 1)
	{
		System.out.printf("%d %d\n",min,max);
	}
	else
	{
		System.out.print("no\n");
	}
	return 0;
	}
}

