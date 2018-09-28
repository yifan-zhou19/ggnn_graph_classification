package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int x;
	int y;
	int w;
	int a;
	int b;
	a = 0;
	b = 0;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}

	for (i = 1;i <= n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			y = Integer.parseInt(tempVar3);
		}
		w = y - x;
		if (w == 1)
		{
		a++;
		}
		else
		{
		if (w == 2)
		{
		b++;
		}
	else
	{
		if (w == -1)
		{
		b++;
		}
	else
	{
		if (w == -2)
		{
		a++;
		}
	}
	}
		}
	}
	if (a > b)
	{
	System.out.print("A");
	}
	else
	{
	if (a < b)
	{
	System.out.print("B");
	}
	else
	{
	System.out.print("Tie");
	}
	}

	return 0;
	}

}

