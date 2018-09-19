package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10];
		int[] b = new int[10];
		int x;
		int y;
		int i;
		int j;
		int t;
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
		if (x < y)
		{
			t = x;
			x = y;
			y = t;
		}
		for (i = 0;i < 10;i++)
		{
			a[i] = x;
			x /= 2;
		}
		for (j = 0;j < 10;j++)
		{
			b[j] = y;
			y /= 2;
		}
		for (i = 0;i < 10;i++)
		{
			for (j = 0;j < 10;j++)
			{
				if (a[i] == b[j])
				{
					System.out.printf("%d\n",a[i]);
					return 0;
				}
			}
		}
		return 0;
	}
}

