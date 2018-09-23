package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[100][100];
		int min;
		int sum = 0;
		int t = 0;
		int c = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++) //??n???
		{
		   for (int j = 0;j < n;j++) //??n*n??
		   {
			  for (int k = 0;k < n;k++)
			  {
			  a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  }
			  System.out.print("\n");
		   }
		   for (int l = 0;l < n - 1;l++) //???????n-1???
		   {
			  for (int j = 0;j < n - l;j++)
			  {
				 t = 0;
				 for (int q = 0;q < n - l;q++)
				 {
				   if (a[j][q] == 0)
				   {
					   t = t + 1; //????0????????0
				   }
				 }
				  if (t > 0)
				  {
					  continue;
				  }
				  else
				  {
				  min = a[j][0];
				  for (int y = 1;y < n - l;y++) //?????????
				  {
					if (min > a[j][y])
					{
						min = a[j][y];
					}
				  }
				  for (int r = 0;r < n - l;r++)
				  {
					 a[j][r] = a[j][r] - min; //???0
				  }
				  }
			  }
			   for (int k = 0;k < n - l;k++)
			   {
				 c = 0;
				 for (int p = 0;p < n - l;p++)
				 {
				   if (a[p][k] == 0)
				   {
					   c = c + 1;
				   }
				 }
				 if (c > 0)
				 {
					 continue;
				 }
				   else
				   {
				  min = a[0][k];
				  for (int y = 1;y < n - l;y++)
				  {
					if (min > a[y][k])
					{
						min = a[y][k];
					}
				  }
				  for (int r = 0;r < n - l;r++)
				  {
					 a[r][k] = a[r][k] - min;
				  }
				   }
			   }
			   sum = sum + a[1][1]; //?sum????
			   a[0][0] = a[0][0]; //????????????
			   for (int e = 1;e < n - l;e++)
			   {
				   a[0][e] = a[0][e+1];
			   }
			   for (int g = 1;g < n - l;g++)
			   {
				   a[g][0] = a[g + 1][0];
			   }
			   for (int f = 1;f < n - l;f++)
			   {
				  for (int s = 1;s < n - l;s++)
				  {
				   a[f][s] = a[f + 1][s + 1];
				  }
			   }
		   }
		   System.out.print(sum);
		   System.out.print("\n");
		   sum = 0;
		}
		return 0;
	}


}

