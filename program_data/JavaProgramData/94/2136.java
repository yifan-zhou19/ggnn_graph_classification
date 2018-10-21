package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int[] a = new int[501];
		int i;
		int k;
		int[] b = new int[501];
		int c;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 1,k = 1;i <= N;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 a[i] = Integer.parseInt(tempVar2);
						 }
						 if ((a[i]) % 2 == 1)
						 {
							 b[k] = a[i];
							 k = k + 1;
						 }
		}
						 for (i = 2;i < k;i++)
						 {
										 if (b[i] <= b[1])
										 {
														c = b[1];
														b[1] = b[i];
														b[i] = c;
										 }
						 }
										 System.out.printf("%d",b[1]);
										 for (i = 2;i < (k - 1);i++)
										 {
														 for (m = i + 1;m < k;m++)
														 {
																		   if (b[m] <= b[i])
																		   {
																						 c = b[i];
																						 b[i] = b[m];
																						 b[m] = c;
																		   }
														 }
										 }
																						 for (i = 2;i < k;i++)
																						 {
																						 System.out.printf(",%d",b[i]);
																						 }
																																										return 0;
	}
}

