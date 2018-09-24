package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int x = 0;
		int y = 0;
		int z = 0;
		int[] a = new int[201];
		int[] b = new int[201];
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
		}
		for (j = 0;j < n;j++)
		{
			if (a[j] != b[j])
			{
				if ((a[j] == 0 && b[j] == 1) || (a[j] == 1 && b[j] == 2) || (a[j] == 2 && b[j] == 0))
				{
				x++;
				}
			else
			{
				y++;
			}
			}
			else
			{
				continue;
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
		else if (x == y)
		{
			System.out.print("Tie");
		}
	return 0;
	}
}

