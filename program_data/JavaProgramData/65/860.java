package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int b = 0;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
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
			if (x - y == 1 || (x == 0 && y == 2))
			{
				b++;
			}
			 if (y - x == 1 || (y == 0 && x == 2))
			 {
				a++;
			 }
		}
		if (a > b)
		{
			System.out.print("A");
		}
		else if (a < b)
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

