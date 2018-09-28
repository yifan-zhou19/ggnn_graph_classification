package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int r;
		  int i;
		  String s = new String(new char[501]);
		  char[][] a = new char[500][6];
		  int[] b = new int[500];
		  for (i = 0;i < 500;i++)
		  {
		  b[i] = 1;
		  }
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  s = tempVar2.charAt(0);
		  }
		  int x;
		  int j;
		  int k = -1;
		  x = s.length();
		  for (i = 0;i <= x - n;i++)
		  {
					   k++;
					  for (j = i;j < i + n;j++)
					  {
						a[k][j - i] = s.charAt(j);
					  }
		  }
			 for (i = 0;i < k;i++)
			 {
							 x = String.valueOf(a[i]).length();
							 if (x > n)
							 {
							 continue;
							 }
						  for (j = i + 1;j <= k;j++)
						  {
										  for (r = 0;r < n;r++)
										  {
														  if (a[i][r] != a[j][r])
														  {
														  break;
														  }
										  }
										  if (r == n)
										  {
										  b[i]++;
										  a[j][n] = '0';
										  }
						  }
			 }
			  int p;
			  p = b[0];
			  for (i = 1;i <= k;i++)
			  {
							   if (b[i] > p)
							   {
							   p = b[i];
							   }
			  }
			  if (p == 1)
			  {
			  System.out.print("NO");
			  }
			  else
			  {
				  System.out.printf("%d\n",p);
				  for (i = 0;i <= k;i++)
				  {
								   if (b[i] == p)
								   {
								   System.out.printf("%s\n",a[i]);
								   }
				  }
			  }




	}

}

