package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
		int m = (int)Math.sqrt(n);
		int i;
		for (i = 3;i <= m;i++)
		{
			if (n % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static void Main(String[] args)
	{
		int n;
		int i;
		int num = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n - 2;i += 2)
		{
			if (sushu(i) == 1 && sushu(i + 2) == 1)
			{
				System.out.printf("%d %d\n",i,i + 2);
				num++;
			}
		}
		if (num == 0)
		{
			System.out.print("empty");
		}
	}
}

