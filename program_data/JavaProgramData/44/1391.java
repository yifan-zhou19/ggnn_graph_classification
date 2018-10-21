package <missing>;

public class GlobalMembers
{
	public static int invert(int x)
	{
		int y = 0;
		for (x;x != 0;x /= 10)
		{
			y = x % 10 + y * 10;
		}
		return y;
	}
	public static int Main()
	{
		int i;
		int[] a = new int[6];
		int[] b = new int[6];
		for (i = 0;i < 6;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		}
		for (i = 0;i < 6;i++)
		{
		b[i] = invert(a[i]);
		}
		for (i = 0;i < 6;i++)
		{
		System.out.printf("%d\n",b[i]);
		}
	}

}

