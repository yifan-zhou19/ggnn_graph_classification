package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] sz = new int[200];
	int[] sb = new int[200];
	int i;
	int j;
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		sz[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		sb[i] = Integer.parseInt(tempVar3);
	}
	}
	int a = 0;
	int b = 0;
	int tie = 0;
	for (i = 0;i < n;i++)
	{
	if (sz[i] == 0 && sb[i] == 1)
	{
		a = a + 1;
	}
	else if (sz[i] == 1 && sb[i] == 2)
	{
		a = a + 1;
	}
	else if (sz[i] == 2 && sb[i] == 0)
	{
		a = a + 1;
	}
	else if (sz[i] == 0 && sb[i] == 2)
	{
		b = b + 1;
	}
	else if (sz[i] == 1 && sb[i] == 0)
	{
		b = b + 1;
	}
	else if (sz[i] == 2 && sb[i] == 1)
	{
		b = b + 1;
	}
	else
	{
		tie = tie+1;
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

