package <missing>;

public class GlobalMembers
{
	public static int x;
	public static int y;
	public static int[] a = new int[1001];
	public static int[] b = new int[1001];

	public static int Main()
	{
		int i;
		int j;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		while (x >= 1 && y >= 1)
		{
			for (i = 1;i <= 1001;i++)
			{
				a[i] = x;
				x = x / 2;
				b[i] = y;
				y = y / 2;
			}
		}
		for (i = 1;i <= 1001;i++)
		{
			for (j = 1;j <= 1001;j++)
			{
				if (a[i] == b[j])
				{
					System.out.printf("%d\n",a[i]);
					m = 1;
					break;
				}
			}
				if (m == 1)
				{
					break;
				}
		}
		return 0;
	}
}

