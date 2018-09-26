package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[201];
		int[] b = new int[201];
		int x = 0;
		int y = 0;
		int t = 0;
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
				else if (b[i] == 2)
				{
					y = y + 1;
				}
				else if (b[i] == 0)
				{
					t = t + 1;
				}
			}
			else if (a[i] == 1)
			{
				if (b[i] == 1)
				{
					t = t + 1;
				}
				else if (b[i] == 2)
				{
					x = x + 1;
				}
				else if (b[i] == 0)
				{
					y = y + 1;
				}
			}

			else if (a[i] == 2)
			{
				if (b[i] == 1)
				{
					y = y + 1;
				}
				else if (b[i] == 2)
				{
					t = t + 1;
				}
				else if (b[i] == 0)
				{
					x = x + 1;
				}
			}
		}
		if (x > y)
		{
			System.out.print("A");
		}
		else if (x < y)
		{
			System.out.print("B");
		}
		else if ((x == 0 && y == 0) || x == y)
		{
			System.out.print("Tie");
		}







	return 0;
	}

}

