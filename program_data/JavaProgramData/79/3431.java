package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[300];
		int[] m = new int[300];
		int i;
		int j;
		int[] k = new int[300];
		int x;
		int y;
		int[][] monkey = new int[300][300];
		for (y = 0;;y++)
		{
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   n[y] = Integer.parseInt(tempVar);
		   }
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   m[y] = Integer.parseInt(tempVar2);
		   }
		   if (n[y] == 0 && m[y] == 0)
		   {
			   break;
		   }

		}

		for (x = 0;x < y;x++)
		{
			k[x] = 0;
		   for (i = 0;i < n[x];i++)
		   {
			   monkey[x][i] = i + 1;
		   }
		   for (i = 0,j = 1;k[x] != n[x] - 1;)
		   {
			  if (j == m[x])
			  {
				  monkey[x][i] = 0;
				  k[x]++;
				  j = 0;
			  }
			  if (i != n[x] - 1)
			  {
				  i++;
			  }
			  else
			  {
				  i = 0;
			  }
			  if (j != m[x] && monkey[x][i] != 0)
			  {
				  j++;
			  }
		   }
		   for (i = 0;i < n[x];i++)
		   {
			  if (monkey[x][i] != 0)
			  {
				  System.out.printf("%d\n",monkey[x][i]);
			  }
		   }

		}
	   return 0;
	}

}

