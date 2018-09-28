package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int M = 0; //M,k,i?????
	int k = 0;
	int i = 0;
	int Xa = 0; //????a,b??????
	int Xb = 0;
	int Ya = 0;
	int Yb = 0;
	int[][] c = new int[100][100]; //??3?2????????
	int[][] a = new int[100][100];
	int[][] b = new int[100][100];
		Xa = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		Ya = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   for (i = 0;i < Xa;i++)
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
		  for (i = 0;i < Xa;i++) //?????????
		  {
				 for (k = 0;k < Yb;k++)
				 {
					  for (M = 0;M < Xb;M++)
					  {
						   c[i][k] += a[i][M] * b[M][k];

					  }
				 }
		  }

		  for (i = 0;i < Xa;i++) //??
		  {
					for (k = 0;k < Yb;k++)
					{
						  if (k != Yb - 1)
						  {
						   System.out.print(c[i][k]);
						   System.out.print(" ");
						  }
						if (k == Yb - 1)
						{
						   System.out.print(c[i][k]);
						   System.out.print("\n");
						}
					}
		  }
	return 0;
	}
}

