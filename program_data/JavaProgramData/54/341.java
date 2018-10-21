package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int m;
		int x;
		int y;
		int z;
		int i;
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
		for (z = 1;;z++)
		{
			x = z;
			for (i = 1;1 <= n;i++)
			{

				y = (x * n + k) % (n - 1);
				if (y == 0)
				{
					x = (x * n + k) / (n - 1);
				}
				else
				{
					break;
				}
			}
		if (i == n)
		{
			break;
		}
		}
			m = x * n + k;
		System.out.printf("%d",m);
	}
}

