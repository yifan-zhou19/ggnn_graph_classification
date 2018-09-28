package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] sz = new int[200][2];
		int a;
		int b;
		a = 0;
		b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 1;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar2);
				}
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i][1] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((sz[i][0] == 0 && sz[i][1] == 1) || (sz[i][0] == 1 && sz[i][1] == 2) || (sz[i][0] == 2 && sz[i][1] == 0))
			{
			   a += 1;
			}
			else if ((sz[i][0] == 1 && sz[i][1] == 0) || (sz[i][0] == 2 && sz[i][1] == 1) || (sz[i][0] == 0 && sz[i][1] == 2))
			{
			   b += 1;
			}
			else
			{
			   a += 0;
			   b += 0;
			}
		}
		if (a < b)
		{
			System.out.print("B");
		}
		else if (a == b)
		{
			System.out.print("Tie");
		}
		else
		{
			System.out.print("A");
		}
		return 0;
	}





}

