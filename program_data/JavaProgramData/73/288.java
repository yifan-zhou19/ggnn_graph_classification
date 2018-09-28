package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] num = new int[5][5];
	   int i;
	   int j;
	   for (j = 0;j < 5;j++) //????
	   {
		  for (i = 0;i < 5;i++)
		  {
				 num[j][i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  }
	   }
	   int maxhang;
	   int minlie;
	   int m;
	   int k;
	   int l = 0;
		for (j = 0;j < 5;j++) //??????
		{
		  for (i = 0;i < 5;i++)
		  {
				 k = 0;
			   maxhang = num[j][i];
			   for (m = 0;m < 5;m++)
			   {
					 if (num[j][m] > maxhang)
					 {
						 k = k + 1; //?????
					 }
			   }
			   minlie = num[j][i];
			   for (m = 0;m < 5;m++)
			   {
					  if (num[m][i] < minlie)
					  {
						  k = k + 1; //?????
					  }
			   }
			   if (k == 0)
			   {
					 System.out.print(j + 1);
					 System.out.print(' ');
					 System.out.print(i + 1);
					 System.out.print(' ');
					 System.out.print(num[j][i]);
				  l = l + 1;
			   } //???????
		  }
		}
	   if (l == 0)
	   {
		   System.out.print("not found");
	   }
	   return 0;
	}
}

