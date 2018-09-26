package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int f = 0;
		int g = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i < n - 1;i++)
		{
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					break;
				}
				if (j == i - 1 && i % j != 0)
				{
					for (k = 2;k < i + 2;k++)
					{
						if ((i + 2) % k == 0)
						{
							break;
						}
						if (k == i + 1 && (i + 2) % k != 0)
						{
							System.out.printf("%d %d\n",i,i + 2);
							f = 1;
						}
					}
				}
			}
		}
		if (f == 0)
		{
			System.out.print("empty\n");
		}
	}

}

