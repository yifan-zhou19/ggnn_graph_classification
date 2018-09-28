package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x = 0;
		int y;
		int z = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] c = new int[n];
		int[] d = new int[n];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				d[i] = Integer.parseInt(tempVar3);
			}
		}
		for (int i = 0;i < n;i++)
		{
			if (c[i] == d[i])
			{
				z++;
			}
			if (c[i] == 0 && d[i] == 1)
			{
				x++;
			}
			if (c[i] == 1 && d[i] == 2)
			{
				x++;
			}
			if (c[i] == 2 && d[i] == 0)
			{
				x++;
			}
		}
		y = n - x - z;
		if (x == y)
		{
			System.out.print("Tie");
		}
		if (x < y)
		{
			System.out.print("B");
		}
		if (x > y)
		{
			System.out.print("A");
		}
		return 0;
	}
}

