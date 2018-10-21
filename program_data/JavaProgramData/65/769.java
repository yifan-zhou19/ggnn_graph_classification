package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i = 0;
	int j = 0;
	int k;
	int[] a = new int[200];
	int[] b = new int[200];
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
	}
	for (k = 0,i = 0,j = 0;k < n;k++)
	{
	if (a[k] == 0 && b[k] == 1)
	{
	i++;
	}
	else if (a[k] == 1 && b[k] == 2)
	{
	i++;
	}
	else if (a[k] == 2 && b[k] == 0)
	{
	i++;
	}
	else if (a[k] == 0 && b[k] == 2)
	{
	j++;
	}
	else if (a[k] == 1 && b[k] == 0)
	{
	j++;
	}
	else if (a[k] == 2 && b[k] == 1)
	{
	j++;
	}
	else
	{
	continue;
	}
	}
	if (i > j)
	{
	System.out.print("A");
	}
	if (i < j)
	{
	System.out.print("B");
	}
	if (i == j)
	{
	System.out.print("Tie");
	}
	return 0;
	}
}

