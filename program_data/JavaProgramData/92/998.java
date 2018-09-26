package <missing>;

public class GlobalMembers
{
	public static void bubble_sort(int[] a, int n)
	{
		int i;
		int j;
		int t;
		for (j = 0;j < n;j++)
		{
					 for (i = 0;i < n - j - 1;i++)
					 {
							if (a[i] < a[i + 1])
							{
								 t = a[i];
							a[i] = a[i + 1];
							a[i + 1] = t;
							}
							else
							{
								;
							}
					 }
		}
	}


	public static int Main()
	{
	   int[] a = new int[1000];
	   int[] b = new int[1000];
	   int i;
	   int n;
	   int sum;
	   int amax;
	   int bmax;
	   int amin;
	   int bmin;

	   while ((scanf("%d", n)) && (n != 0))
	   {

			  for (i = 0;i < n;i++)
			  {
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  b[i] = Integer.parseInt(tempVar);
			  }
			  }
			  for (i = 0;i < n;i++)
			  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i] = Integer.parseInt(tempVar2);
			  }
			  }

			  bubble_sort(a, n);
			  bubble_sort(b, n);

			   sum = 0;
			   amax = 0;
			   bmax = 0;
			   amin = n - 1;
			   bmin = n - 1;
			   for (i = 0;i < n;i++) //??????? n? ????????
			   {
				  if (a[amax] < b[bmax])
				  {
					  sum += 200;
					  amax++;
					  bmax++;
				  }
				  else if (a[amax] > b[bmax])
				  {
					  sum -= 200;
					  amax++;
					  bmin--;
				  }
				  else
				  {
						 if (a[amin] < b[bmin])
						 {
							 sum += 200;
							 amin--;
							 bmin--;
						 }
						  else if (a[amin] > b[bmin])
						  {
							   sum -= 200;
							   bmin--;
							   amax++;
						  }
						  else //?????? ????????????????? ????? ?????????????????
						  {
								if (a[amax] > b[bmin])
								{
									sum -= 200;
									amax++;
									bmin--;
								} //????? ????? ?? ??????? ?????????????? ?? ????????? ?????  ???????  ?????????
								else
								{
								break;
								}
						  }

				  }
			   }
	 //??s??????  


		System.out.printf("%d\n",sum);
	   }

	return 0;
	}
}

