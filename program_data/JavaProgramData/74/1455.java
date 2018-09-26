package <missing>;

public class GlobalMembers
{
	public static int panduan(int m)
	{
		int k;
		int i = 0;
		int j;
		int s = 0;
		int n;
		n = m;
		do
		{
			n = n / 10;
			i++;
		}while (n > 0);
		n = m;
		for (j = 0;j < i;j++)
		{
			k = n % 10;
			n = n / 10;
			s = 10 * s + k;
		}

		if (m == s)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int shushu(int m)
	{
		int flag = 0;
		int i;
		int j;
		if (m == 1)
		{
			return 0;
		}
		for (i = 2;i < m;i++)
		{
			if (m % i == 0)
			{
				flag = 1;
				break;
			}
		}
		if (flag == 1)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}

	public static int Main()
	{
		int m;
		int n;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (;m <= n;m++)
		{
			if (panduan(m) == 1 && shushu(m) == 1)
			{
				if (flag == 0)
				{
					System.out.printf("%d",m);
					flag++;
				}
				else
				{
					System.out.printf(",%d",m);
					flag++;
				}
			}
		}
		if (flag == 0)
		{
			System.out.print("no");
		}
		return 0;
	}

}

