package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int k;
		  int n;
		  int[] row = new int[99];
		  int[] col = new int[99];
		  int[][][] s = new int[99][99][99];
		  int[] sum = new int[99];
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
				 row[i] = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 col[i] = Integer.parseInt(tempVar3);
			 }
			 for (j = 0;j < row[i];j++)
			 {
				for (k = 0;k < col[i];k++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						s[i][j][k] = Integer.parseInt(tempVar4);
					}
					if ((j == 0) || (k == 0) || (j == (row[i] - 1)) || (k == col[i] - 1))
					{
									sum[i] += s[i][j][k];
					}
				}
			 }

		  }
		  for (i = 0;i < n;i++)
		  {
			 System.out.printf("%d\n",sum[i]);
		  }






		   return 0;
	}
}

