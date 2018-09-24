package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[105];
		int n;
		int m;
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
		for (int * w = a + m,i = 0;i < n - m;i++,w++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				w = Integer.parseInt(tempVar3);
			}
		}
		for (int * w = a,i = 0;i < m;i++,w++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				w = Integer.parseInt(tempVar4);
			}
		}
		for (int * r = a,i = 0;i < n - 1;i++,r++)
		{
			System.out.printf("%d ", r);
		}
		System.out.printf("%d",a[n - 1]);
		return 0;
	}
}

