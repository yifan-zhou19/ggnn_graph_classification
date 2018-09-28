package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int b = 0;
		int c = 0;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] sz = new int[201][3];
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
			if ((sz[i][0] == 0 && sz[i][1] == 1) || (sz[i][0] == 1 && sz[i][1] == 2) || (sz[i][0] == 2 && sz[i][1] == 0))
			{
				a++;
			}
			else
			{
			if ((sz[i][0] == 1 && sz[i][1] == 0) || (sz[i][0] == 2 && sz[i][1] == 1) || (sz[i][0] == 0 && sz[i][1] == 2))
			{
				b++;
			}
			else
			{
			if (sz[i][0] == sz[i][1])
			{
				a++;
				b++;
			}
			}
			}
		}
		if (a > b)
		{
			System.out.print("A");

		}
		else
		{
		if (b > a)
		{
				System.out.print("B");
		}
		else
		{
		if (b = a)
		{
				System.out.print("Tie");
		}
		}
		}
		return 0;
	}




}

