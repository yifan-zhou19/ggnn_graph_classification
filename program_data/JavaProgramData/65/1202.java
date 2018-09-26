package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int c;
	c = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[n];
	int[] b = new int[n];
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
		c = c + 1;
	}
	else if (a[i] == b[i])
	{
		c = c;
	}
	else if ((a[i] == 0 && b[i] == 2) || (a[i] == 1 && b[i] == 0) || (a[i] == 2 && b[i] == 1))
	{
		c = c - 1;
	}
	}
	if (c > 0)
	{
		System.out.print("A");
	}
	else if (c == 0)
	{
		System.out.print("Tie");
	}
	else if (c < 0)
	{
		System.out.print("B");
	}
	return 0;
	}


}

