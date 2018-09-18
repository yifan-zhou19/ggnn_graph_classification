package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int[][] a = new int[105][105];
	  int sum = 0;
	  int min;
	  int p;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  p = n;
	  for (int k = 1;k <= n;k++) //n???
	  {
	  for (i = 0;i <= n - 1;i++)
	  {
		  for (j = 0;j <= n - 1;j++)
		  {
	   a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  }
	  }

	  for (int m = 1;m <= n - 1;m++)
	  {
	  for (i = 0;i <= p - 1;i++)
	  {
	   min = 10000;
	   for (j = 0;j <= p - 1;j++)
	   {
	   if (a[i][j] < min)
	   {
	   min = a[i][j];
	   }
	   }
	   for (j = 0;j <= p - 1;j++)
	   {
	   a[i][j] -= min;
	   }
	  }
	   for (j = 0;j <= p - 1;j++)
	   {
		min = 10000;
		for (i = 0;i <= p - 1;i++)
		{
		if (a[i][j] < min)
		{
		min = a[i][j];
		}
		}
		 for (i = 0;i <= p - 1;i++)
		 {
		 a[i][j] -= min;
		 }
	   }
		 sum += a[1][1];
		// cout<<a[1][1]<<endl;


		 for (i = 2;i <= p - 1;i++)
		 { //??2?2?
		 for (j = 0;j <= p - 1;j++)
		 {
		 a[i - 1][j] = a[i][j];
		 }
		 }
		 for (j = 2;j <= p - 1;j++)
		 {
		 for (i = 0;i <= p - 1;i++)
		 {
		 a[i][j - 1] = a[i][j];
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

