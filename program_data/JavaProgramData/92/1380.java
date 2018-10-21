package <missing>;

public class GlobalMembers
{
	public static final int MAXN = 1005;
	public static int Main()
	{
		 int n;
		 int[] t = new int[MAXN];
		 int[] k = new int[MAXN];
		 while ((n, n = ConsoleInput.readToWhiteSpace(true)).length() > 0)
		 {
				   int i;
				   for (i = 0; i < n; i++)
				   {
					   t[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				   }
				   for (i = 0; i < n; i++)
				   {
					   k[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				   }
				   sort(t, t + n);
				   sort(k, k + n);
				   int fastT = n - 1;
				   int slowT = 0;
				   int fastK = n - 1;
				   int slowK = 0;
				   int total = 0;
				   while (slowK <= fastK)
				   {
								if (t[fastT] > k[fastK])
								{
												 total += 200;
												 fastT--;
												 fastK--;
								}
								else if (t[fastT] < k[fastK])
								{
												 total -= 200;
												 slowT++;
												 fastK--;
								}
								else
								{
												 while (slowK <= fastK)
												 {
																	  if (t[slowT] > k[slowK])
																	  {
																							   total += 200;
																							   slowT++;
																							   slowK++;
																	  }
																	  else
																	  {
																							   if (t[slowT] < k[fastK])
																							   {
																								   total -= 200;
																							   }
																							   slowT++;
																							   fastK--;
																							   break;
																	  }
												 }
								}
				   }
				   System.out.print(total);
				   System.out.print("\n");
		 }
		  return 0;
	}

}

