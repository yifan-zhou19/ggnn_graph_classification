package <missing>;

public class GlobalMembers
{
	/**  
	* @file   ????  .cpp  
	* @author ??? 
	* @date   2013-11-01  * @description 
	*          ??????:????    */ 
	public static int Main()
	{
		char[][] a = new char[101][101];
		char b;
		int N;
		int d = 1;
		int m;
		int number = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 0;i < N;i++)
		{
			for (int j = 0;j < N;j++)
			{
				b = ConsoleInput.readToWhiteSpace(true).charAt(0);
				a[i][j] = b;
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (d < m)
		{
			for (int i = 0;i < N;i++)
			{
			   for (int j = 0;j < N;j++)
			   {
				   if (a[i][j] == '@')
				   {
					if (a[i][j + 1] == '.')
					{
						a[i][j + 1] = '!';
					}
					if (a[i + 1][j] == '.')
					{
						a[i + 1][j] = '!';
					}
					if (a[i][j - 1] == '.')
					{
						a[i][j - 1] = '!';
					}
					if (a[i - 1][j] == '.')
					{
						a[i - 1][j] = '!';
					}
				   }
			   }
			}
		   for (int i = 0;i < N;i++)
		   {
			for (int j = 0;j < N;j++)
			{
				if (a[i][j] == '!')
				{
					a[i][j] = '@';
				}
			}
		   }
		   d++;
		}
		for (int i = 0;i < N;i++)
		{
			for (int j = 0;j < N;j++)
			{
				if (a[i][j] == '@')
				{
					number++;
				}
			}
		}
		 System.out.print(number);
		 System.out.print("\n");
		  return 0;
	}


}

