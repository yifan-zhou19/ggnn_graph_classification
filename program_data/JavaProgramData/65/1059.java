package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[200];
		int[] b = new int[200];
		int i;
		int x = 0;
		int y = 0;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if (a[i] == 0)
			{
				if (b[i] == 1)
				{
					x++;
				}
				else if (b[i] == 2)
				{
					y++;
				}
			}
			else if (a[i] == 1)
			{
				if (b[i] == 2)
				{
					x++;
				}
				else if (b[i] == 0)
				{
					y++;
				}
			}
			else if (a[i] == 2)
			{
				if (b[i] == 0)
				{
					x++;
				}
				else if (b[i] == 1)
				{
					y++;
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
		else
		{
			System.out.print("Tie");
		}
		return 0;
	}
}

