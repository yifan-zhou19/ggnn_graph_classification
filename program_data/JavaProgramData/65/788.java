package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c = 0;
		int d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a - b == 1)
			{
				d = d + 1;
			}
			else if (a - b == -1)
			{
					c = c + 1;
			}
			else if (a - b == -2)
			{
						d = d + 1;
			}
			else if (a - b == 2)
			{
							c = c + 1;
			}
			else if (a = b)
			{
								c = c;
								d = d;
			}
		}
	if (c > d)
	{
		System.out.print("A");
	}
	else if (c == d)
	{
			System.out.print("Tie");
	}
	else if (c < d)
	{
		System.out.print("B");
	}
			return 0;

	}

}

