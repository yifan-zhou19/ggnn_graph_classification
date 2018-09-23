package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[10];
	public static int[] b = new int[10];
	public static int la = 0;
	public static int lb = 0;
	public static int Main()
	{
		int i;
		int j;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		while (x > 0)
		{
			a[la++] = x % 2;
			x /= 2;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		while (x > 0)
		{
			b[lb++] = x % 2;
			x /= 2;
		}
		for (i = la - 1, j = lb - 1, x = 0;i >= 0 && j >= 0 && a[i] == b[j];i--, j--)
		{
			x = x * 2 + a[i];
		}
		System.out.printf("%d",x);
		return 0;
	}

}

