package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 6;
		int t;
		int a;
		int b = 3;
		int c;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i++)
		{
			for (b = 3;b <= (i / 2);b++)
			{
				for (t = 2;t <= (Math.sqrt(b));t++)
				{
					a = b % t;
					if (a == 0 && b != t)
					{
						break;
					}
				}
				if (a != 0)
				{
					for (s = 2;s <= (Math.sqrt(i - b));s++)
					{
						c = (i - b) % s;
						if (c == 0 && s != (i - b))
						{
							break;
						}
					}
					if (c != 0)
					{
						System.out.printf("%d=%d+%d\n",i,b,(i - b));
						break;
					}
				}
			}
			i++;
		}
		return 0;
	}


}

