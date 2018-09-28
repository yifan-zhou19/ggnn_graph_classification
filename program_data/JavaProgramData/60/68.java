package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j = 0;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (x = 3;x <= n - 2;x += 2)
		{
			for (i = 2;i <= Math.sqrt(x);i++)
			{
				if (x % i == 0 || (x + 2) % i == 0 || (x + 2) % (i + 1) == 0)
				{
					break;
				}
			}
			if (i > Math.sqrt(x))
			{
				System.out.printf("%d %d\n",x,x + 2);
				j++;
			}
		}
		if (j == 0)
		{
			System.out.print("empty");
		}
	}
}

