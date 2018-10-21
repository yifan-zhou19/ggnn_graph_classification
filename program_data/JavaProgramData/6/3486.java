package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[][] size = new int[100][2];
		int[][][] m = new int[100][100][100];
		int i;
		int j;
		int l;
		int[] sum = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			sum[i] = 0;
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  size[i][0] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  size[i][1] = Integer.parseInt(tempVar3);
		  }
		  for (j = 0;j < size[i][0];j++)
		  {
			  for (l = 0;l < size[i][1];l++)
			  {
				  String tempVar4 = ConsoleInput.scanfRead();
				  if (tempVar4 != null)
				  {
					  m[i][j][l] = Integer.parseInt(tempVar4);
				  }
			  }
		  }
			//printf("\n");
			if ((size[i][1] == 1) && (size[i][0] == 1))
			{
				sum[i] = m[i][0][0];
			}
			else
			{
		  for (l = 0;l < size[i][1];l++)
		  {
			  if (size[i][1] == 1)
			  {
				  sum[i] = sum[i] + m[i][0][l];
			  }
			  else
			  {
				  sum[i] = sum[i] + m[i][0][l] + m[i][size[i][0] - 1][l];
			  }
		  }
		  for (j = 1;j <= size[i][0] - 2;j++)
		  {
			  sum[i] = sum[i] + m[i][j][0] + m[i][j][size[i][1] - 1];
		  }
			}
		 // printf("%d",sum[i]);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d\n",sum[i]);
		}
		return 0;
	}
}

