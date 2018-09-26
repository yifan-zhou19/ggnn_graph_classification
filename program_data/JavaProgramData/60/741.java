package <missing>;

public class GlobalMembers
{
	public static int F(int a)
	{
		int j;
		for (j = 2;j < a;j++)
		{
			if (a % j == 0)
			{
				return 0;
			}
			else if (j == a - 1 && a % j != 0)
			{
				return 1;
			}
		}
	}
	public static int Main()
	{
		int n;
		int r = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i < n - 1;i++)
		{
			if (F(i) != 0 && F(i + 2) != 0)
			{
				System.out.printf("%d %d\n",i,i + 2);
				r++;
			}
			if (i == n - 2 && r == 0)
			{
				System.out.print("empty");
			}
		}
		return 0;
	}
}

