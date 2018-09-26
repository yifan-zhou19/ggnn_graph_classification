package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] A = new int[200];
	int b = 0;
	int a = 0;
	int[] B = new int[200];
	int c = 0;
	int i;
	int n;
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
		A[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		B[i] = Integer.parseInt(tempVar3);
	}
	if (A[i] - B[i] == 0)
	{
	c++;
	}
	else if (A[i] - B[i] == 1)
	{
	b++;
	}
	else if (A[i] - B[i] == -1)
	{
	a++;
	}
	else if (A[i] - B[i] == 2)
	{
	a++;
	}
	else if (A[i] - B[i] == -2)
	{
	b++;
	}
	}
	if (a > b)
	{
	System.out.print("A");
	}
	else if (a == b)
	{
	System.out.print("Tie");
	}
	else if (a < b)
	{
	System.out.print("B");
	}
	return 0;
	}
}

