package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum;
		int i;
		int e;
		int n;
		sum = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			e = Integer.parseInt(tempVar);
		}

		for (i = 1;i <= e;i++)
		{

			int a;
			a = i;
			if (a % 7 == 0)
			{
				n = 1;
			}
			else
			{
				int b;
				int c;
				int d;
				d = a;
				do
				{
					c = d;
					b = c % 10;
					if (b == 7)
					{
						break;
					}
					else
					{
						d = (c - b) / 10;
					}
				} while (b != 0);
				if (b == 7)
				{
					n = 1;
				}
				else
				{
				n = 0;
				}
			}

			if (n == 0)
			{
				sum += i * i;
			}
			else
			{
				continue;
			}
		}
		System.out.printf("%d\n",sum);
		return 0;
	}

}

