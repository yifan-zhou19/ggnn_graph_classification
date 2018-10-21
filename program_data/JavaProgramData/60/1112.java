package <missing>;

public class GlobalMembers
{
	public static int s(int x)
	{
		int k;
		for (k = 2;x % k != 0;k++)
		{
		}
		if (k == x)
		{
			return 1;
		}
		else
		{
		}
		return 0;
	}
	public static int Main()
	{
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
			System.out.print("empty");
			return 0;
		}
		for (i = 2;i < n;i++)
		{
			if (s(i) == 1 && s(i + 2) == 1)
			{
				System.out.printf("%d %d\n",i,i + 2);
			}

		}

	}
}

