package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	int b;
	int A = 0;
	int B = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 1;i <= n;i++)
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
	{
	if ((a == 0 && b == 1) || (a == 1 && b == 2) || (a == 2 && b == 0))
	{
	A = A + 1;
	}
	else
	{
	if (a != b)
	{
	B = B + 1;
	}
	}
}
	}
	if (A == B)
	{
	System.out.print("Tie");
	}
	if (A > B)
	{
	System.out.print("A");
	}
	if (B > A)
	{
	System.out.print("B");
	}
	return 0;
	}
}

