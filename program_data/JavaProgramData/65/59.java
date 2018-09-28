package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int i;
	int k = 0;
	int a;
	int b;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	for (i = 0;i < m;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		if ((a == 0 && b == 1) || (a == 1 && b == 2) || (a == 2 && b == 0))
		{
			k++;
		}
		else
		{
	if (a != b)
	{
			k--;
	}
		}
	}

	if (k > 0)
	{
		System.out.print("A");
	}
	if (k == 0)
	{
	System.out.print("Tie");
	}
	if (k < 0)
	{
	System.out.print("B");
	}
	return 0;
	}
}

