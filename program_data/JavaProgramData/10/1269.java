package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] a = new int[25];
		  int[] b = new int[25];
		  int[] c = new int[25];
		  int i;
		  int j;
		  int n;
		  int max = 0;
		  int q;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
		  {
						  a[i] = 0;
						  b[i] = 0;
		  }
		  for (i = 0;i < n;i++)
		  {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  a[i] = Integer.parseInt(tempVar2);
						  }
		  }

		  for (i = n - 1;i >= 0;i--)
		  {
							 for (j = i;j < n;j++)
							 {
											 if (a[i] >= a[j])
											 {
														   c[j - i] = b[j] + 1;
											 }
											 else
											 {
												 c[j - i] = 1;
											 }
							 }
							 for (j = 0;j < n - i;j++)
							 {
											   if (c[j] >= b[i])
											   {
											   b[i] = c[j];
											   }
							 }
		  }
		  for (i = 0;i < n;i++)
		  {
						  if (b[i] >= max)
						  {
						  max = b[i];
						  }
		  }
		  System.out.printf("%d",max);
	}
}

