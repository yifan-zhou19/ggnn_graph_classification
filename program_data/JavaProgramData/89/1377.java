package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[n + 5];
	int[] b = new int[n + 5];
	for (i = 0;i < n;i++)
	{
		a[i] = 0;
		b[i] = 0;
	}
	while (true)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		i = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		j = Integer.parseInt(tempVar3);
	}
	if (i == j && i == 0)
	{
		break;
	}
	a[i]++;
	b[j]++;
	}
	int flag = 0;
	for (i = 0;i < n;i++)
	{
	if (a[i] == 0 && b[i] == n - 1)
	{
	flag = 1;
	System.out.printf("%d\n",i);
	}
	}
	if (flag == 0)
	{
		System.out.print("NOT FOUND\n");
	}
	}

}

