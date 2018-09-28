package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k = 0;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[1000000];
		int[] b = new int[1000000];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		'\n';
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] != p)
			{
				b[k] = a[i];
				k++;
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d ",b[i]);
		}
		System.out.printf("%d",b[k - 1]);
		return 0;
	}
}

