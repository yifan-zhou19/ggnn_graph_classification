package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		int y;
		y = (((x % 4 == 0) && (x % 100 != 0)) || (x % 400 == 0))?1:0;
		return (y);
	}
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int c = 0;
		int p = 0;
		int n = 0;
		int q = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}
			if (b > c)
			{
				q = b;
				b = c;
				c = q;
			}
			if (f(a) == 1 && b <= 2 && c>2)
			{
						p += 1;
			}
			for (b;b < c;b++)
			{
				switch (b)
				{
				case 2:
				p += 28;
				break;
				case 4:
				p += 30;
				break;
				case 6:
				p += 30;
				break;
				case 9:
				p += 30;
				break;
				case 11:
				p += 30;
				break;
				default:
					p += 31;
					break;
				}
			}
			if (p % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
			p = 0;
		}
		return 0;
	}
}

