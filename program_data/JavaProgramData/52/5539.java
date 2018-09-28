package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int[] a = new int[101];
		int[] b = new int[101];
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
		for (i = 1;i <= n;i++)
		{
		 if (i <= m)
		 {
		 b[i] = a[n - m + i];
		 }
		 else
		 {
		 b[i] = a[i - m];
		 }
		}
		System.out.printf("%d",b[1]);
		for (i = 2;i <= n;i++)
		{
						 System.out.printf(" %d",b[i]);
		}
		return 0;
	}
}

