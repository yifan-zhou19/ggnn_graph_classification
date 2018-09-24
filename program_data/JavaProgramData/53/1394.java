package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int[] a = new int[300];
		int[] b = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n - 1;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 a[i] = Integer.parseInt(tempVar2);
						 }
		}
						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 a[n - 1] = Integer.parseInt(tempVar3);
						 }
		for (i = n - 1;i > 0;i--)
		{
							for (j = 0;j < i;j++)
							{
											 if (a[i] == a[j])
											 {
															break;
											 }
							}
											 if (j == i)
											 {
													  b[k] = a[i];
													  k += 1;
											 }

		}
		b[k] = a[0];
		for (i = k;i > 0;i--)
		{
						  System.out.printf("%d,",b[i]);
		}
						  System.out.printf("%d",b[0]);
						  return 0;
	}

}

