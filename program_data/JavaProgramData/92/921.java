package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int t;
		  int[] tian = new int[1000];
		  int[] qi = new int[1000];
		  int vic = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  while (n != 0)
		  {
			   int head1 = 0;
			   int head2 = 0;
			   int end1 = n - 1;
			   int end2 = n - 1;
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
					   qi[i] = Integer.parseInt(tempVar3);
				   }
			   }
			   for (i = 0;i < n - 1;i++)
			   {
				   for (j = i;j < n;j++)
				   {
				   if (tian[i] < tian[j])
				   {
					   t = tian[i];
					   tian[i] = tian[j];
					   tian[j] = t;
				   }
				   if (qi[i] < qi[j])
				   {
					   t = qi[i];
					   qi[i] = qi[j];
					   qi[j] = t;
				   }
				   }
			   }
			   for (i = 0;i < n;i++)
			   {
					if (tian[head1] > qi[head2])
					{
						vic++;
						head1++;
						head2++;
					}
					else if (tian[end1] > qi[end2])
					{
						vic++;
						end1--;
						end2--;
					}
					else if (tian[head1] <= qi[head2])
					{
						if (tian[end1] < qi[head2])
						{
							vic--;
							end1--;
							head2++;
						}
						else
						{
							end1--;
							head2++;
						}
					}
					else if (tian[end1] <= qi[end2])
					{
						vic--;
						end1--;
						head2++;
					}
			   }
			   System.out.printf("%d\n",vic * 200);
			   String tempVar4 = ConsoleInput.scanfRead();
			   if (tempVar4 != null)
			   {
				   n = Integer.parseInt(tempVar4);
			   }
			   vic = 0;
		  }
	}


}

