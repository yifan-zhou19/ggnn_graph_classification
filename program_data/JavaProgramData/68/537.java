package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int n;
		int b;
		int i;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 6;a <= n;a = a + 2)
		{
		  for (b = 3;b <= a / 2;b = b + 2)
		  {
					for (i = 2;i <= Math.sqrt(b);i++)
					{
					if (b % i == 0)
					{
						break;
					}
					}
					if (i < (Math.sqrt(b) + 1) && i> Math.sqrt(b))
					{
						c = a - b;
					for (i = 2;i <= Math.sqrt(c);i++)
					{
					if (c % i == 0)
					{
						break;
					}
					}
					if (i < (Math.sqrt(c) + 1) && i> Math.sqrt(c))
					{
						System.out.printf("%d=%d+%d\n",a,b,c);
						break;
					}
					}
		  }

		}
	}
}

