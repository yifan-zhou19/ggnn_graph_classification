package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int a;
	int b;
	int A;
	int B;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	a = 0;
	b = 0;
	for (i = 1;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		A = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		B = Integer.parseInt(tempVar3);
	}
	if (A == 0 && B == 0 || A == 1 && B == 1 || A == 2 && B == 2)
	{
	a = a;
	}
	else if (A == 0 && B == 1 || A == 1 && B == 2 || A == 2 && B == 0)
	{
	a = a + 1;
	}
	else if (A == 0 && B == 2 || A == 1 && B == 0 || A == 2 && B == 1)
	{
	b = b + 1;
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
	else if (a = b)
	{
		System.out.print("Tie");
	}
	return 0;
	}

}

