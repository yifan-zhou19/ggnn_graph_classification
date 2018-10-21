package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int a;
	int b;
	int aa;
	int bb;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	aa = bb = 0;
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	a = (a - b + 3) % 3;
	if (a == 2)
	{
		aa++;
	}
	else if (a == 1)
	{
		bb++;
	}
	}
	if (aa < bb)
	{
		System.out.print("B");
	}
	else if (aa > bb)
	{
		System.out.print("A");
	}
	else
	{
		System.out.print("Tie");
	}
	return 0;
	}
}

