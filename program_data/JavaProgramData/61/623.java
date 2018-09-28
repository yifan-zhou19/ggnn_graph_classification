package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[10000];
		int[] b = new int[10000];
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
						 for (j = 0;j < a[i];j++)
						 {
											 if (j == 0 || j == 1)
											 {
													 b[j] = 1;
											 }
											 else
											 {
												  b[j] = b[j - 1] + b[j - 2];
											 }
						 }
						 if (i != n - 1)
						 {
							System.out.printf("%d\n",b[j - 1]);
						 }
						 else
						 {
							System.out.printf("%d",b[j - 1]);
						 }
		}
	return 0;
	}
}

