package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int[] b = new int[100];
		int c = 0;
		int d = 0;
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
		if (a[i] == 0 && b[i] == 1)
		{
		c++;
		}
	else if (a[i] == 1 && b[i] == 2)
	{
		c++;
	}
	else if (a[i] == 2 && b[i] == 0)
	{
		c++;
	}
	else if (a[i] == b[i])
	{
	continue;
	}
	else
	{
		 d++;
	}

		}


	if (c > d)
	{
			System.out.print("A");
	}
	if (c < d)
	{
			System.out.print("B");
	}
	if (c == d)
	{
			System.out.print("Tie");
	}

	return 0;
	}
}

