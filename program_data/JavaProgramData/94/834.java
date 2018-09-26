package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int N;
		int k;
		int j;
		int m;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		int[] a = new int[N];
		k = 0;
		for (i = 1;i <= N;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 a[i] = Integer.parseInt(tempVar2);
						 }
		}
		for (i = 1;i <= N;i++)
		{
						 if (a[i] % 2 != 0)
						 {
									  k++;
						 }
		}
		int[] b = new int[k];
		x = 0;
		for (i = 1;i <= N;i++)
		{
						 if (a[i] > x)
						 {
								   x = a[i];
						 }
		}
		for (j = 1;j <= k;j++)
		{
						 b[j] = x;
		}
		for (i = 1;i <= N;i++)
		{
						 if (a[i] % 2 != 0 && a[i] < b[1])
						 {
												 b[1] = a[i];
						 }
		}
		for (j = 2;j <= k;j++)
		{
						 for (i = 1;i <= N;i++)
						 {
										  if (a[i] % 2 != 0 && a[i] > b[j - 1] && a[i] < b[j])
										  {
																			   b[j] = a[i];
										  }
						 }
		}
		for (j = 1;j < k;j++)
		{
						System.out.printf("%d,",b[j]);
		}
		System.out.printf("%d",b[k]);
		return 0;
	}


}

