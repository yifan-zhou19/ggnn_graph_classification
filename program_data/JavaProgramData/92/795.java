package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int[] a1 = new int[1000];
	public static int n;
	public static void paixua()
	{
		 int i;
		 int j;
		 int k;
		 for (i = 0;i < n - 1;i++)
		 {
						   for (j = i;j < n;j++)
						   {
										   if (a[i] < a[j])
										   {
														k = a[i];
														a[i] = a[j];
														a[j] = k;
										   }
						   }
		 }
	}
	public static void paixub()
	{
		 int i;
		 int j;
		 int k;
		 for (i = 0;i < n - 1;i++)
		 {
						   for (j = i;j < n;j++)
						   {
										   if (b[i] < b[j])
										   {
														k = b[i];
														b[i] = b[j];
														b[j] = k;
										   }
						   }
		 }
	}
	public static void yixu(int k)
	{
		 int i;
		 for (i = 0;i < n - k;i++)
		 {
						  a1[i + k] = a[i];
		 }
		 for (i = n - k;i < n;i++)
		 {
						   a1[n - 1 - i] = a[i];
		 }
	}
	public static int Main()
	{
		  int i;
		  int j;
		  int w;
		  int sum;
		  for (;1;)
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
									  String tempVar3 = ConsoleInput.scanfRead();
									  if (tempVar3 != null)
									  {
										  b[i] = Integer.parseInt(tempVar3);
									  }
					  }
					  paixua();
					  paixub();
					  w = -200 * n;
					  for (i = 0;i < n;i++)
					  {
									  sum = 0;
									  yixu(i);
									  for (j = 0;j < n;j++)
									  {
													  if (a1[j] > b[j])
													  {
														  sum = sum + 200;
													  }
													  else if (a1[j] < b[j])
													  {
														  sum = sum - 200;
													  }
									  }
									  if (w < sum)
									  {
										  w = sum;
									  }
					  }
					  System.out.printf("%d\n",w);
				  }
		  }

	}

}

