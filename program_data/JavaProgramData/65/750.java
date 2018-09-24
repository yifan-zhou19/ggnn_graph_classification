package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[500];
	int[] b = new int[500];
	int i;
	int j;
	int n;
	int m;
	i = 0;
	j = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (m = 0;m < n;m++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(a[m]) = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			(b[m]) = Integer.parseInt(tempVar3);
		}
		if (a[m] == 0 && b[m] == 1)
		{
			i += 1;
		}
		else if (a[m] == 1 && b[m] == 2)
		{
			i += 1;
		}
		else if (a[m] == 2 && b[m] == 0)
		{
			i += 1;
		}
		else if (a[m] == b[m])
		{
			continue;
		}
		else
		{
			j += 1;
		}
	}
	if (i > j)
	{
	System.out.print("A");
	}
	else if (i < j)
	{
	System.out.print("B");
	}
	else
	{
	System.out.print("Tie");
	}
	return 0;
	}

}

