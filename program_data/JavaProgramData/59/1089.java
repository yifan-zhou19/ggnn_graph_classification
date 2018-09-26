package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int i;
	int s = 0;
	int j;
	int p;
	int q;
	int w;
	char[][] sz = new char[150][150];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}

			for (i = 0;i < n;i++)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = tempVar2.charAt(0);
			}
			  for (j = 0;j < n;j++)
			  {
			 if (sz[i][j] == '@')
			 {
										 s++;
			 }
			  }
			}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
	for (i = 1;i < m;i++)
	{
		for (j = 0;j < n;j++)
		{
			for (p = 0;p < n;p++)
			{
				if (sz[j][p] == '.' && (sz[j + 1][p] == '@' || sz[j - 1][p] == '@' || sz[j][p + 1] == '@' || sz[j][p - 1] == '@'))
				{
					sz[j][p] = '+';
				   s++;
				}
			}
		}
					 for (q = 0;q < n;q++)
					 {
						  for (w = 0;w < n;w++)
						  {
			   if (sz[q][w] == '+')
			   {
								  sz[q][w] = '@';

			   }
						  }
					 }
	}
					 System.out.printf("%d\n",s);

				 return 0;

	}

}

