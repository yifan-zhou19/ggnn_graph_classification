package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		for (int p = 2;p < x;p++)
		{
			if (x % p == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		int i = 2;
		int n;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i;i <= n;i++)
		{
			if (sushu(i) != 0 && sushu(i + 2) != 0 && i + 2 <= n)
			{
				flag = 1;
				System.out.printf("%d %d\n",i,i + 2);
			}
		}
		if (flag == 0)
		{
			System.out.print("empty\n");
		}
		return 0;
	}

}

