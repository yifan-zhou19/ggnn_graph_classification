package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;
		int k;
		int t;
		int s;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = a;i <= b;i++)
		{
			n = i;
			s = 0;
			for (k = 2;k <= (n / 2);k++)
			{
				if (n % k == 0)
				{
					s = s + 1;
				break;
				}
			}
			if (s == 0)
			{
			for (;;)
			{
				t = n % 10;
				s = s * 10 + t;
				n = n / 10;
				if (n == 0)
				{
					break;
				}
			}
			if (s == i)
			{
				System.out.printf("%d",i);
			break;
			}
			}
		}
		if (i > b)
		{
			System.out.print("no");
		}

			for (j = i + 1;j <= b;j++)
			{
			m = j;
			s = 0;
			for (k = 2;k < (m / 2);k++)
			{
				if (m % k == 0)
				{
					s = s + 1;
				break;
				}
			}
				if (s == 0)
				{
			for (;;)
			{
				t = m % 10;
				s = s * 10 + t;
				m = m / 10;
				if (m == 0)
				{
					break;
				}
			}
			if (s == j)
			{
				System.out.printf(",%d",j);
			}
				}
			}
			 return 0;
	}
}

