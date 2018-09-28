package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		int N;
		int i1;
		int i2;
		int j1;
		int j2;
		int k1;
		int k2;
		int ss;
		int dd;
		int judge;
		int head1;
		int head2;
		int tail1;
		int tail2;
		int i;
	 int[] t = new int[1001];
	 int[] s = new int[1001];
	 int[] d = new int[1001];
	 int[] q = new int[1001];
	  while (true)
	  {
		  ss = 0;
		  dd = 0;
	  int lose = 0;
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 N = Integer.parseInt(tempVar);
			 }
	  if (N == 0)
	  {
		  break;
	  }
	  for (i1 = 0;i1 < N;i1++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  t[i1] = Integer.parseInt(tempVar2);
		  }
	  }
	  for (i2 = 0;i2 < N;i2++)
	  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  q[i2] = Integer.parseInt(tempVar3);
		  }
	  }

	  int j;
	  int r;

		  for (j = N - 1;j > 0;j--)
		  {
		  for (r = 0;r < j;r++)
		  {
				if (t[r] < t[r + 1])
				{
				int tmp;
			 tmp = t[r + 1];
			 t[r + 1] = t[r];
			 t[r] = tmp;
				}
		  }

		  } //?????
	   for (j = N - 1;j > 0;j--)
	   {
		  for (r = 0;r < j;r++)
		  {
				if (q[r] < q[r + 1])
				{
				int tmp;
			 tmp = q[r + 1];
			 q[r + 1] = q[r];
			 q[r] = tmp;
				}
		  }

	   } //?????
			head1 = 0;
			head2 = 0;
			tail1 = N - 1;
			tail2 = N - 1;
	   for (j1 = 0;j1 < N - 1;j1++)
	   {
		   if (t[head1] < q[head2])
		   {
			tail1--;
		head2++;
		lose++;
		   }
		else if (t[head1] == q[head2])
		{
			  if (t[tail1] > q[tail2])
			  {
				  tail1--;
				  tail2--;
				  ss++;
			  }
			  else if (t[tail1] == q[tail2])
			  {
				   if (t[head1] == t[tail1])
				   {
					  head1++;
					  head2++;
				   }
				  else if (t[head1] > t[tail1])
				  {
					  head2++;
					  tail1--;
					  lose++;
				  }
			  }
			  else if (t[tail1] < q[tail2])
			  {
				   head2++;
				   tail1--;
				   lose++;
			  }







		}
		else if (t[head1] > q[head2])
		{
			ss++;
			head1++;
			head2++;
		}


	   }
	   if (t[head1] > q[head2])
	   {
		   ss++;
	   }
	   else if (t[head1] < q[head2])
	   {
		   lose++;
	   }





	  System.out.printf("%d\n",200 * ss - 200 * lose);








	  }
	 }


}

