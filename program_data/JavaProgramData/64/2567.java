package <missing>;

public class GlobalMembers
{
	public static int[][] zuob = new int[12][3]; //???

	public static int[][] vis = new int[12][12];
	public static int Main()
	{
	   // freopen("1.in","r",stdin);
	   // freopen("1.out","w",stdout);
		double[][] distance = new double[12][12];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(vis,(Integer.SIZE / Byte.SIZE),0);
		int n;
		int ii;
		int jj;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
		zuob[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		zuob[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		zuob[i][2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n - 1;i++)
		{
		  for (int j = i + 1;j < n;j++)
		  {
			distance[i][j] = Math.sqrt((zuob[i][0] - zuob[j][0]) * (zuob[i][0] - zuob[j][0]) + (zuob[i][1] - zuob[j][1]) * (zuob[i][1] - zuob[j][1]) + (zuob[i][2] - zuob[j][2]) * (zuob[i][2] - zuob[j][2]));
		  }
		}

		 for (int z = 0;z < (n * (n - 1) / 2);z++)
		 {
			 double max = -1;
		 for (int i = 0;i < n - 1;i++)
		 {
		  for (int j = i + 1;j < n;j++)
		  {
		   if (vis[i][j] == 0 && distance[i][j] > max)
		   {
				max = distance[i][j];
				ii = i;
				jj = j;
		   }
		  }
		 }
		 System.out.print("(");
		 System.out.print(zuob[ii][0]);
		 System.out.print(",");
		 System.out.print(zuob[ii][1]);
		 System.out.print(",");
		 System.out.print(zuob[ii][2]);
		 System.out.print(")");
		 System.out.print("-");
		 System.out.print("(");
		 System.out.print(zuob[jj][0]);
		 System.out.print(",");
		 System.out.print(zuob[jj][1]);
		 System.out.print(",");
		 System.out.print(zuob[jj][2]);
		 System.out.print(")");
		 System.out.print("=");
		 System.out.printf("%.2lf\n",max);
		  vis[ii][jj] = 1;
		 }
		  return 0;
	}





}

