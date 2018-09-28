package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int m;
		  int i;
		  int k;
		  int s = 0;
		  int r = 0;
		  int q = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  m = 2 * n * (n - 1);
		  int[] p = new int[m];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a=(int *)malloc(n *sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		   int a = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		   for (i = 0;;i = i + 2)
		   {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  p[i] = Integer.parseInt(tempVar2);
						  }
						  String tempVar3 = ConsoleInput.scanfRead(" ");
						  if (tempVar3 != null)
						  {
							  p[i + 1] = Integer.parseInt(tempVar3);
						  }
						  if (p[i] == 0 && p[i + 1] == 0)
						  {
						  break;
						  }
						  else
						  {
						  s++;
						  }
		   }
						  for (i = 0;i < n;i++)
						  {
						  a[i] = 0;
						  }
						  for (i = 1;i <= (2 * s - 1);i = i + 2)
						  {
						  a[p[i]]++;
						  }
						  for (i = 0;i < n;i++)
						  {
										 if (a[i] == (n - 1))
										 {
														r = 1;
														for (k = 0;k <= (2 * s - 2);k = k + 2)
														{
																				 if (p[k] == i)
																				 {
																				 q = 1;
																				 }
														}
																				 if (q == 0)
																				 {
																				 System.out.printf("%d",i);
																				 }
																				 else
																				 {
																				 System.out.print("NOT FOUND");
																				 }
																				 break;
										 }
						  }
																				 if (r == 0)
																				 {
																				 System.out.print("NOT FOUND");
																				 }

	}

}

