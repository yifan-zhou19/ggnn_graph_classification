package <missing>;

public class GlobalMembers
{
	//??????????????
	//??????
	//?????2011-1-8


	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int x;
		int y;
		int t;
		int[] ans = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k <= n;k++)
		{
			   x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			   y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			   for (i = 1;i <= x;i++)
			   {
				 for (j = 1;j <= y;j++)
				 {
						t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						if ((i == 1) || (i == x) || (j == 1) || (j == y))
						{
							ans[k] += t; //???????
						}
				 }
			   }
		}
		for (i = 1;i <= n;i++) //??
		{
			  System.out.print(ans[i]);
			  if (i != n)
			  {
				  System.out.print("\n");
			  }
		}
		return 0;
	}

}

