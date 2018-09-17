package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int t;
		  int i;
		  int j;
		  int h;
		  int k;
		  int[] b = new int[25];
		  int[] a = new int[25];
		  k = 1;
			   t = n - 1;
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
		  }
		  for (i = 0;i < n;i++)
		  {
		  b[i] = 1;
		  }
		  for (i = n - 2;i >= 0;i--)
		  {
							 for (j = i + 1;j < n;j++)
							 {

											 if (a[i] >= a[j])
											 {
														   t = j;
														   b[i] = b[j] + 1;

											 for (h = j;h < n;h++)
											 {
														   if (a[i] >= a[h] != 0 && b[h] > b[t])
														   {
														   b[i] = b[h] + 1;
																												 t = h;
														   }



											 }
														   if (k < b[i])
														   {
																   k = b[i];

														   }
															break;
											 }
							 }
		  }
		  System.out.printf("%d",k);

	}
}

