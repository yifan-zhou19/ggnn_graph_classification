package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] s = new int[6][6]; //s[6][6]??????????????????????????????
		int i;
		int j;
		int w = 0;
		for (i = 0;i <= 4;i++) //????
		{
			   for (j = 0;j <= 4;j++)
			   {
				   s[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			   }
		}
		for (i = 0;i <= 4;i++) //???????? ???????
		{
			  s[i][5] = s[i][0];
			  for (j = 1;j <= 4;j++)
			  {
				 if (s[i][5] < s[i][j])
				 {
				  s[i][5] = s[i][j];
				 }
			  }
		}
		for (i = 0;i <= 4;i++) //????????
		{
			  s[5][i] = s[0][i];
			  for (j = 1;j <= 4;j++)
			  {
				 if (s[5][i] > s[j][i])
				 {
				  s[5][i] = s[j][i];
				 }
			  }
		}
		for (i = 0;i <= 4;i++)
		{
			 for (j = 0;j <= 4;j++)
			 {
				 if ((s[i][j] == s[i][5]) && (s[i][j] == s[5][j]))
				 {
					 System.out.print(i + 1);
					 System.out.print(" ");
					 System.out.print(j + 1);
					 System.out.print(" ");
					 System.out.print(s[i][j]);
					 w = 1;
				 }
			 }
		}

		if (w == 0)
		{
		System.out.print("not found");
		}




	return 0;
	}

}

