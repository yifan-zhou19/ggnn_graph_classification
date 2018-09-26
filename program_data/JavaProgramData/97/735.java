package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] shu = new int[6];
		int[] qian = {100, 50, 20, 10, 5, 1};
		int zong = 0;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 6;i++)
		{
			for (j = 1;;j++)
			{
				if (zong + qian[i] * j <= n)
				{
					shu[i] += 1;
				}
				else
				{
					zong += shu[i] * qian[i];
					break;
				}
			}
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",shu[i]);
		}
		return 0;
	}
}

