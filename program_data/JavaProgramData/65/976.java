package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int b = 0;
		int i;
		int c;
		int d;
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
				c = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				d = Integer.parseInt(tempVar3);
			}
			if ((c - d) == -1 || (c - d) == 2)
			{
				a++;
			}
			else if ((d - c) == -1 || (d - c) == 2)
			{
				b++;
			}
		}
		if (a > b)
		{
			System.out.print("A");
		}
		else if (b > a)
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

