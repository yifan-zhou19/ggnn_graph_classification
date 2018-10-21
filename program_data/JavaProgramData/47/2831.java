package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		int b;
		int c;
		int d;
		int[] f = new int[100];
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
		c = n - 1;
		b = a[c];
		for (i = 0;i < n;i++)
		{
			d = n - 1 - i;
			f[d] = a[i];
		}
		for (i = 0;i < c;i++)
		{
			System.out.printf("%d ",f[i]);
		}
		System.out.printf("%d",f[c]);
		return 0;
	}
}

