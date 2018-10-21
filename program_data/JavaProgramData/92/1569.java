package <missing>;

public class GlobalMembers
{
	public static int compare(Object elem1, Object elem2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1 = (int*)elem1;
		int p1 = (int)elem1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2 = (int*)elem2;
		int p2 = (int)elem2;
		return (p1) - p2;
	}

	public static int Main()
	{
		int[] p1;
		int[] p2;
		int n;
		int i;
		int j;
		int k;
		int s;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n != 0)
			{
					  p1 = new int[n];
					  p2 = new int[n];
					  for (i = 0;i < n;i++)
					  {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  p1[i] = Integer.parseInt(tempVar2);
						  }
					  }
					  for (i = 0;i < n;i++)
					  {
						  String tempVar3 = ConsoleInput.scanfRead();
						  if (tempVar3 != null)
						  {
							  p2[i] = Integer.parseInt(tempVar3);
						  }
					  }
					  qsort(p1, n, (Integer.SIZE / Byte.SIZE), compare);
					  qsort(p2, n, (Integer.SIZE / Byte.SIZE), compare);
					  for (i = 0,s = 0;i < n;i++)
					  {
									  if (p1[i] > p2[i])
									  {
										  s++;
									  }
									  else if (p1[i] == p2[i])
									  {
										   if (i == n - 1)
										   {
											   break;
										   }
										   else
										   {
												for (k = n - 1;k > i;k--)
												{
												if (p1[k] > p2[k])
												{
															   s++;
															   for (j = n - 2;j >= i;j--)
															   {
																   p1[j + 1] = p1[j];
															   }
															   for (j = n - 2;j >= i;j--)
															   {
																   p2[j + 1] = p2[j];
															   }
															   i++;
												}
												else
												{
													 if (p1[i] < p2[k])
													 {
														 s--;
													 }
													 for (j = n - 2;j >= i;j--)
													 {
														 p2[j + 1] = p2[j];
													 }
													 break;
												}
												}
										   }
									  }
									  else
									  {
										   s--;
										   for (j = n - 2;j >= i;j--)
										   {
											   p2[j + 1] = p2[j];
										   }
									  }
					  }
					  System.out.printf("%d\n",s * 200);
			}
		} while (n != 0);
	}

}

