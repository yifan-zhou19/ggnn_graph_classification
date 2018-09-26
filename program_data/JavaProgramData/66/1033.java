package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int z;
		int m;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			z = Integer.parseInt(tempVar3);
		}
		m = (365 % 7) * (x - 1) + z + (x - 1) / 4 + (x - 1) / 400 - (x - 1) / 100;
		int[] n = new int[12];
		n[1] = n[3] = n[5] = n[7] = n[8] = n[10] = n[12] = 31;
		n[4] = n[6] = n[9] = n[11] = 30;
		if ((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0))
		{
			n[2] = 29;
		}
		else
		{
			n[2] = 28;
		}
		for (j = 1;j <= 12;j++)
		{
			if (j < y)
			{
				m = m + n[j];
			}
		}
		if (m % 7 == 0)
		{
			System.out.print("Sun.");
		}
		else if (m % 7 == 1)
		{
			System.out.print("Mon.");
		}
		else if (m % 7 == 2)
		{
			System.out.print("Tue.");
		}
		else if (m % 7 == 3)
		{
			System.out.print("Wed.");
		}
		else if (m % 7 == 4)
		{
			System.out.print("Thu.");
		}
		else if (m % 7 == 5)
		{
			System.out.print("Fri.");
		}
		else
		{
			System.out.print("Sat.");
		}
		return 0;
	}
}

