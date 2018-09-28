package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[][] a = new int[5][5];
		  int i;
		  int j;
		  int l;
		  for (i = 0;i < 5;i++)
		  {
		  for (j = 0;j < 5;j++)
		  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a[i][j] = Integer.parseInt(tempVar);
		  }
		  }
		  }
		  int count = 0;
		  int max = 0;
		  int min = 0;
		  int temp;
		  for (i = 0;i < 5;i++)
		  {
				  max = 0;
				  min = 0;
				  for (j = 0;j < 5;j++)
				  {
						  if (a[i][j] > max)
						  {
										 max = a[i][j];
										 temp = j;
						  }
				  }
				  for (l = 0;l < 5;l++)
				  {
						  if (a[i][temp] > a[l][temp])
						  {
							  break;
						  }
				  }
				  if (l == 5)
				  {
						   System.out.printf("%d %d %d\n",i + 1,temp + 1,a[i][temp]);
						   count++;
				  }
		  }
		  if (count == 0)
		  {
			  System.out.print("not found\n");
		  }
	}

}

