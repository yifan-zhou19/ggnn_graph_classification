package <missing>;

public class GlobalMembers
{
	public static int iszs(int x)
	{
		int a;
		int b = 0;
		for (a = 2;a <= Math.sqrt(x);a++)
		{
			if (x % a != 0)
			{
				continue;
			}
			else
			{
			  b = 1;
			  break;
			}
		}
	return b;
	}

	public static void Main()
	{
			int i;
			int n;
			int a = 2;
			int c;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			for (i = 6;i <= n;i = i + 2)
			{
				for (a = 2;a <= i / 2;a++)
				{
					if (iszs(a) == 0)
					{
						c = i - a;
						if (iszs(c) == 0)
						{
							System.out.printf("%d=%d+%d\n",i,a,c);
							break;
						}
					}
				}
			}


	}

}

