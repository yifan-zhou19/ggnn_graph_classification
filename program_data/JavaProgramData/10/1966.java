package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int k;
		  int m;
		  int n;
		  int s;
		  int i;
		  int max;
		  int j;
		  int c = 0;
		  int[] a = new int[26];
		  int[] b = new int[26];

		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 k = Integer.parseInt(tempVar);
		 }

		  for (i = 0;i <= k - 1;i++)
		  {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i] = Integer.parseInt(tempVar2);
		 }
		  }
		  b[k - 1] = 0;

		  for (i = k - 2;i >= 0;i--)

		  {
							b[i] = 0;
							max = 0;
				  for (j = i + 1;j < k;j++)
				  {
									 if (a[i] >= a[j])
									 {
									   b[i] = b[j] + 1;
									   if (b[i] > max)
									   {
										max = b[i];
									   }
									 }
				  }

					  b[i] = max;
					  if (b[i] >= c)
					  {
					  c = b[i];
					  }
		  }
		   System.out.printf("%d",c + 1);
	}



}

