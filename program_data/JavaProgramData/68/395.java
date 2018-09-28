package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int judge = int x;
		int n;
		int m;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{
			for (j = 3;j < n / 2;j++)
			{
				if (judge(j) != 0 && judge(i - j) != 0)
				{
					System.out.printf("%d=%d+%d\n",i,j,i - j);
					break;
				}
			}
		}
	}

	public static int judge(int x)
	{
		int flag = 1;
		int i;
		int y;
		y = Math.sqrt(x);
		for (i = 2;i <= y != 0 && flag == 1;i++)
		{
			if (x % i == 0)
			{
				flag = 0;
			}
		}
		return (flag);
	}
}

