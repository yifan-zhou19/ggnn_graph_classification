package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int r;
		int c;
		int rs;
		int cs;
		int[][] Shuzu = new int[row][col];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < r;i++)
		{
			for (j = 0;j < c;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					Shuzu[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		/*printf("%d\n",Shuzu[0][0]);*/
		for (i = rs = 0,j = cs = 0;;)
		{
			if (Shuzu[i][j] == 0)
			{
				break;
			}
			System.out.printf("%d\n",Shuzu[i][j]);
			Shuzu[i][j] = 0;
			if (i == rs && j < c - 1 && j> cs - 1)
			{
				j++;
			}
			else if (i == rs && j == c - 1)
			{
				i++;
				r--;
			}
			else if (i < r && i> rs && j == c - 1)
			{
				i++;
			}
			else if (i == r && j == c - 1)
			{
				j--;
				cs++;
			}
			else if (i == r && j > cs - 1 && j < c - 1)
			{
				j--;
			}
			else if (i == r && j == cs - 1)
			{
				i--;
				rs++;
			}
			else if (i > rs && i < r && j == cs - 1)
			{
				i--;
			}
			else if (i == rs && j == cs - 1)
			{
				j++;
				c--;
			}
		}
		return 0;
	}
}

