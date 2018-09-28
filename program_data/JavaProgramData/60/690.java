package <missing>;

public class GlobalMembers
{
	public static int judge(int x)
	{
		int i;
		if (x % 2 == 0)
		{
			return 0;
		}
		for (i = 3;i <= Math.sqrt(x);i += 2)
		{
			if (x % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}

	public static void Main()
	{
		int i;
		int n;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= n - 2;i++)
		{
			if (judge(i) == 1 && judge(i + 2) == 1)
			{
				System.out.printf("%d %d\n",i,i + 2);
				k++;
			}
		}
		if (k == 0)
		{
			System.out.print("empty\n");
		}
	}
}

