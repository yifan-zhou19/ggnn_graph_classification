package <missing>;

public class GlobalMembers
{
	 public static int run(int y)
	 {
		 if (y % 100 != 0 && y % 4 == 0)
		 {
			 return 1;
		 }
		 else if (y % 400 == 0)
		 {
			 return 1;
		 }
		 else
		 {
			 return 0;
		 }
	 }
	public static int Main()
	{
		int y;
		int m;
		int d;
		int z = 0;
		int i;
		int k = 0;
		int[] md = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		while (y > 2800)
		{
			y -= 2800;
		}
		for (i = 1;i < y;i++)
		{
			if (run(i) != 0)
			{
				k++;
			}
		}
		for (i = 0;i < m - 1;i++)
		{
			z += md[i];
		}
		if (run(y) != 0 && m >= 3)
		{
			z++;
		}
		z += 365 * y + d + k - 1;
		if (z % 7 == 1)
		{
			System.out.print("Mon.");
		}
		else if (z % 7 == 2)
		{
			System.out.print("Tue.");
		}
		else if (z % 7 == 3)
		{
			System.out.print("Wed.");
		}
		else if (z % 7 == 4)
		{
			System.out.print("Thu.");
		}
		else if (z % 7 == 5)
		{
			System.out.print("Fri.");
		}
		else if (z % 7 == 6)
		{
			System.out.print("Sat.");
		}
		else
		{
			System.out.print("Sun.");
		}
		return 0;
	}

}

