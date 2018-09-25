package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[][] a = new int[5][5];
		  int i;
		  int j;
		  int z;
		  int m;
		  int x;
		  int y;
		  int count = 0;
		  int b;
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
		  int s;
		  for (i = 0;i < 5;i++)
		  {
			  for (j = 0;j < 5;j++)
			  {
				   s = a[i][0];
				   for (z = 0;z < 5;z++)
				   {
					   if (z == j)
					   {
							   continue;
					   }
					   else
					   {
						   if (a[i][z] > s)
						   {
										 s = a[i][z];
						   }
					   }
				   }
				   if (a[i][j] >= s)
				   {
								  s = a[0][j];
								  for (m = 0;m < 5;m++)
								  {
										   if (m == i)
										   {
												   continue;
										   }
										   else
										   {
											   if (a[m][j] < s)
											   {
															 s = a[m][j];
											   }
										   }
								  }
								  if (a[i][j] <= s)
								  {
											  x = i + 1;
											  y = j + 1;
											  count++;
											  b = a[i][j];
								  }
				   }
			  }
		  }
		  if (count == 0)
		  {
					  System.out.print("not found");
		  }
		  else
		  {
			  System.out.printf("%d %d %d",x,y,b);
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}


}

