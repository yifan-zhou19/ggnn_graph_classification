package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int l;
		int flag = 0;
		int c;
		int sign = 0;
		int t;
		int o;
		int d;
		int tip = 0;
		int h = 0;
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
		for (i = m;i <= n;i++)
		{
			c = i;
			d = Math.sqrt(i);
			for (j = 2;j <= d;j++)
			{
				if (i % j != 0)
				{
					flag++;
				}
				else
				{
					break;
				}
			}
			if (flag == (d - 1))
			{
				do
				{
					c /= 10;
					sign++;
				} while (c != 0);
				for (k = 1;k <= (sign / 2);k++)
				{
					t = i;
					o = i;
					for (l = 1;l < k;l++)
					{
						t /= 10;
					}
					for (l = 1;l <= (sign - k);l++)
					{
						o /= 10;
					}
					if ((t % 10) == (o % 10))
					{
						tip++;
					}
				}
				if (tip == (sign / 2))
				{
					if (h == 0)
					{
						System.out.printf("%d", i);
					}
					else
					{
						System.out.printf(",%d", i);
					}
					h++;
				}
			}
			flag = 0;
			tip = 0;
			sign = 0;
			/*????????????*/
		}
		if (h == 0)
		{
			System.out.print("no");
		}
	}
}

