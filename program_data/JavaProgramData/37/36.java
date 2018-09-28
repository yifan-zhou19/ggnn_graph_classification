package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int ii;
		int jj;
		int flag;
		int[][] word = new int[2][30];
		int c;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		c = System.in.read();
		for (i = 1;i <= n;i++)
		{
			for (ii = 0;ii <= 25;ii++)
			{
			  for (jj = 0;jj <= 1;jj++)
			  {
				  word[jj][ii] = 0;
			  }
			}
			int j = 0;
			do
			{
			  j++;
			  c = System.in.read();
			  word[0][c - 97] = j;
			  word[1][c - 97]++;
			}while (Character.isLowerCase(c));
			int min = 1000111;
			int cc = -1;
			for (j = 0;j <= 25;j++)
			{
			  if (word[1][j] == 1 && word[0][j] < min)
			  {
												 min = word[1][j];
												 cc = j;
			  }
			}
			if (cc != -1)
			{
				System.out.printf("%c\n",cc + 97);
			}
			  else
			  {
				  System.out.print("no\n");
			  }
		}
	}



}

