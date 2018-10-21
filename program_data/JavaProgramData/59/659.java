package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[110][110];
		for (i = 0;i < n;i++)
		{
						for (j = 0;j < n;j++)
						{
										a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
						}
		} //??
		int d;
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (d = 1;d < m;d++)
		{
						 int[][] b = new int[110][110];
						 {
							 for (i = 0;i < n;i++)
							 {
											 for (j = 0;j < n;j++)
											 {
															 b[i][j] = 0;
											 }
							 }
						 } //?????????
						 for (i = 0;i < n;i++)
						 {
										 for (j = 0;j < n;j++)
										 {
														 if (a[i][j] == '@')
														 {
																		if (a[i + 1][j] == '.' && i < n)
																		{
																						  b[i + 1][j] = 1;
																		}
																		if (a[i - 1][j] == '.' && i > 0)
																		{
																						  b[i - 1][j] = 1;
																		}
																		if (a[i][j + 1] == '.' && j < n)
																		{
																						  b[i][j + 1] = 1;
																		}
																		if (a[i][j - 1] == '.' && j > 0)
																		{
																						  b[i][j - 1] = 1;
																		}
														 }
										 }
						 } //?????????????????
						 for (i = 0;i < n;i++)
						 {
										 for (j = 0;j < n;j++)
										 {
														 if (b[i][j] == 1)
														 {
																	   a[i][j] = '@';
														 }
										 }
						 } //??
		}
	/*
	    cout<<endl;
	    for(i=0;i<n;i++)
	    {
	                    for(j=0;j<n;j++)
	                    {
	                                    cout<<a[i][j];
	                    }
	                    cout<<endl;
	    }
	*/
		int count = 0;
		for (i = 0;i < n;i++)
		{
						for (j = 0;j < n;j++)
						{
										if (a[i][j] == '@')
										{
														count++;
										}
						}
		}
		System.out.print(count);
		return 0;
	}

}

