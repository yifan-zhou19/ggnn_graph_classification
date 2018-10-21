package <missing>;

public class GlobalMembers
{
	public static int judge_output(int n,int k, int j,int a1)
	{
		int tp;
		int out;
		if (j == 1)
		{
			return a1;
		}
		else if (judge_output(n, k, j - 1, a1))
		{
			tp = judge_output(n, k, j - 1, a1);
			if ((tp % (n - 1)) == 0)
			{
				out = n * tp / (n - 1) + k;
				return out;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			return 0;
		}
	}
	public static void Main()
	{
		int n;
		int k;
		int i;
		int tp = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 1;;i++)
		{
			tp = judge_output(n, k, (n + 1), i);
			if (tp != 0)
			{
				System.out.printf("%d",tp);
				break;
			}
		}
	}
}

