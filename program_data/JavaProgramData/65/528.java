package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int A;
	int B;
	int[] a = new int[100];
	int[] b = new int[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	A = 0;
	B = 0;
	for (i = 1;i <= n;i++)
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
	}
	for (i = 1;i <= n;i++)
	{
	if (a[i] - b[i] == 1 || b[i] - a[i] == 2)
	{
	B = B + 1;
	}
		  else if (b[i] - a[i] == 1 || a[i] - b[i] == 2)
		  {
		 A = A + 1;
		  }
	}
	if (A > B)
	{
		System.out.print("A\n");
	}
	else if (A == B)
	{
		System.out.print("Tie\n");
	}
	else
	{
		System.out.print("B\n");
	}
		return 0;
	}
}

