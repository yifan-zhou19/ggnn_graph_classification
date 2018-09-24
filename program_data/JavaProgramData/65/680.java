package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a = 0;
	int b = 0;
	int n;
	int[] ac = new int[200];
	int[] bc = new int[200];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(ac[i]) = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			(bc[i]) = Integer.parseInt(tempVar3);
		}
	}
	for (int j = 0;j < n;j++)
	{
			if (ac[j] == bc[j])
			{
			a = a,b = b;
			}
		else if (ac[j] - bc[j] == -1)
		{
			a = a + 1,b = b;
		}
		else if (ac[j] - bc[j] == 2)
		{
			a = a + 1,b = b;
		}
		else
		{
			a = a,b = b + 1;
		}
	}
	if (a == b)
	{
		System.out.print("Tie");
	}
	else if (a > b)
	{
		System.out.print("A");
	}
	else
	{
		System.out.print("B");
	}
	return 0;
	}
}

