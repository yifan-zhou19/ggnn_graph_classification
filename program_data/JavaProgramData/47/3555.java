package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] b = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			l = n - i - 1;
			b[i] = a[l];
			System.out.printf("%d ",b[i]);
		}
		b[n - 1] = a[0];
		System.out.printf("%d",b[n - 1]);
		return 0;
	}



}

