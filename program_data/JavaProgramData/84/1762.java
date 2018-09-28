package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = Integer.parseInt(tempVar2);
			}
			if (i == 0)
			{
				a = c;
				b = c;
			}
			else if (i == 1)
			{
				if (c >= a)
				{
					a = c;
					b = b;
				}
				else
				{
					a = a;
					b = c;
				}

			}
			else
			{
				if (c >= a)
				{
					b = a;
					a = c;
				}
				else if (c <= b)
				{
					a = a;
					b = b;
				}
				else
				{
					a = a;
					b = c;
				}
			}
		}
			System.out.printf("%d\n",a);
			System.out.printf("%d\n",b);
			return 0;
	}
}

