package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int a;
		int b;
		int c = 0;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{
			for (a = 2;a <= (i / 2);a++)
			{
				c = 0;
				for (b = 2;b <= (Math.sqrt(a));b++)
				{
					if (a % b != 0)
					{
						c = c;
					}
					else
					{
						c++;
					break;
					}
				}
				 d = i - a;
				for (b = 2;b <= (Math.sqrt(d));b++)
				{
					if (d % b != 0)
					{
						c = c;
					}
					else
					{
						c++;
					break;
					}
				}

				if (c == 0)
				{
					System.out.printf("%d=%d+%d\n",i,a,d);
					break;
				}

			}
		}
	}


}

