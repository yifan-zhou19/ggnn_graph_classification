package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int r;
		int c = new int(int y,int m,int d);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		r = c(y, m, d);
		System.out.printf("%d",r);
	}

	public static int run(int y)
	{
		if (y % 400 == 0)
		{
			return 1;
		}
		else if (y % 100 == 0)
		{
			return 0;
		}
			else if (y % 4 == 0)
			{
				return 1;
			}
		return 0;
	}

	public static int c(int y,int m,int d)
	{
		int i;
		int total = 0;
		int r = 0;
		for (i = 1;i < m;i++)
		{
			switch (i)
			{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			{
				r = r + 31;
				break;
			}
			case 4:
			case 6:
			case 9:
			case 11:
			{
				r = r + 30;
				break;
			}
			case 2:
			{
					if (run(y) != 0)
					{
						r = r + 29;
					}
				   else
				   {
					   r = r + 28;
				   }
				   break;
			}
			}
		}
		r = r + d;
		return (r);
	}

}

