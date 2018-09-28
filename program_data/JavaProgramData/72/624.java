package <missing>;

public class GlobalMembers
{
	//**************************************
	//*???????                     
	//*????? 1100012780     	        
	//*???2011.12.30                     
	//**************************************
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int[][] height = new int[22][22]; //??????????
		for (i = 1;i <= m;i++) //???????0?????????
		{
			for (j = 1;j <= n;j++)
			{
				height[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int count = 0; //??????????????
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (height[i][j] >= height[i - 1][j] != 0 && height[i][j] >= height[i + 1][j] != 0 && height[i][j] >= height[i][j + 1] != 0 && height[i][j] >= height[i][j - 1])
				{
					count++;
				}
			}
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (height[i][j] >= height[i - 1][j] != 0 && height[i][j] >= height[i + 1][j] != 0 && height[i][j] >= height[i][j + 1] != 0 && height[i][j] >= height[i][j - 1])
				{
					count--;
					System.out.print(i - 1);
					System.out.print(" ");
					System.out.print(j - 1);
					if (count != 0)
					{
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}

}

