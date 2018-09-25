package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int a = 0;
		int b = 0;
		int i;
		int j;
		int c = 1000;
		int d = 1000;
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					num = Integer.parseInt(tempVar2);
				}
				if (num == 0)
				{
					if (a < i)
					{
						a = i;
					}
					if (b < j)
					{
						b = j;
					}
					if (c > i)
					{
						c = i;
					}
					if (d > j)
					{
						d = j;
					}
				}
			}
		}
		System.out.printf("%d\n",(a - c - 1) * (b - d - 1));
	}
}

