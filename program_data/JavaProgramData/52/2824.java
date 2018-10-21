package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[101];
		int n;
		int i;
		int m;
		int j;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= n;i++)
		{
						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 a[i] = Integer.parseInt(tempVar3);
						 }
		}
		for (i = m;i > 0;i--)
		{
						for (j = n;j >= n;j--)
						{
										 a[0] = a[j];
										 a[j] = 0;
										 for (s = n;s >= 1;s--)
										 {
											 a[s] = a[s - 1];
										 }
						}
		}
		System.out.printf("%d",a[1]);
		for (s = 2;s <= n;s++)
		{
						 System.out.printf(" %d",a[s]);
		}

	}

}

