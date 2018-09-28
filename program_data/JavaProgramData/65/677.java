package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[200];
		int[] b = new int[200];
		int x;
		int y;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		x = 0;
		y = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead("\n");
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == b[i] - 1 || a[i] - b[i] == 2)
			{
				x++;
			}
			else if (a[i] - b[i] == 1 || b[i] - a[i] == 2)
			{
				y++;
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
		else if (x = y)
		{
			System.out.print("Tie");
		}
		return 0;
	}
}

