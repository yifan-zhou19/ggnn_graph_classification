package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	int e;
	int n;
	int p;
	int q;
	e = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int c = 3;c < n - 1;c++)
	{
		p = 0;
	q = 0;
			for (int i = 2;i < c;i++)
			{
					if (c % i == 0)
					{
							   p = 1;
					}
			}
	if (p == 0)
	{
		for (int j = 2;j < c + 2;j++)
		{
					if ((c + 2) % j == 0)
					{
							   q = 1;
					}
		}
	}
	if (p == 0 && q == 0)
	{
			e = 1;
			System.out.printf("%d %d\n",c,c + 2);
	}
	}


	if (e == 0)
	{
			  System.out.print("empty");
	}
			int hou;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				hou = Integer.parseInt(tempVar2);
			}
	return 0;
	}

}

