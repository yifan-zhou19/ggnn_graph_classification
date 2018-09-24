package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int[] sz = new int[100];
	public static void change(int[] sz, int n)
	{
		for (int i = 0;i < n;i++)
		{
			a[i] = sz[n - 1 - i];
		}
	}
	public static int Main()
	{
		int n;
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
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		change(sz, n);
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[n - 1]);
		return 0;
	}
}

