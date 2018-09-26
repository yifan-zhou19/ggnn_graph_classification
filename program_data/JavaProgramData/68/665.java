package <missing>;

public class GlobalMembers
{
	public static int judge(int j) //judge???????????????
	{
		int k;
		for (k = 3;k <= Math.sqrt(j);k = k + 2)
		{
			if (j % k == 0)
			{
				break;
			}
		}
		if (k <= Math.sqrt(j))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2) //i???6~n??????
		{
			System.out.printf("%d=",i);
			for (j = 3;j <= i / 2;j = j + 2)
			{
				if (judge(j) == 0 && judge(i - j) == 0)
				{
					System.out.printf("%d+%d\n",j,i - j);
				break;
				}
			}
		}
	}
}

