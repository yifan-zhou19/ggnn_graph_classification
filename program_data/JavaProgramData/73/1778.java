package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int max = 0;
	  int flag = 0;
	  int n = 0;
	  int row;
	  int col;
	  int[][] a = new int[6][6];
	  int i;
	  int j;
	  int k;


	  for (i = 1;i <= 5;i++)
	  {
						for (j = 1;j <= 5;j++)
						{
										  String tempVar = ConsoleInput.scanfRead();
										  if (tempVar != null)
										  {
											  a[i][j] = Integer.parseInt(tempVar);
										  }
						}
	  }



	  for (i = 1;i <= 5;i++,max = 0)
	  {

						for (j = 1;j <= 5;j++)
						{
										  if (a[i][j] > max)
										  {
														  max = a[i][j];
														  row = i;
														  col = j;
										  }
						}


						for (k = 1;k <= 5;k++)
						{
										 if (a[k][col] < max)
										 {
											 flag = 1;
											 break;
										 }
						}
						if (flag == 0)
						{
							System.out.printf("%d %d %d\n",row,col,max);
							n++;
						}
						else
						{
							flag = 0;
						}

	  }
	  if (n == 0)
	  {
		  System.out.print("not found\n");
	  }

	}

}

