package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		int y;
		int v;
		int j;
		v = 0;
		for (j = 0;x != 0;j++)
		{
			v = v * 10 + x % 10 * 10;
			x = x / 10;
		}
		y = v / 10;
		return (y);
	}
	public static int Main()
	{
		int f = int x;
		int i;
		int[] a = new int[6];
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
			System.out.printf("%d\n",f(a[i]));
		}
		return 0;
	}

}

