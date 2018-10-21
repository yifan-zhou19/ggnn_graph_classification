package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int w = 0;
		int l = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] sz = new int[n][2];
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
		}
		for (i = 0;i < n;i++)
		{
				if ((sz[i][0] == 0 && sz[i][1] == 0) || (sz[i][0] == 1 && sz[i][1] == 1) || (sz[i][0] == 2 && sz[i][1] == 2))
				{
					w = w;
					l = l;

				}
				else if ((sz[i][0] == 0 && sz[i][1] == 1) || (sz[i][0] == 1 && sz[i][1] == 2) || (sz[i][0] == 2 && sz[i][1] == 0))
				{
					w = w + 1;
					l = l;

				}
				else if ((sz[i][0] == 0 && sz[i][1] == 2) || (sz[i][0] == 1 && sz[i][1] == 0) || (sz[i][0] == 2 && sz[i][1] == 1))
				{
					w = w;
					l = l + 1;

				}


		}
		if (w > l)
		{
			System.out.print("A");
		}
		else if (w < l)
		{
			System.out.print("B");
		}
		else if (w == l)
		{
			System.out.print("Tie");
		}
		return 0;
	}
}

