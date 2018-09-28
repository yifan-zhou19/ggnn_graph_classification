package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[101];
		int[] b = new int[101];
		int i;
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
			b[i] = a[n - i - 1];
		}
		for (i = 0;i < (n - 1);i++)
		{
			System.out.printf("%d ",b[i]);
		}
		System.out.printf("%d",b[n - 1]);


		return 0;
	}


}

