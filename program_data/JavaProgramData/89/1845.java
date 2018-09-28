package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int m = 0;
		  int[] b1 = new int[100000];
		  int[] c1 = new int[100000];
		  int[] b2 = new int[n];
		  int[] c2 = new int[n];
		  int i;
		  for (i = 0;i < 100000;i++)
		  {
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 b1[i] = Integer.parseInt(tempVar2);
						 }
						 String tempVar3 = ConsoleInput.scanfRead(" ");
						 if (tempVar3 != null)
						 {
							 c1[i] = Integer.parseInt(tempVar3);
						 }
						 m++;
						 if (b1[i] == 0 && (c1[i] == 0))
						 {
						 break;
						 }

		  }
		  int d;
		  int e;
		  for (d = 0;d < n;d++)
		  {
						   b2[d] = 0;
						   for (e = 0;e < m - 1;e++)
						   {
										   if (d == b1[e])
										   {
										   b2[d]++;
										   }
						   }
		  }
		  int f;
		  int g;
		  for (f = 0;f < n;f++)
		  {
						   c2[f] = 0;
						   for (g = 0;g < m - 1;g++)
						   {
										   if (f == c1[g])
										   {
										   c2[f]++;
										   }
						   }
		  }
		  int h;
		  int count = 0;
		  for (h = 0;h < n;h++)
		  {
						   if ((b2[h] == 0) && (c2[h] == n - 1))
						   {
													   System.out.printf("%d\n",h);
						   }
						   if ((b2[h] != 0) || (c2[h] != n - 1))
						   {
													   count++;
						   }
		  }
		  if (count == n)
		  {
		  System.out.print("NOT FOUND");
		  }
	}
}

