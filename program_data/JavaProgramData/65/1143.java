package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int a = 0;
	int b = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] sz = new int[800];
	for (i = 1;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		(sz[0]) = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		(sz[1]) = Integer.parseInt(tempVar3);
	}

	if (sz[0] == sz[1])
	{
		a += 0;
		b += 0;
	}
	else if (sz[0] != sz[1])
	{
	if (sz[0] == 0 && sz[1] == 1)
	{
		a++;
	}
	else if (sz[0] == 1 && sz[1] == 2)
	{
		a++;
	}
	else if (sz[0] == 2 && sz[1] == 0)
	{
		a++;
	}
	else if (sz[0] == 1 && sz[1] == 0)
	{
		b++;
	}
	else if (sz[0] == 2 && sz[1] == 1)
	{
		b++;
	}
	else if (sz[0] == 0 && sz[1] == 2)
	{
		b++;
	}
	}
	}
	if (a > b)
	{
		System.out.print("A");
	}
	else if (a < b)
	{
		System.out.print("B");
	}
	else if (a == b)
	{
		System.out.print("Tie");
	}
	return 0;
	}


}

