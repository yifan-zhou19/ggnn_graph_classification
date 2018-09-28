package <missing>;

public class GlobalMembers
{
	public static int judge_p(int m)
	{
		int i;
		for (i = 2;i < m;i++)
		{
			if ((m % i) == 0)
			{
				break;
			}
		}
		if (i == m)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int judge_h(int m)
	{
		int i;
		int n = 0;
		int t = m;
		while (m != 0)
		{
			n = n * 10 + m % 10;
			m = (m - m % 10) / 10;
		}
		if (t == n)
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
		int m;
		int n;
		int i;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (judge_p(i) != 0 && judge_h(i) != 0 && j != 0)
			{
				System.out.printf(",%d",i);
			}
			if (judge_p(i) != 0 && judge_h(i) != 0 && j == 0)
			{
				System.out.printf("%d",i);
				j++;
			}
		}
		if (j == 0)
		{
			System.out.print("no");
		}
	}
}

