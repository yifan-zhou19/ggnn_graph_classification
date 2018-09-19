package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int x;
		int y;
		int s;
		int num = 0;
		for (;;)
		{
			num = 0;
		for (i = 0;i < 16;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			if (a[i] == 0)
			{
				break;
			}
		}
		if (a[0] == -1)
		{
			break;
		}
		if (a[0] == 0)
		{
			System.out.printf("%d",num);
		}
		for (x = 0;x < i;x++)
		{
			for (y = 0;y < i;y++)
			{
				s = a[x] - a[y] - a[y];
				if (s == 0)
				{
					num++;
				}
			}
		}
		System.out.printf("%d\n",num);
		}
		return 0;
	}


}

