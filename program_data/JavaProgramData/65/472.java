package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int[] a = new int[1000];
	int[] b = new int[1000];
	int[] result = new int[1000];
	int ax = 0;
	int bx = 0;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{ //0?????1?????2????
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
		if (a[i] == 0 && b[i] == 0)
		{
			result[i] = 0;
		}
		else if (a[i] == 1 && b[i] == 1)
		{
			result[i] = 0;
		}
		else if (a[i] == 2 && b[i] == 2)
		{
			result[i] = 0;
		}
		else if (a[i] == 0 && b[i] == 1)
		{
			result[i] = 1;
		}
		else if (a[i] == 0 && b[i] == 2)
		{
			result[i] = 2;
		}
		else if (a[i] == 1 && b[i] == 2)
		{
			result[i] = 1;
		}
		else if (a[i] == 1 && b[i] == 0)
		{
			result[i] = 2;
		}
		else if (a[i] == 2 && b[i] == 0)
		{
			result[i] = 1;
		}
		else if (a[i] == 2 && b[i] == 1)
		{
			result[i] = 2;
		}
	}

	for (i = 0;i < n;i++)
	{
		if (result[i] == 1)
		{
			ax++;
		}
		else if (result[i] == 2)
		{
			bx++;
		}
	}

	if (ax > bx)
	{
		System.out.print("A");
	}
	else if (ax < bx)
	{
		System.out.print("B");
	}
	else if (ax == bx)
	{
		System.out.print("Tie");
	}
	return 0;
	}
}

