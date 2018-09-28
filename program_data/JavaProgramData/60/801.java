package <missing>;

public class GlobalMembers
{
	public static int x;
	public static int y(int x)
	{
		int j;
		int s = 0;
		if (x == 2)
		{
			return 1;
		}
		else
		{
		for (j = 2;j < x;j++)
		{
			if (x % j == 0)
			{
				return 0;
				break;
			}
			s++;
		}
		if (s == x - 2)
		{
			return 1;
		}
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int z = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1 || n == 2 || n == 3)
		{
			System.out.print("empty");
		}
		else
		{
		for (i = 2;i < n - 1;i++)
		{
			if (y(i) != 0 && y(i + 2) != 0)
			{
				System.out.printf("%d %d\n",i,i + 2);
				z++;
			}
		}
		if (z == 0)
		{
			System.out.print("empty");
		}
		}
		return 0;
	}

}

