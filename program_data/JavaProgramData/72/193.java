package <missing>;

public class GlobalMembers
{
	//???  ??? 1000010334 
	public static int Main()
	{
		int m = 0; //?? ??
		int n = 0; //??  ??
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] h = new int[22][22]; //????
		for (int i = 0;i < 22;i++) //???????????0
		{
		  h[0][i] = 0;
		  h[i][0] = 0;
		  h[i][n + 1] = 0;
		  h[m + 1][i] = 0;
		}

		for (int i = 1;i <= m;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				h[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		//????? 
		for (int i = 1;i <= m;i++) //?????
		{
		   for (int j = 1;j <= n;j++)
		   {
			  if (h[i][j] >= h[i - 1][j] != 0 && h[i][j] >= h[i + 1][j] != 0 && h[i][j] >= h[i][j - 1] != 0 && h[i][j] >= h[i][j + 1])
			  {
				 System.out.print(i - 1);
				 System.out.print(" ");
				 System.out.print(j - 1);
				 System.out.print("\n");
			  }
		   }
		}


		return 0;
	}

}

