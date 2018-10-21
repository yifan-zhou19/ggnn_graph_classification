package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int h;
		int k;
		int s;
		int m;
		int i;
		int n;
		int a; //n????n??,t???????a??????b?????
		int b;
		int t = 4;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= (n - 4) / 2;i++)
		{
			t = t + 2;

		for (a = 2;a <= t / 2;a++)

		{
			m = 0;
			for (k = 1;k <= Math.sqrt(a);k++)
			{
				if (a % k == 0)
				{
			  m = m + k;
				}
			}
		s = 0;
		if (m == 1)
		{
				b = t - a;

				for (h = 1;h <= Math.sqrt(b);h++)
				{
					if (b % h == 0)
					{
				s = s + h;
					}
				}
		}

				   if (s == 1)
				   {
					   System.out.printf("%d=%d+%d\n",t,a,b);
					  break;
				   }
		}
		}
		return 0;
	}


}

