package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int ch;
		int e;
		int d;
		int j;
	e = (int)',';
	a = 0;
	d = 0;
	j = -1;
	ch = e;
	while (ch == e)
	{

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		d += 1;
		if (a < b)
		{
			j = a;
			a = b;
		}
		else
		{
			if (j < b && b < a)
			{
				j = b;
			}
		}
			ch = System.in.read();
	}



	if (d != 1 && j != 0)
	{
		System.out.printf("%d",j);
	}
	else
	{
		System.out.print("No");
	}


	return 100;
	}
}

