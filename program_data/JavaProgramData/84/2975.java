package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int i = 0;
		int a;
		int b;
		int c = 0;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		k = k - 1;
		for (;i <= k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			if (a < b)
			{
				if (a > c)
				{
					c = a,b = b;
				}
				else
				{
					c = c,b = b;
				}
			}
			else
			{
				if (d > c)
				{
					c = b,b = a;
				}
				else
				{
					c = c,b = a;
				}
			}
		}
		System.out.printf("%ld\n%ld\n",b,c);
	}
}

