package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int count = 0;
		int[][] num = new int[20][16];
		int i;
		int j;
		int t;
		for (i = 0;i < 16;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num[0][i] = Integer.parseInt(tempVar);
			}
			if (num[0][i] == 0)
			{
				break;
			}
		}

		for (i = 1;i < 20;i++)
		{
		  if (num[i - 1][0] != -1)
		  {
			   for (j = 0;j < 16;j++)
			   {
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					num[i][j] = Integer.parseInt(tempVar2);
				}
				if (num[i][j] == 0 || num[i][j] == -1)
				{
				break;
				}
			   }
		  }
		  else
		  {
			  break;
		  }
		}

		for (i = 0;i < 20;i++)
		{
		  if (num[i][0] == -1)
		  {
			  break;
		  }
		  else
		  {
			   for (j = 0;j < 16;j++)
			   {
			  if (num[i][j] == 0)
			  {
				break;
			  }
			  else
			  {
				for (t = 0;t < 16;t++)
				{
				  if (num[i][t] == 0)
				  {
					break;
				  }
				  else
				  {
					  if (num[i][t] == 2 * num[i][j])
					  {
					   count++;
					  }
				  }
				}
			  }
			   }

			System.out.printf("%d\n",count);
			count = 0;
		  }
		}
	}

}

