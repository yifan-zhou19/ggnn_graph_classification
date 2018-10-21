package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int flag1 = 0;
		int flag2 = 0;
		int flag3 = 0;
		int a;
		int k;
		int sign = 0;
		double c;
		int[] b = new int[20];
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
		for (i = m;i <= n;i++)
		{
			for (j = 2;j <= (i / 2) + 1;j++)
			{
				if (i % j == 0)
				{
					flag1 = 0;
					break;
				}
				else
				{
					flag1 = 1;
				}
			}
			if (flag1 == 0)
			{
				continue;
			}
			else
			{
				for (a = 1;;a++)
				{
					c = Math.pow(10,(double)a);
					if (i / c < 1)
					{
						break;
					}
				}
				a--;
				c = c / 10;
				k = i;
				for (j = 0;j <= a;j++)
				{
					b[j] = (int)(k / c);
					k = k - (int)(b[j] * c);
					c = c / 10;
				}
				for (j = 0;j <= a / 2;j++)
				{
					if (b[j] == b[a - j])
					{
						flag2 = 1;
					}
					else
					{
						flag2 = 0;
						break;
					}
				}
				if (flag2 == 1)
				{
					flag3 = 1;
					if (sign == 0)
					{
						System.out.printf("%d",i);
						sign = 1;
					}
					else
					{
						System.out.printf(",%d",i);
					}
				}
			}
		}
		if (flag3 == 0)
		{
			System.out.print("no");
		}
	}
}

