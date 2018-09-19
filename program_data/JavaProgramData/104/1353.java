package <missing>;

public class GlobalMembers
{
	public static int toup(int m)
	{
		int l;
		l = m / 2;
		return l;
	}


	public static int Main()
	{
		int i;
		int j;
	int[] a = new int[300];
	int[] b = new int[300];
	int ac = 0;
	int bc = 0;
	int xun;
	int h;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		i = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		j = Integer.parseInt(tempVar2);
	}

	a[0] = i;
	b[0] = j;
	for (xun = 1;;xun++)
	{
		if (a[xun - 1] != 1)
		{
			a[xun] = toup(a[xun - 1]);
			ac = ac + 1;
		}
		else
		{
			break;
		}
	}
	for (xun = 1;;xun++)
	{
		if (b[xun - 1] != 1)
		{
			b[xun] = toup(b[xun - 1]);
			bc = bc + 1;
		}
		else
		{
			break;
		}
	}

	for (h = 1;;h++)
	{
		if (a[ac - h] != b[bc - h])
		{
			System.out.printf("%d",a[ac - h + 1]);
			break;
		}
	}
	return 0;
	}
}

