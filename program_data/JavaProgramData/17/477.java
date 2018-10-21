package <missing>;

public class GlobalMembers
{
	public static char[][] a = new char[500][103];
	public static void chuli(int i,int la)
	{
		  int j;
		  int k;
		  int l;
		  int flag = 0;
		  for (j = 0;j < la - 1;j++)
		  {
			  if (a[i][j] == '(')
			  {
							   k = j + 1;
							   while (a[i][k] != '(' && a[i][k] != ')' && k < la)
							   {
								   k++;
							   }
							   if (a[i][k] == ')')
							   {
												flag = 1;
												a[i][j] = a[i][k] = ' ';
							   } //??????
			  }
		  }
		  if (flag == 1)
		  {
			  chuli(i, la); //???????????,?????
		  }
	}
	public static int Main()
	{
		int n = 0;
		int[] la = new int[500];
		int i;
		int j;
		char c;
		char[][] b = new char[500][103];
		while ((c = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
						  while (c != '\n')
						  {
								a[n][la[n]] = b[n][la[n]] = c;
								la[n]++;
								c = System.in.read();
						  }
						  n++;
		} //??
		for (i = 0;i < n;i++)
		{
			chuli(i, la[i]); //??
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < la[i];j++)
			{
				System.out.print(b[i][j]);
			}
			System.out.print("\n");
			for (j = 0;j < la[i];j++)
			{
				if (a[i][j] == '(')
				{
					System.out.print('$');
				}
				else if (a[i][j] == ')')
				{
					System.out.print('?');
				}
				else
				{
					System.out.print(' ');
				}
			}
			if (i != n - 1)
			{
				System.out.print("\n");
			}
		} //??
		return 0;
	}



}

