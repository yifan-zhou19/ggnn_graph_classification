package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int m;
	   int[][] a = new int[5][5];
	   (int)(*p)[5];
	   int i;
	   int j;
	   int[] temp = new int[5];
	   p = a;
	   for (i = 0;i < 5;i++)
	   {
		   for (j = 0;j < 5;j++)
		   {
			   *(*(p + i) + j) = ConsoleInput.readToWhiteSpace(true);
		   }
	   }
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   if (n >= 5 || n < 0 || m >= 5 || m < 0)
	   {
		  System.out.print("error");
	   }
	   else
	   {
		  for (j = 0;j < 5;j++)
		  {
			  temp[j] = (*(p + n) + j);
		  }
		  for (j = 0;j < 5;j++)
		  {
			  *(*(p + n) + j) = *(*(p + m) + j);
		  }
		  for (j = 0;j < 5;j++)
		  {
			  *(*(p + m) + j) = temp[j];
		  }
	   for (i = 0;i < 5;i++)
	   {
			  for (j = 0;j < 5;j++)
			  {
				 if (j == 0)
				 {
				 System.out.print((*(p + i) + j));
				 }
				 else
				 {
					 System.out.print(' ');
					 System.out.print((*(p + i) + j));
				 }
				 if (j == 4)
				 {
					 System.out.print("\n");
				 }
			  }

	   }
	   }
	   return 0;
	}
}

