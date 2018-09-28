package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int n;
		int i;
		int s = 0;
		int c = 0;
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
	}
	for (i = 0;i < n;i++)
	{
		if (a[i] < b[i] && b[i] != 2)
		{
			s += 1;
		}
		if (a[i] == 2 && b[i] == 0)
		{
			s += 1;
		}
		if (b[i] == 2 && a[i] == 1)
		{
		 s += 1;
		}
		if (a[i] > b[i] && a[i] != 2)
		{
			c += 1;
		}
		if (b[i] == 2 && a[i] == 0)
		{
			c += 1;
		}
	if (a[i] == 2 && b[i] == 1)
	{
		c += 1;
	}

	}
	if (s > c)
	{
		System.out.print("A");
	}
	if (s < c)
	{
		System.out.print("B");
	}
	if (s == c)
	{
		System.out.print("Tie");
	}
	return 0;
	}


}

