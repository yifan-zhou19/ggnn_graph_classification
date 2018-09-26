package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[200];
		int[] b = new int[200];
		int x = 0;
		int y = 0;
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(b[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (int m = 0;m < n;m++)
		{
			if (a[m] < b[m])
			{
				if (a[m] == 0 && b[m] == 2)
				{
					y++;
				}
				else
				{
					x++;
				}
			}
			if (a[m] > b[m])
			{
				if (a[m] == 2 && b[m] == 0)
				{
					x++;
				}
				else
				{
					y++;
				}
			}
		}
		if (x > y)
		{
			System.out.print("A");
		}
		if (x < y)
		{
			System.out.print("B");
		}
		if (x == y)
		{
			System.out.print("Tie");
		}
		return 0;
	}

}

