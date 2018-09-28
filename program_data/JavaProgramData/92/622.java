package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] wang = new int[1000];
		  int[] tian = new int[1000];
		  int head;
		  int tailw;
		  int tailt;
		  int i;
		  int j;
		  int m;
		  int n;
		  int t;
		  int sum;
		  for (;;)
		  {
				 sum = 0;
				 String tempVar = ConsoleInput.scanfRead();
				 if (tempVar != null)
				 {
					 n = Integer.parseInt(tempVar);
				 }
				 if (n == 0)
				 {
					 break;
				 }
				 for (i = 0;i < n;i++)
				 {
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 tian[i] = Integer.parseInt(tempVar2);
				 }
				 }
				 for (i = 0;i < n;i++)
				 {
				 String tempVar3 = ConsoleInput.scanfRead();
				 if (tempVar3 != null)
				 {
					 wang[i] = Integer.parseInt(tempVar3);
				 }
				 }
				 for (i = 0;i < n - 1;i++)
				 {
				 for (j = i + 1;j < n;j++)
				 {
								   if (tian[j] > tian[i])
								   {
													  t = tian[j];
													  tian[j] = tian[i];
													  tian[i] = t;
								   }
								   if (wang[j] > wang[i])
								   {
													  t = wang[j];
													  wang[j] = wang[i];
													  wang[i] = t;
								   }
				 }
				 }
				 head = 0;
				 tailw = n - 1;
				 tailt = n - 1;
				 for (i = 0;i < n;i++)
				 {
								 if (tian[head] > wang[i])
								 {
													   sum++;
													   head++;
								 }
								 else if (tian[head] < wang[i])
								 {
									  tailt--;
									  sum--;
								 }
								 else if (tian[head] == wang[i])
								 {
									  for (j = tailt,m = tailw;j >= head;j--,m--)
									  {
																		  if (tian[j] > wang[m])
																		  {
																							 tailt--;
																							 tailw--;
																							 sum++;
																		  }
																		  else
																		  {
																			   if (tian[j] < wang[i])
																			   {
																				   sum--;
																			   }
																			   tailt--;
																			   tailw = m;
																			   break;
																		  }
									  }
								 }
								 if (head > tailt)
								 {
									 break;
								 }
				 }
				 System.out.printf("%d\n",sum * 200);
		  }
	}

}

