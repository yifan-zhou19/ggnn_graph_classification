package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int p;
		int a = 0;
		int b;
		int m = 0;
		int flag = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n * n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = Integer.parseInt(tempVar2);
			}
			if (p == 0)
			{
				if (m == 0)
				{
					flag = 1;
					a++;
					m++;
				}
				else
				{
					if (flag == 1)
					{
						m++;
						a++;
					}
					else
					{
						m++;
					}
				}
			}
			else
			{
				if (flag == 1)
				{
					flag = 0;
				}
			}
		}
		b = m / 2 - a;
		a = a - 2;
		System.out.printf("%d",a * b);
	}


}

