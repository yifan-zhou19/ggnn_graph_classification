package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int sum;
		int x;
		int y;
		int k;
		int i;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sum = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y = Integer.parseInt(tempVar3);
		}
			for (i = 1;i < sum - 1;i++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					k = Integer.parseInt(tempVar4);
				}
				if (x > k)
				{
					a = k;
					x = x;
					if (y > a)
					{
						y = y;
					}
					if (y < a)
					{
						y = a;
					}
				}
				if (x < k)
				{
					a = x;
					x = k;
					if (y > a)
					{
						y = y;
					}
					if (y < a)
					{
						y = a;
					}
				}
			}
			System.out.printf("%d\n%d\n",x,y);
	}
}

