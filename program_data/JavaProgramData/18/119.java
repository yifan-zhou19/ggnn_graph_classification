package <missing>;

public class GlobalMembers
{
	//?????????
	public static int sum = 0;
	public static int n;
	public static void GuiLing(int[][] num, int n, int move)
	{
	   int i;
	   int j;
	   int min;
	   //???
	   for (i = 0;i < n;i++)
	   {
		  if ((move != 0) && ((i >= 1) && (i <= move)))
		  {
			  continue; //??????�??�????
		  }
		  min = num[i][0];
		  for (j = 1;j < n;j++)
		  {
			 if ((move != 0) && ((j >= 1) && (j <= move)))
			 {
				 continue; //??????�??�????
			 }
			 if (num[i][j] < min)
			 {
				 min = num[i][j];
			 }
		  }
		  if (min != 0)
		  {
			for (j = 0;j < n;j++)
			{
				if ((move != 0) && ((j >= 1) && (j <= move)))
				{
					continue;
				}
				num[i][j] = num[i][j] - min;
			}
		  }
	   }
		 //???
		for (j = 0;j < n;j++)
		{
		  if ((move != 0) && ((j >= 1) && (j <= move)))
		  {
			  continue; //??????�??�????
		  }
		  min = num[0][j];
		  for (i = 1;i < n;i++)
		  {
			 if ((move != 0) && ((i >= 1) && (i <= move)))
			 {
				 continue; //??????�??�????
			 }
			 if (num[i][j] < min)
			 {
				 min = num[i][j];
			 }
		  }
		  if (min != 0)
		  {
			for (i = 0;i < n;i++)
			{
				if ((move != 0) && ((i >= 1) && (i <= move)))
				{
					continue;
				}
				num[i][j] = num[i][j] - min;
			}
		  }
		}
	}
	public static void XiaoJian(int[][] num, int move)
	{
		 if (move == n - 1) //??????1????????
		 {
			 ;
		 }
		 else
		 {
		 GuiLing(num, n, move); //??
		 sum = sum + num[move+1][move+1];
		 XiaoJian(num, move+1); //????
		 }
	}
	public static int Main()
	{
		int i;
		int j;
		int t;
		int[][] num = new int[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (t = 0;t < n;t++)
		{
		  sum = 0;
		  for (i = 0;i < n;i++)
		  {
		   for (j = 0;j < n;j++)
		   {
			 num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
		  }
			 XiaoJian(num, 0);
			 System.out.print(sum);
			 System.out.print("\n");
		}
		return 0;
	}


}

