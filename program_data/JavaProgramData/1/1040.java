package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int zy = new int(int a,int b);
		int j;
		int n;
		int m;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			sum = zy(2, m);
			System.out.printf("%d\n",sum);
		}
	}
		public static int zy(int a,int b)
		{
			int i;
			int c;
			int t = 1;
			c = 0;
		for (i = a;i * i <= b;i++)
		{
				if (b % i == 0)
				{
					c = zy(i, (b / i)) + c;
				}
		}
			if (i * i > b)
			{
				c = c + 1;
			}
			return (c);
		}

}

