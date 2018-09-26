package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int n;
		int k;
		int x;
		int judge = new int(int,int,int);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= 1000000000;i++)
		{
			x = judge(n, k, i);
			if (x == 1)
			{
				System.out.printf("%d",i);
				break;
			}
		}
	}

	public static int judge(int n, int k, int i)
	{
		int yushu;
		int j;
		for (j = 1;j <= n;j++)
		{
			yushu = i % n;
			i = i - yushu - i / n;
			if (yushu != k || i == 0)
			{
				break;
			}
		}
		if (j == n + 1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

}

