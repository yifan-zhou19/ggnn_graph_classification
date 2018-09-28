package <missing>;

public class GlobalMembers
{
	public static int is_sushu(int i)
	{
		int p;
		int q = 0;
		for (p = 2;p <= i;p++)
		{
			if (i % p == 0)
			{
				q++;
			}
		}
		if (q == 1)
		{
			return 1;
		}
	return 0;
	}
	public static int Main()
	{
		int n;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
			for (int i = 2;i <= n - 2;i++)
			{
				if (is_sushu(i) != 0 && is_sushu(i + 2) != 0)
				{
					System.out.printf("%d %d\n",i,i + 2);
					s++;
				}
			}
			if (s == 0)
			{
				System.out.print("empty");
			}
	return 0;
	}
}

