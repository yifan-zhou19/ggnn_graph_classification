package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int i;
		int j;
		int n;
		int m;
		int[][] sz = new int[200][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[j][0]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(sz[j][1]) = Integer.parseInt(tempVar3);
			}
			i = sz[j][0];
			m = sz[j][1];
			if (i == 0 && m == 1)
			{
				a = a + 1;
			}
			else if (i == 0 && m == 2)
			{
				b = b + 1;
			}
			else if (i == 1 && m == 0)
			{
				b = b + 1;
			}
			else if (i == 1 && m == 2)
			{
				a = a + 1;
			}
			else if (i == 2 && m == 0)
			{
				a = a + 1;
			}
			else if (i == 2 && m == 1)
			{
				b = b + 1;
			}
		}
		if (a > b)
		{
			System.out.print("A");
		}
		else if (a == b)
		{
			System.out.print("Tie");
		}
		else if (a < b)
		{
			System.out.print("B");
		}
		return 0;
	}

}

