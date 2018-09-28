package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[200];
		int[] b = new int[200];
		int c;
		int d = 0;
		int e = 0;
		int f;
		int g;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = Integer.parseInt(tempVar);
		}
		for (f = 0;f < c;f++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[f] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[f] = Integer.parseInt(tempVar3);
			}
			if (a[f] == 0)
			{
				if (b[f] == 1)
				{
					d++;
				}
				if (b[f] == 2)
				{
					e++;
				}
			}
			if (a[f] == 1)
			{
				if (b[f] == 2)
				{
					d++;
				}
				if (b[f] == 0)
				{
					e++;
				}
			}
			if (a[f] == 2)
			{
				if (b[f] == 0)
				{
					d++;
				}
				if (b[f] == 1)
				{
					e++;
				}
			}
		}
		if (d > e)
		{
			System.out.print("A");
		}
		if (d == e)
		{
			System.out.print("Tie");
		}
		if (d < e)
		{
			System.out.print("B");
		}
		return 0;
	}
}

