package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int c;
		int k = 0;
		int h = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n <= 4)
		{
			System.out.print("empty");
		}
		else
		{
			for (i = 3;i < n - 1;i++)
			{
				for (a = 2;a <= (i / 2);a++)
				{
				if (i % a == 0)
				{
					k = 1;
					break;
				}
				}
				if (k == 0)
				{
					b = i + 2;
					for (c = 2;c <= (b / 2);c++)
					{
						if (b % c == 0)
						{
						h = 1;
						break;
						}
					}
					if (h == 0)
					{
					System.out.printf("%d %d\n",i,b);
					}
				}
				k = 0;
				h = 0;

			}
		}

		return 0;
	}


}

