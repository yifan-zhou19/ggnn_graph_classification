package <missing>;

public class GlobalMembers
{
	public static void paixu(int[] a, int n) //n?????,??????
	{
		 int i;
		 int j;
		 int t;
		 for (i = 0;i < n;i++)
		 {
						 for (j = 0;j < n - i - 1;j++)
						 {
												if (a[j] > a[j + 1])
												{
															   t = a[j];
															   a[j] = a[j + 1];
															   a[j + 1] = t;
												}
						 }
		 }
	}
	public static int Main()
	{
		  int i; //a????????b?????
		  int j;
		  int k;
		  int[] a = new int[1000];
		  int[] b = new int[1000];
		  int m;
		  int n;
		  int p;
		  int q;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		  loop:
		  ;
		  k = 0; //k???????
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  if (n == 0)
		  {
		  return 0;
		  }
		  for (j = 0;j < n;j++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[j] = Integer.parseInt(tempVar2);
		  }
		  }
		  for (j = 0;j < n;j++)
		  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  b[j] = Integer.parseInt(tempVar3);
		  }
		  }
		  paixu(a, n);
		  paixu(b, n);
		  p = n; //j????????
		  q = 0; //q????????????
		  for (i = 0;i < n;i++)
		  {
						  if (a[i] > b[q])
						  {
									   k++;
									   q++;
									   continue;
						  }
						  else if (a[i] < b[q])
						  {
							  p--;
							  k--;
							  continue;
						  }
						  else
						  {
							  if (a[n - 1] > b[p - 1])
							  {
											   k++;
											   n--;
											   i--;
											   p--;
											   continue;
							  }
							  else if (a[n - 1] < b[p - 1])
							  {
								   k--;
								   p--;
								   continue;
							  }
							  else
							  {
								  if (a[i] < b[p - 1])
								  {
								  k--;
								  p--;
								  continue;
								  }
								  else if (a[i] == b[p - 1])
								  {
								  break;
								  }
							  }
						  }
		  }
		  System.out.printf("%d\n",200 * k);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		  goto loop;
	}
}

