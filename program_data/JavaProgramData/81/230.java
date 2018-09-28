package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int m;
	  int n;
	  int a;
	  int b;
	  int c;
	  int i;
	  int j;
	  int[][] u = new int[5][5];
	  for (i = 0;i < 5;i++)
	  {
			for (j = 0;j < 5;j++)
			{
			   String tempVar = ConsoleInput.scanfRead();
			   if (tempVar != null)
			   {
				   u[i][j] = Integer.parseInt(tempVar);
			   }
			}
	  }
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (m >= 0 && m <= 4 && n >= 0 && n <= 4)
		{
			  for (i = 0;i < 5;i++)
			  {
				  a = u[m][i];
			   u[m][i] = u[n][i];
			   u[n][i] = a;
			  }
			   for (i = 0;i < 5;i++)
			   {
				   System.out.printf("%d %d %d %d %d\n",u[i][0],u[i][1],u[i][2],u[i][3],u[i][4]);
			   }

		}
		else
		{
			System.out.print("error");
		}
		return 0;
	}


}

