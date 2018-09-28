package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int x;
	int y;
	x = 0;
	y = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[n];
	int[] b = new int[n];
	for (int i = 0;i < n;i++)
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
		if (a[i] - b[i] == -1 || a[i] - b[i] == 2)
		{
			x++;
		}
		else if (a[i] == b[i])
		{
			x = x;
		}
		else
		{
			y++;
		}




	}
	if (x > y)
	{
		System.out.print("A");
		return 0;
	}
	if (x < y)
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

