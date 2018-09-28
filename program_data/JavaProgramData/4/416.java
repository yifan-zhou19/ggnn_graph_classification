package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int m;
		  int n;
		  int i;
		  int j;
		  int k;
		  int l;
		  int p;
		  int q;
		  int[][] s = new int[120][120];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  n = Integer.parseInt(tempVar2);
		  }
		  for (i = 1;i <= m;i++)
		  {
		   for (j = 1;j <= n;j++)
		   {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   s[i][j] = Integer.parseInt(tempVar3);
		   }
		   }
		  }
		  l = 0;
		  i = 1;
		  j = 1;
		  while (l < n * m)
		  {
				System.out.printf("%d\n",s[i][j]);
				l++;
				if ((j == 1) && (i + 1 <= n))
				{
				   j = i + 1;
				   i = 1;
				}
			   else if ((j == 1) && (i + 1 > n))
			   {
					i = i - n + 2;
					j = n;
			   }
			   else if (i == m)
			   {
					if (j + i <= n)
					{
							   j = j + i;
							   i = 1;
					}
					else
					{
						 i = j - n + m + 1;
						 j = n;
					}
			   }
				else
				{
					i = i + 1;
					j = j - 1;
				}
		  }


	}


}

