package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int n;
		int a;
		int num = 0;
		int p;
		int q;
		int su;
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
		for (a = m;a <= n;a++)
		{
			su = 1;
			for (i = 2;i < a / 2;i++)
			{
				if (a % i == 0)
				{
					su = 0;
					break;
				}
			}
			if (su == 0)
			{
				continue;
			}
			else
			{
				p = a;
				q = 0;
				while (p > 0)
				{
					q = q * 10 + p % 10;
					p /= 10;
				}
				if (q == a)
				{
					num++;
					if (num == 1)
					{
						System.out.printf("%d",a);
					}
					if (num > 1)
					{
						System.out.printf(",%d",a);
					}
				}
			}
		}
		if (num == 0)
		{
			System.out.print("no");
		}
	}


}

