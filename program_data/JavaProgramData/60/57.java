package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
			System.out.print("empty");
		}
		else if (n >= 5)
		{
			System.out.print("3 5\n");
			for (i = 7;i < n;i = i + 2)
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
						for (m = 2;m < i - 2;m++)
						{
							if ((i - 2) % m == 0)
							{
								break;
							}
						}
							if (m == i - 2)
							{
								System.out.printf("%d %d\n",i - 2,i);
							}
					}
			}
		}

	}
}

