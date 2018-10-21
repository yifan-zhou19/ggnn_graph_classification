package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] su = new int[25000];
		int i;
		int j;
		int num = 0;
		for (i = 2;i < 25001;i++)
		{
			for (j = 2;j <= Math.sqrt(i);j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (j > Math.sqrt(i))
			{
				su[num] = i;
				num++;
			}
		}
		int a;
		int b;
		for (a = 6;a <= n;a += 2)
		{
			for (i = 0;;i++)
			{
				b = a - su[i];
				for (j = 2;j <= Math.sqrt(b);j++)
				{
					if (b % j == 0)
					{
						break;
					}
				}
				if (j > Math.sqrt(b))
				{
					System.out.printf("%ld=%ld+%ld\n",a,su[i],b);
				}
				if (j > Math.sqrt(b))
				{
					break;
				}
			}
		}
		return 0;
	}
}

