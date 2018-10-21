package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][15];
		int i;
		int j;
		int k;
		int l;
	for (i = 0; ;i++)
	{
		 a[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   if (a[i][0] == -1)
	   {
		   break;
	   }
	  else
	  {
			 int n = 0;
		  for (j = 1; ;j++)
		  {
			   a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 if (a[i][j] == 0)
			 {
				 break;
			 }
		  }
			 for (k = 0;k <= j - 1;k++)
			 {
			  for (l = 0;l <= j - 1;l++)
			  {
				if (a[i][k] == 2 * a[i][l])
				{
					n = n + 1;
				}
			  }
			 }


		 System.out.print(n);
		 System.out.print("\n");
	  }
	}
	return 0;

	}



}

