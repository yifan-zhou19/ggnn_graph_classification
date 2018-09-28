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
	int e = 0;
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
	}
	for (i = 0;i < n;i++)
	{
		if (a[i] == b[i])
		{
			e++;
		}
		else if ((a[i] == 0 && b[i] == 1) || (a[i] == 1 && b[i] == 2) || (a[i] == 2 && b[i] == 0))
		{
			c++;
		}
		else if ((a[i] == 0 && b[i] == 2) || (a[i] == 1 && b[i] == 0) || (a[i] == 2 && b[i] == 1))
		{
			d++;
		}
	}


	if (c > d)
	{
		System.out.print("A\n");
	}
	else if (c < d)
	{
		System.out.print("B\n");
	}
	else if (c = d)
	{
		System.out.print("Tie\n");
	}
		return 0;
	}

}

