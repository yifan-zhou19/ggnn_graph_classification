package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int sum = 0;
	  int[][] s = new int[100][100];
	  int i;
	  int t;
	  int j;
	  int m;
	  int n;
	  int k;
	  int min;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {
		  for (j = 0;j < n;j++)
		  {
			  for (k = 0;k < n;k++)
			  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  s[j][k] = Integer.parseInt(tempVar2);
				  }
			  }
		  }
		  sum = 0;
		  for (j = 1;j < n;j++)
		  {
			  for (k = 0;k < n;k++)
			  {
				  if (k == 0 || k >= j)
				  {
						  min = s[k][0];
						  for (t = 0;t < n;t++)
						  {
							  if ((t == 0 || t >= j) && s[k][t] < min)
							  {
								  min = s[k][t];
							  }
						  }
						  for (t = 0;t < n;t++)
						  {
							  if (t == 0 || t >= j)
							  {
								  s[k][t] -= min;
							  }
						  }
				  }
			  }



			  for (k = 0;k < n;k++)
			  {
				  if (k == 0 || k >= j)
				  {
						  min = s[0][k];
						  for (t = 0;t < n;t++)
						  {
							  if ((t == 0 || t >= j) && s[t][k] < min)
							  {
								  min = s[t][k];
							  }
						  }
						  for (t = 0;t < n;t++)
						  {
							  if (t == 0 || t >= j)
							  {
								  s[t][k] -= min;
							  }
						  }
				  }
			  }
			  sum += s[j][j];
		  }
		  System.out.printf("%d\n",sum);
	  }

	}
}

