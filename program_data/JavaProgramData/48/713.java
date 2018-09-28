package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] xijun = new int[11][11];
		for (int i = 0;i < 11;i++)
		{
			for (int j = 0;j < 11;j++)
			{
				xijun[i][j] = 0;
			}
		}
		int[][] result = new int[11][11];
		int m = 0;
		int n = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		xijun[5][5] = m;
		result[5][5] = m;
		for (int x = 0;x < n;x++)
		{
			for (int i = 0;i < 11;i++)
			{
				for (int j = 0;j < 11;j++)
				{
					xijun[i][j] = result[i][j];
				}
			}
			for (int i = 1;i < 10;i++)
			{
				for (int j = 1;j < 10;j++)
				{
					result[i][j] = 2 * xijun[i][j] + xijun[i][j + 1] + xijun[i][j - 1] + xijun[i + 1][j] + xijun[i - 1][j] + xijun[i + 1][j + 1] + xijun[i + 1][j - 1] + xijun[i - 1][j + 1] + xijun[i - 1][j - 1];
				}
			}



		}
		for (int i = 1;i < 10;i++)
		{
			for (int j = 1;j < 10;j++)
			{
				if (j == 1)
				{
					System.out.print(result[i][j]);
				}
				else if (j == 9)
				{
					System.out.print(" ");
					System.out.print(result[i][j]);
					System.out.print("\n");
				}
				else
				{
					System.out.print(" ");
					System.out.print(result[i][j]);
				}
			}
		}

		/*int i=0;
		int j=0;
		for(i=1;i<10;i++)
			 {
				 bool p=0;
				 for(j=1;j<10;j++)
			 {
				 if(p) cout<<" ";
				 p=1;
				 cout<<result[i][j];
			 }
			 cout<<endl;
			 }
	
	*/
	return 0;
	}

}

