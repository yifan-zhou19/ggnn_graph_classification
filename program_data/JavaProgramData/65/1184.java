package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int[] a = new int[500];
	int[] b = new int[500];
	int m = 0;
	int p = 0;
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
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b[i] = Integer.parseInt(tempVar3);
	}
	if ((a[i] == 0 && b[i] == 1) || (a[i] == 1 && b[i] == 2) || (a[i] == 2 && b[i] == 0))
	{
	m = m + 1;
	}
	else if (a[i] == b[i])
	{
		continue;
	}
	else
	{
		p = p + 1;
	}
	}

	if (m > p)
	{
		System.out.print("A");
	}
	else if (m < p)
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

