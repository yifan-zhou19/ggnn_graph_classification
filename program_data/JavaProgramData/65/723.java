package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		x = 0;
		y = 0;
		int[] a = new int[200];
		int[] b = new int[200];
		int i;
		for (i = 1;i <= n;i++)
		{
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

			if (a[i] == 0)
			{

				if (b[i] == 1)
				{
					x = x + 1;
				}
				if (b[i] == 2)
				{
					y = y + 1;
				}
			}
			if (a[i] == 1)
			{
				if (b[i] == 0)
				{
					y = y + 1;
				}
				if (b[i] == 2)
				{
					x = x + 1;
				}
			}
			if (a[i] == 2)
			{
				if (b[i] == 0)
				{
					x = x + 1;
				}
				if (b[i] == 1)
				{
					y = y + 1;
				}
			}
		}
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

