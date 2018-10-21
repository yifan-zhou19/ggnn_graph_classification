package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int t;
		int flag;
		int x;
		int y;
		int z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		if (x < 5)
		{
			System.out.print("empty\n");
		}
		else
		{
		for (i = 2; i <= x - 2; i++)
		{
			flag = 0;
			for (t = 2; t <= i / 2; t++)
			{
				if (i % t == 0)
				{
					flag = 1;
					break;
				}

			}
			if (flag == 0)
			{
				  for (y = 2;y < i + 2;y++)
				  {
						if ((i + 2) % y == 0)
						{
											break;
						}
				  }
				  if ((i + 2) == y)
				  {
				  System.out.printf("%d %d\n",i,i + 2);
				  }
			}

		}
		}
		return 0;
	}
}

