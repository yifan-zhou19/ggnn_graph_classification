package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] sz = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i][0] = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= sz[i][0];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int[] result = new int[100];
		for (i = 0;i < n;i++)
		{
			result[i] = 60;
			for (j = 1;j <= sz[i][0];j++)
			{
			   if (sz[i][j] + 3 * j <= 60)
			   {
			   result[i] = result[i] - 3;
			   }
			   else if (sz[i][j] + 3 * j - 3 < 60)
			   {
				result[i] = sz[i][j];
				break;
			   }
			   else if (sz[i][j] + 3 * j - 3 >= 60)
			   {
				result[i] = sz[i][j - 1] + 60 - (sz[i][j - 1] + 3 * j - 3);
				break;
			   }
			}
			System.out.printf("%d\n",result[i]);
		}



		return 0;
	}
}

