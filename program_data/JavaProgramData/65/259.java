package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] sz = new int[2];
	int a = 0;
	int b = 0;
	int i;
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
		(sz[0]) = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		(sz[1]) = Integer.parseInt(tempVar3);
	}
	if ((sz[0] == 0 && sz[1] == 1) || (sz[0] == 1 && sz[1] == 2) || (sz[0] == 2 && sz[1] == 0))
	{
	a++;
	}
	else if ((sz[0] == 1 && sz[1] == 0) || (sz[0] == 2 && sz[1] == 1) || (sz[0] == 0 && sz[1] == 2))
	{
	b++;
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
	else
	{
	System.out.print("Tie");
	}
	return 0;
	}

}

