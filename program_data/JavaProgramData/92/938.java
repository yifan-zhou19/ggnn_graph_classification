package <missing>;

public class GlobalMembers
{
	public static int Compare(Object elem1, Object elem2)
	{
		   return *((int)(elem2)) - (int)(elem1);
	}

	public static int Main()
	{
		  int n;
		  int i = 0;
		  int j = 0;
		  int counter = 0;
		  int c = 0;
		  int lose = 0;
		  int k = 0;
		  int l = 0;
		  int m = 0;
		  int[] money = new int[1000];
		  for (k = 0;;k++)
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

			  int[] q = new int[1000];
			  int[] t = new int[1000];
			  for (i = 0;i < n;i++)
			  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  t[i] = Integer.parseInt(tempVar2);
				  }
			  }

			  for (i = 0;i < n;i++)
			  {
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  q[i] = Integer.parseInt(tempVar3);
				  }
			  }
			   qsort(t, n, (Integer.SIZE / Byte.SIZE), Compare);
			   qsort(q, n, (Integer.SIZE / Byte.SIZE), Compare);
			   m = 0;
			   for (j = 0;n > 0;j++)
			   {
					   counter = 0,c = 0,lose = 0;
					   for (i = 0;(q[i] < t[i]) && (i < n);i++)
					   {
						   counter = counter + 1; //??????counter????

					   }

					   for (i = 0;i <= n - counter - 1;i++)
					   {
						   q[i] = q[i + counter];
						   t[i] = t[i + counter];
					   }
					   n = n - counter;
					   m = m + counter;
					   if (n == 0)
					   {
					   break;
					   }

					   for (i = n - 1;q[i] < t[i];i--)
					   {
						   c++; //??????c????
					   }
					   n = n - c;
					   m = m + c;
					   if (n == 0)
					   {
					   break;
					   }

					   if (q[0] > t[n - 1])
					   {
						   lose++;
					   } //?????
					   m = m - lose;
					   for (i = 0;i <= n - 1;i++)
					   {
						   q[i] = q[i + 1]; //???????pass
					   }


					   n = n - 1;

			   }

			  money[k] = 200 * (m);

			  l++;

		   }

		  }

				   for (k = 0;k < l;k++)
				   {
					System.out.printf("%d\n",money[k]); //??????????????
				   }


	}


}

