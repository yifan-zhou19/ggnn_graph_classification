package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
		int a;
		int b;
		int flag = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		for (b = y;b >= 1;b = b / 2)
		{
			for (a = x;a >= 1;a = a / 2)
			{
				if (a == b)
				{
					if (flag == 1)
					{
						System.out.printf("%d",a);
						flag = 0;
					}
				}
			}
		}

	}
}

