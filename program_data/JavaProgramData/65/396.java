package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int n;
		int i;
		int A = 0;
		int B = 0;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
	if (a[i] - b[i] == 0)
	{
		continue;
	}
	else if (a[i] - b[i] == -1 || a[i] - b[i] == 2)
	{
		A = A + 1;
	}
	else
	{
		B = B + 1;
	}
		}
	if (A > B)
	{
	System.out.print("A");
	}
	if (A < B)
	{
	System.out.print("B");
	}
	if (A == B)
	{
		System.out.print("Tie");
	}
			return 0;
	}

}

