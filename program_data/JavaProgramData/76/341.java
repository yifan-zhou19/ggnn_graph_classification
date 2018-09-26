package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[10000];
		int[] b = new int[10000];
		int[] c = new int[10000];
	int i;
	int j;
	int min;
	int max;
	int e;
	int d = 1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
					 String tempVar2 = ConsoleInput.scanfRead();
					 if (tempVar2 != null)
					 {
						 a[i] = Integer.parseInt(tempVar2);
					 }
					 String tempVar3 = ConsoleInput.scanfRead(" ");
					 if (tempVar3 != null)
					 {
						 b[i] = Integer.parseInt(tempVar3);
					 }
	}
	for (i = 0;i < 10000;i++)
	{
					 c[i] = 0;
	}
					 for (i = 0;i < n;i++)
					 {
									 if (a[i] == b[i])
									 {
													continue;
									 }
									  j = a[i];
									  while (j < b[i] && j >= a[i])
									  {
									  c[j] = 1;
									  j++;
									  }

					 }
					 min = a[0];
					 max = b[0];
					 for (i = 1;i < n;i++)
					 {
									  if (min > a[i])
									  {
												   min = a[i];
									  }
												   if (max < b[i])
												   {
																max = b[i];
												   }
					 }
					 for (j = min;j < max;j++)
					 {
											  if (c[j] == 0)
											  {
														e = 0;
											  }
														 if (e == 0 || d == 0)
														 {
																		d = 0;
														 }
					 }
											  if (d == 0)
											  {
													   System.out.print("no");
											  }
													   else
													   {
															 System.out.printf("%d %d",min,max);
													   }

									  return 0;
	}


}

