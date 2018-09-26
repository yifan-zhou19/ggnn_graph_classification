package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int y;
		int i;
		int a = 0;
		int b = 0;
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
				x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			if ((x == 0 && y == 1) || (x == 2 && y == 0) || (x == 1 && y == 2))
			{
				a++;
			}
			if ((x == 1 && y == 0) || (x == 0 && y == 2) || (x == 2 && y == 1))
			{
				b++;
			}
		}
		if (a == b)
		{
			System.out.print("Tie");
		}
		if (a > b)
		{
			System.out.print("A");
		}
		if (a < b)
		{
			System.out.print("B");
		}





		 return 0;
	}
}

