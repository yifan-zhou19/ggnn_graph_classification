package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] a = new int[1001];
		  int[] b = new int[1001];
		  int[] c = new int[1001];
		  int j;
		  int k;
		  int l;
		  int i;
		  int n;
		  int m;
		  int win;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  while (n > 0)
		  {
			   for (i = 1;i <= n;i++)
			   {
					  String tempVar2 = ConsoleInput.scanfRead();
					  if (tempVar2 != null)
					  {
						  c[i] = Integer.parseInt(tempVar2);
					  }
					  j = i;
					  while (j > 1 && c[j] > c[j / 2])
					  {
							 k = c[j];
							 c[j] = c[j / 2];
							 c[j / 2] = k;
							 j = j / 2;
					  }
			   }
			   m = n;
			   for (i = 1;i <= n;i++)
			   {
					  a[i] = c[1];
					  c[1] = c[m];
					  m--;
					  j = 1;
					  while ((c[j] < c[j * 2 + 1] || c[j] < c[j * 2]) && j <= m / 2)
					  {
							  k = c[j * 2] > c[j * 2 + 1] != 0?j * 2:j * 2 + 1;
							  l = c[j];
							  c[j] = c[k];
							  c[k] = l;
							  j = k;
					  }
			   }
			   for (i = 1;i <= n;i++)
			   {
					  String tempVar3 = ConsoleInput.scanfRead();
					  if (tempVar3 != null)
					  {
						  c[i] = Integer.parseInt(tempVar3);
					  }
					  j = i;
					  while (j > 1 && c[j] > c[j / 2])
					  {
							 k = c[j];
							 c[j] = c[j / 2];
							 c[j / 2] = k;
							 j = j / 2;
					  }
			   }
			   m = n;
			   for (i = 1;i <= n;i++)
			   {
					  b[i] = c[1];
					  c[1] = c[m];
					  m--;
					  j = 1;
					  while ((c[j] < c[j * 2 + 1] || c[j] < c[j * 2]) && j <= m / 2)
					  {
							  k = c[j * 2] > c[j * 2 + 1] != 0?j * 2:j * 2 + 1;
							  l = c[j];
							  c[j] = c[k];
							  c[k] = l;
							  j = k;
					  }
			   }
			   i = 1;
			   j = n;
			   k = 1;
			   l = n;
			   win = 0;
			   while (i <= j)
			   {
					 while (a[i] > b[k] && i <= j)
					 {
						 i++;
						 k++;
						 win++;
					 }
					 while (a[j] > b[l] && i <= j)
					 {
						 j--;
						 l--;
						 win++;
					 }
					 if (i <= j)
					 {
						 if (a[j] < b[k])
						 {
							 win--;
						 }
						 j--;
						 k++;
					 }
			   }
			   System.out.printf("%d\n",win * 200);
			   String tempVar4 = ConsoleInput.scanfRead();
			   if (tempVar4 != null)
			   {
				   n = Integer.parseInt(tempVar4);
			   }
		  }
	}

}

