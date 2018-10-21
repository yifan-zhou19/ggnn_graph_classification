package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {1, 0, 0, 0, 0, 0};
		int n;
		int i;
		int shijian;
		while (a[0] != 0 || a[1] != 0 || a[2] != 0 || a[3] != 0 || a[4] != 0 || a[5] != 0)
		{
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		if (a[0] != 0 || a[1] != 0 || a[2] != 0 || a[3] != 0 || a[4] != 0 || a[5] != 0)
		{
			 shijian = 3600 * (12 + a[3] - a[0]) + (a[4] - a[1]) * 60 + a[5] - a[2];
		}
		else
		{
			break;
		}
		System.out.printf("%d\n",shijian);
		}
		return 0;
	}
}

