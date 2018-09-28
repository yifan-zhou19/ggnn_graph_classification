package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int p;
		int q;
		int i;
		int k;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		'\n';
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
			p = 1;
			q = 1;
			for (k = 2;k < a[i];k++)
			{
				j = p + q;
				p = q;
				q = j;
			}
			b[i] = q;
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
		System.out.printf("%d",b[n - 1]);
		return 0;
	}

}

