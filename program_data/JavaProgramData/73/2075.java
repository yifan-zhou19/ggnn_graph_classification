package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[] max = {-110, -110, -110, -110, -110};
		int[] min = {100000, 1100000, 1100000, 1100000, 1100000};
		int sum = 0;
		int[] p = new int[5];
		int[] q = new int[5];
		int[] x = new int[5];
		int[] y = new int[5];
		int i = 0;
		int j = 0;
				for (i = 0;i <= 4;i++)
				{
		   for (j = 0;j <= 4;j++)
		   {
	  a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
				}


		 for (i = 0;i <= 4;i++)
		 {
		   for (j = 0;j <= 4;j++)
		   {
			 if (a[i][j] > max[i])
			 {
				max[i] = a[i][j];
			 }
			 else
			 {
				 continue;
			 }
		   }
		 }



		 for (i = 0;i <= 4;i++)
		 {
		   for (j = 0;j <= 4;j++)
		   {
			 if (max[i] == a[i][j])
			 {
				p[i] = i;
				q[i] = j;
				break;
			 }
			  else
			  {
				  continue;
			  }
		   }
		 }





		 for (j = 0;j <= 4;j++)
		 {
		  for (i = 0;i <= 4;i++)
		  {
			 if (min[j] > a[i][j])
			 {
			   min[j] = a[i][j];
			 }
			 else
			 {
				 continue;
			 }
		  }
		 }



		 for (j = 0;j <= 4;j++)
		 {
		   for (i = 0;i <= 4;i++)
		   {
			 if (min[j] == a[i][j])
			 {
				  x[j] = i;
				  y[j] = j;
			 }
			  else
			  {
				  continue;
			  }
		   }
		 }


		 for (i = 0;i <= 4;i++)
		 {
		  for (j = 0;j <= 4;j++)
		  {
			if ((max[i] == min[j]) && (p[i] == x[j]) && (q[i] == y[j]))
			{
			 System.out.print(p[i] + 1);
			 System.out.print(" ");
			 System.out.print(q[i] + 1);
			 System.out.print(" ");
			 System.out.print(max[i]);
			}
			else
			{
				sum = sum + 1;
			}
		  }
		 }

		 if (sum == 25)
		 {
		  System.out.print("not found");
		  System.out.print("\n");
		 }
			   return 0;
	}



}

