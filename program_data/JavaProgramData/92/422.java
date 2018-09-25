package <missing>;

public class GlobalMembers
{
	public static int x(int n, int[] a, int[] b)
	{
	  int num = 0;
	  int num1 = 0;
	  int i = n - 1;
	  int j = n - 1;
	  int m = 0;
	  int k = 0;
	  int z;
	  int shen = n;
	  while (shen > 1)
	  {
					  if (a[i] > b[j])
					  {
								   num++;
								   i--;
								   j--;
								   shen--;
								   continue;
					  }
					  if (a[m] > b[k])
					  {
								   num++;
								   m++;
								   k++;
								   shen--;
					  }
					  else
					  {
									if (a[m] < b[j])
									{
									num1++;
									}

									m++;
									j--;
									shen--;
					  }

	  }
	  if (a[m] > b[k])
	  {
		  num++;
	  }
	  if (a[m] < b[k])
	  {
		  num1++;
	  }
	  z = num - num1;
	  return z;
	}



	public static int Main()
	{
		int m = 0;
		int i;
		int win;
		int n;
		int d;
		int l;
		int j;
		int t;
		int[] a = new int[1000];
		int[] b = new int[1000];
		while (m == 0)
		{
				   String tempVar = ConsoleInput.scanfRead();
				   if (tempVar != null)
				   {
					   n = Integer.parseInt(tempVar);
				   }
				   if (n == 0)
				   {
					   break;
				   }
				   else
				   {
					   for (i = 0;i < n;i++)
					   {
					   String tempVar2 = ConsoleInput.scanfRead();
					   if (tempVar2 != null)
					   {
						   a[i] = Integer.parseInt(tempVar2);
					   }
					   }
					   for (i = 0;i < n;i++)
					   {
					   String tempVar3 = ConsoleInput.scanfRead();
					   if (tempVar3 != null)
					   {
						   b[i] = Integer.parseInt(tempVar3);
					   }
					   }


				   }

				   for (j = 0;j < n - 1;j++)
				   {
					 for (l = 0;l < n - j - 1;l++)
					 {
						 if (a[l] > a[l + 1])
						 {
										t = a[l];
										a[l] = a[l + 1];
										a[l + 1] = t;
						 }
					 }
				   }
				   for (j = 0;j < n - 1;j++)
				   {
					 for (l = 0;l < n - j - 1;l++)
					 {
						 if (b[l] > b[l + 1])
						 {
										t = b[l];
										b[l] = b[l + 1];
										b[l + 1] = t;
						 }
					 }
				   }

				   d = x(n, a, b);
				   win = d * 200;
				   System.out.printf("%d\n",win);
		}
	}

}

