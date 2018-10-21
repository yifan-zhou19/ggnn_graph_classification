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
		int i;
		int[] sz = new int[200];
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			if ((x == 0 && y == 1) || (x == 1 && y == 2) || (x == 2 && y == 0))
			{
				sz[i] = 1;
			}
			else if ((x == 0 && y == 2) || (x == 1 && y == 0) || (x == 2 && y == 1))
			{
				sz[i] = 2;
			}
			else
			{
				sz[i] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] == 1)
			{
				a += 1;
			}
			else if (sz[i] == 2)
			{
				b += 1;
			}
		}
		if (a > b)
		{
			System.out.print("A\n");
		}
		else if (a < b)
		{
			System.out.print("B\n");
		}
		else
		{
			System.out.print("Tie\n");
		}
		return 0;
	}







}

