package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int x;
		int m;
		int n;
		int i;
		int j;
		int p = 0;
		int s;
		int sign;
		double k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		i = m;
		for (i = m;i <= n;i++)
		{
	//		printf("i:%d  ",i);
			x = 0;
			a = i;
			s = i;
			for (;a != 0;)
			{
				b = a % 10;
				x = 10 * x + b;
				a = a / 10;
			}
			if (x == s)
			{
		//		printf(" huiwen");
				sign = 0;
				k = Math.sqrt(x);
				for (j = 2;j <= k;j++)
				{
					if (x % j == 0)
					{
						sign = 1;
						break;
					}
				}
				if (sign == 0)
				{
		//			printf(" prime");
					p++;
					if (p == 1)
					{
						System.out.printf("%d",x);
					}
					else if (p > 1)
					{
						System.out.printf(",%d",x);
					}

				}
			}
		}
		if (p == 0)
		{
			System.out.print("no");
		}
	}
}

