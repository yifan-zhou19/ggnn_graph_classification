package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int r;
		int s;
		s = 0;
		for (r = 2;r <= (n - 2);r++)
		{
			j = 0;
			for (i = 2;i <= r;i++)
			{
				if (r % i == 0)
				{
					j++;
				}
			}
			if (j == 1)
			{
				j = 0;
				for (i = 2;i <= (r + 2);i++)
				{
					if ((r + 2) % i == 0)
					{
						j++;
					}
				}
				if (j == 1)
				{
					System.out.printf("%d %d\n",r,r + 2);
					s++;
				}
			}
		}
		if (s == 0)
		{
			System.out.print("empty\n");
		}

	}
}

