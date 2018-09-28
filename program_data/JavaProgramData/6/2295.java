package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[][] a = new int[100][100];
	  int i;
	  int j;
	  int k;
	  int m;
	  int n;
	  int num;
	  int sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=null;
	  int p = null;
	  num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (k = 1;k <= num;k++)
	{
	  m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (i = 0;i < m;i++)
	  {
	   for (j = 0;j < n;j++)
	   {
		  *(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
	   }
	  }
		if (m == 1 || n == 1)
		{
	   for (i = 0;i < m;i++)
	   {
		for (j = 0;j < n;j++)
		{
		   sum = sum + *(*(a + i) + j);
		}
	   }
		}
	else
	{
		for (i = 0;i < n - 1;i++)
		{
		   sum = sum + *(a + i);
		}
		 for (i = 0;i < m - 1;i++)
		 {
			sum = sum + *(*(a + i) + n - 1);
		 }
		  for (i = 1;i < n;i++)
		  {
		   sum = sum + *(*(a + m - 1) + i);
		  }
		  for (i = 1;i < m;i++)
		  {
			sum = sum + **(a + i);
		  }
	}
		  System.out.print(sum);
		  System.out.print("\n");
		  sum = 0;
	}
	 return 0;
	}

}

