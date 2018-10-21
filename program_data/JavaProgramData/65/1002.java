package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] c = new int[200][2];
		int a = 0;
		int b = 0;
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
				c[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				c[i][1] = Integer.parseInt(tempVar3);
			}
			if (c[i][0] == 0)
			{
				if (c[i][1] == 1)
				{
					a++;
				}
				if (c[i][1] == 2)
				{
					b++;
				}
				if (c[i][1] == 0)
				{
					a++;
					b++;
				}
			}
			if (c[i][0] == 1)
			{
				if (c[i][1] == 0)
				{
					b++;
				}
				if (c[i][1] == 2)
				{
					a++;
				}
				if (c[i][1] == 1)
				{
					a++;
					b++;
				}
			}
			if (c[i][0] == 2)
			{
				if (c[i][1] == 0)
				{
					a++;
				}
				if (c[i][1] == 1)
				{
					b++;
				}
				if (c[i][1] == 2)
				{
					a++;
					b++;
				}
			}
		}
		if (a > b)
		{
			System.out.print("A");
		}
		if (a == b)
		{
			System.out.print("Tie");
		}
		if (a < b)
		{
			System.out.print("B");
		}

		return 0;
	}
}

