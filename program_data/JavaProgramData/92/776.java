package <missing>;

public class GlobalMembers
{
	public static void quicksort(int[] source, int n)
	{
		int i;
		int j;
		int t;
		 for (j = n - 1;j > 0;j--)
		 {
									for (i = 0;i < j;i++)
									{
									 if (source[i] < source[i + 1])
									 {
										 t = source[i];
									 source[i] = source[i + 1];
									 source[i + 1] = t;
									 }

									}
		 }


	}
	public static int Main()
	{

		int n;
		int m;
		int i;
		int[] t = new int[1001];
		int[] q = new int[1001];
			while (true)
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
							 for (m = 0;m < n;m++)
							 {
							String tempVar2 = ConsoleInput.scanfRead();
							if (tempVar2 != null)
							{
								t[m] = Integer.parseInt(tempVar2);
							}
							 }
							for (m = 0;m < n;m++)
							{
							 String tempVar3 = ConsoleInput.scanfRead();
							 if (tempVar3 != null)
							 {
								 q[m] = Integer.parseInt(tempVar3);
							 }
							}
	   quicksort(t, n);
	   quicksort(q, n);
	   int top1 = 0;
	   int trail1 = n - 1;
	   int top2 = 0;
	   int trail2 = n - 1;
	   int sum = 0;
	   for (i = 1;i <= n;i++)
	   {
					   if (t[trail1] > q[trail2])
					   {
											  sum += 200;
										  trail1--;
										  trail2--;
					   }
					 else if (t[trail1] < q[trail2])
					 {
											  sum -= 200;
										  trail1--;
										  top2++;
					 }
					 else if (t[top1] > q[top2])
					 {
											sum += 200;
										  top1++;
										top2++;
					 }
					 else
					 {
					 if (t[trail1] < q[top2])
					 {
							 sum -= 200;
					 trail1--;
					 top2++;
					 }

					 else
					 {
						  trail1--;
						  top2++;
					 }
					 }
	   }
	 System.out.printf("%d\n",sum);
						 }
			}
	   System.in.read();
	   System.in.read();

	}



}

