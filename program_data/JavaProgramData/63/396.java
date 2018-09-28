package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	  int k = 0; //??3????k,i,W
	  int i = 0;
	  int W = 0;
	  int Xa = 0; //????2?????????
	  int Xb = 0;
	  int Ya = 0;
	  int Yb = 0;
	  int[][] a = new int[100][100]; //??3???
	  int[][] b = new int[100][100];
	  int[][] c = new int[100][100];
		 Xa = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 Ya = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 for (i = 0;i < Xa;i++) //??a?????
			 {
					  for (k = 0;k < Ya;k++)
					  {
						  a[i][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					  }
			 }
		 Xb = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 Yb = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 for (i = 0;i < Xb;i++)
			 {
					  for (k = 0;k < Yb;k++)
					  {
						 b[i][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					  }
			 }
		 for (i = 0;i < Xa;i++) //??c?????
		 {
				  for (k = 0;k < Yb;k++)
				  {
					  for (W = 0;W < Xb;W++)
					  {
						   c[i][k] = c[i][k] + a[i][W] * b[W][k];
					  }
				  }
		 }
		   for (i = 0;i < Xa;i++) //??c??
		   {
				  for (k = 0;k < Yb;k++)
				  {
					if (k == Yb - 1)
					{
						  System.out.print(c[i][k]);
						  System.out.print("\n");
					}
					else
					{
						  System.out.print(c[i][k]);
						  System.out.print(" ");
					}
				  }
		   }

	return 0;
	}

}

