package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sushu = int n;
		int i;
		int n;
		int cunzai = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n - 2;i += 2)
		{
			if (sushu(i) != 0 && sushu(i + 2) != 0)
			{
				cunzai = 1;
				System.out.printf("%d %d\n",i,i + 2);
			}
		}
		if (cunzai == 0)
		{
			System.out.print("empty");
		}
		return 0;
	}
	public static int sushu(int n)
	{
		int i;
		int gen;
		int result = 1;
		gen = Math.sqrt(n);
		for (i = 2;i < gen + 1;i++)
		{
			if (n % i == 0)
			{
				result = 0;
				break;
			}
		}
		return result;
	}
}

