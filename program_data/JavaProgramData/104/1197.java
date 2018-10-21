package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int j;
		int ka;
		int kb;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		x = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		y = Integer.parseInt(tempVar2);
	}
	a[1] = x;
	b[1] = y;
	i = 1;
	j = 1;
	while (a[i] != 1)
	{
		i++;
	a[i] = a[i - 1] / 2;
	}

	while (b[j] != 1)
	{
		j++;
	b[j] = b[j - 1] / 2;
	}
	for (ka = 1;ka <= i;ka++)
	{
		for (kb = 1;kb <= j;kb++)
		{
		if (a[ka] == b[kb])
		{
		System.out.printf("%d\n",a[ka]);
			break;
		}
	if (a[ka] == b[kb])
	{
		break;
	}
		}
	if (a[ka] == b[kb])
	{
		break;
	}
	}


		return 0;
	}
}

