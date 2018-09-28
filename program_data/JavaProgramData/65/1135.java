package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int A;
	int B;
	int[] a = new int[200];
	int[] b = new int[200];
	int n;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	A = 0;
	B = 0;
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
	if (b[i] - a[i] == 1 || a[i] - b[i] == 2)
	{
		A++;

	}
	else if (a[i] == b[i])
	{
		continue;
	}
	else
	{
		B++;
	}
	}
	if (A > B)
	{
		System.out.print("A");
	}
	else if (A == B)
	{
		System.out.print("Tie");
	}
	else
	{
		System.out.print("B");
	}
	return 0;
	}


}

