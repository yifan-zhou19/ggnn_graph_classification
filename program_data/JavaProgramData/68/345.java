package <missing>;

public class GlobalMembers
{
	public static int f(int i)
	{
		int j;
		int s = 1;
		if (i % 2 == 0)
		{
			s = 0;
		}
		for (j = 3;j <= (int)Math.sqrt(i);j += 2)
		{
			if (i % j == 0)
			{
				s = 0;
			}
		}
		return (s);
	}
	public static void Main()
	{
		int n;
		int a;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int f = int i;
		for (a = 6;a <= n;a += 2)
		{
			for (i = 2;i <= (a / 2);i++)
			{
				if (f(i) == 1 && f(a - i) == 1)
				{
					System.out.printf("%d=%d+%d\n",a,i,(a - i));
					break;
				}
			}
		}
	}

}

