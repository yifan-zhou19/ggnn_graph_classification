package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int s;
		int a;
		int n;
		int b;
		int c;

		int count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= s;i++)
		{
			if (i % 2 == 0)
			{
				a = i;
			for (n = 2;n <= a / 2;n++)
			{
				 c = (int)(Math.sqrt(n));
					for (k = 2;k <= c;k++)
					{
					  if (n % k == 0)
					  {
						 break;
					  }
					}
					if (k > c)
					{
						  b = a - n;
									for (k = 2;k <= (Math.sqrt(b));k++)
									{
					  if (b % k == 0)
					  {
						  break;
					  }
									}
					  if (k > ((int)(Math.sqrt(b))))
					  {
					   System.out.printf("%d=%d+%d\n",a,n,b);
						  break;
					  }
					}
			}
			}
		}
		return 0;
	}

}

