package <missing>;

public class GlobalMembers
{
	public static int jg(int a, int b)
	{
		if ((a == 0 && b == 0) || (a == 1 && b == 1) || (a == 2 && b == 2))
		{
			return 0;
		}
		else
		{
			if ((a == 0 && b == 1) || (a == 1 && b == 2) || (a == 2 && b == 0))
			{
				return 1;
			}
			else
			{
				return 2;
			}
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int ay = 0;
		int by = 0;
		int pj = 0;
		int[] sza = new int[max];
		int[] szb = new int[max];
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
				sza[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				szb[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (jg(sza[i], szb[i]) == 1)
			{
				ay++;
			}
			else
			{
				if (jg(sza[i], szb[i]) == 2)
				{
					by++;
				}
				else
				{
					pj++;
				}
			}
		}
		if (ay == by)
		{
			System.out.print("Tie");
		}
		else
		{
			if (ay > by)
			{
				System.out.print("A");
			}
			else
			{
				System.out.print("B");
			}
		}
		return 0;
	}

}

