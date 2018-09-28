package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int n;
		int[][] x = new int[200][2];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = 0;
		b = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				x[i][1] = Integer.parseInt(tempVar3);
			}
			if (x[i][0] == 0)
			{
				if (x[i][1] == 1)
				{
					a = a + 1;
				}
				else if (x[i][1] == 2)
				{
					b = b + 1;
				}
			}
			if (x[i][0] == 1)
			{
				if (x[i][1] == 2)
				{
					a = a + 1;
				}
				else if (x[i][1] == 0)
				{
					b = b + 1;
				}
			}
			if (x[i][0] == 2)
			{
				if (x[i][1] == 0)
				{
					a = a + 1;
				}
				else if (x[i][1] == 1)
				{
					b = b + 1;
				}
			}

		}
		if (a > b)
		{
			System.out.print("A\n");
		}
		else if (a < b)
		{
			System.out.print("B\n");
		}
			else
			{
			System.out.print("Tie\n");
			}


		return 0;

	}


}

