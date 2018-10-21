package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int i;
		int j;
		int k = 0;
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
		int[] a = new int[10];
		int[] b = new int[10];
		for (i = 0;i < 10;i++)
		{
				a[i] = x;
				x /= 2;
		}
			for (i = 0;i < 10;i++)
			{
				b[i] = y;
				y /= 2;
			}
			for (i = 0;i < 10;i++)
			{
				for (j = 0;j < 10;j++)
				{
					if (a[i] == b[j])
					{
						System.out.printf("%d",a[i]);
					 k = 1;
					break;
					}
				}
				if (k == 1)
				{
					break;
				}

			}
		return 0;
	}
}

