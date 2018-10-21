package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[1000][3];
		int n;
		int a;
		int b;
		int i;
		int j;
		a = 0;
		b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar2);
				}
			}
			if (sz[i][0] == 0 && sz[i][1] == 1)
			{
				a++;
			}
			else if (sz[i][0] == 0 && sz[i][1] == 2)
			{
				b++;
			}
			else if (sz[i][0] == 0 && sz[i][1] == 0)
			{
				a = a;
			}
			else if (sz[i][0] == 1 && sz[i][1] == 0)
			{
				b++;
			}
			else if (sz[i][0] == 1 && sz[i][1] == 1)
			{
				a = a;
			}
			else if (sz[i][0] == 1 && sz[i][1] == 2)
			{
				a++;
			}
			else if (sz[i][0] == 2 && sz[i][1] == 0)
			{
				a++;
			}
			else if (sz[i][0] == 2 && sz[i][1] == 1)
			{
				b++;
			}
			else
			{
				b = b;
			}
		}
		if (a > b)
		{
			System.out.print("A");
		}
		else if (a < b)
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

