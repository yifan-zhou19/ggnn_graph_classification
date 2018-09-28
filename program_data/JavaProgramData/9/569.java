package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[110]);
		char[][] b = new char[100][1000];
		int n;
		int i;
		int y;
		int l;
		int j;
		int p = 0;
		int q = 0;
		int[] c = new int[1000];
		int[] d = new int[1000];
		int[] e = new int[1000];
		int m;
		int s;
		int[] g = new int[1000];
		int[] v = new int[1000];
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
				   for (i = 1;i <= n;i++)
				   {
								   String tempVar2 = ConsoleInput.scanfRead();
								   if (tempVar2 != null)
								   {
									   a = tempVar2.charAt(0);
								   }
								   String tempVar3 = ConsoleInput.scanfRead(" ");
								   if (tempVar3 != null)
								   {
									   y = Integer.parseInt(tempVar3);
								   }
								   l = a.length();
								   for (j = 0;j < l;j++)
								   {
										  b[i - 1][j] = a.charAt(j);
								   } //??ID
									  b[i - 1][l] = '\0';
									  c[i - 1] = y; //????
				   }
				  for (i = 0;i < n;i++) //????
				  {
				  if (c[i] >= 60)
				  {
					 d[p] = c[i];
					 g[p] = i;
					 p++;
				  }
				  else if (c[i] < 60)
				  {
					 e[q] = c[i];
					 v[q] = i;
					 q++;
				  }
				  }
								  for (j = 0;j <= p - 1;j++)
								  {
									  for (i = 0;i <= p - 1;i++)
									  {
											  if (d[i] > m)
											  {
													m = d[i];
												 s = i;
											  }
											  else if (d[i] <= m)
											  {
												  ;
											  }
									  }
										 System.out.printf("%s\n",b[g[s]]);
										 m = 0;
										 d[s] = 0;
								  }
								for (i = 0;i <= q - 1;i++)
								{
									  System.out.printf("%s\n",b[v[i]]);
								}





	}
}

