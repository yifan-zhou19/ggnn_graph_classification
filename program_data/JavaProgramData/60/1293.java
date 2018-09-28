package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int y;
		y = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= n - 2;i++)
		{
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
				break;
				}
			}
			if (j == i)
			{
				for (k = 2;k < i + 2;k++)
				{
					if ((i + 2) % k == 0)
					{
						 break;
					}
				}
				if (k == i + 2)
				{
				   y = 1;
				   System.out.printf("%d %d\n",i,i + 2);
				}
			}
			else
			{
			continue;
			}
		}
		 if (y == 0)
		 {
			 System.out.print("empty\n");
		 }
		 return (0);
	}
}

