package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int y;
		int[] a = new int[201];
			int[] b = new int[201];
		a[201] = 0;
		b[201] = 0;
		x = 0;
		y = 0;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if (a[i] + 1 == b[i] || a[i] - 2 == b[i])
			{
				x++;
			}
			else if (a[i] != b[i])
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
		else
		{
			System.out.print("Tie");
		}
		return 0;

	}

}

