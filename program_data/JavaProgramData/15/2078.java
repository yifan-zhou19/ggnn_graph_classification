package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int b1;
		int b2;
		int c1;
		int c2;
		int flag;
		int flag1;
		int result;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	flag1 = 1;
	flag = 1;
	for (b = 1;b <= a;b++)
	{
		e = 0;
		if (b <= a - 1)
		{
			for (c = 1;c <= a;c++)
			{
				if (c <= a - 1)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						d = Integer.parseInt(tempVar2);
					}
					e = e + d;
					if (d == 0 && flag == 1)
					{
						b1 = c;
						flag = 0;
					}
					if (d == 255 && flag == 0)
					{
					b2 = c;
					flag = 2;
					}
				}
				else
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						d = Integer.parseInt(tempVar3);
					}
					e = e + d;
					if (d == 0 && flag == 1)
					{
						b1 = c;
						flag = 0;
					}
					if (d == 255 && flag == 0)
					{
					b2 = c;
					flag = 2;
					}
				}
			}
		}
		else
		{
			for (c = 1;c <= a;c++)
			{
				if (c <= a - 1)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						d = Integer.parseInt(tempVar4);
					}
					e = e + d;
					if (d == 0 && flag == 1)
					{
						b1 = c;
						flag = 0;
					}
					if (d == 255 && flag == 0)
					{
					b2 = c;
					flag = 2;
					}
				}
				else
				{
					String tempVar5 = ConsoleInput.scanfRead();
					if (tempVar5 != null)
					{
						d = Integer.parseInt(tempVar5);
					}
					e = e + d;
					if (d == 0 && flag == 1)
					{
						b1 = c;
						flag = 0;
					}
					if (d == 255 && flag == 0)
					{
					b2 = c;
					flag = 2;
					}
				}
			}
		}
		if (e != 255 * a && flag1 == 1)
		{
			flag1 = 0;
			c1 = b;
		}
		if (e == 255 * a && flag1 == 0)
		{
			c2 = b;
		}
	}
	result = (c2 - c1 - 3) * (b2 - b1 - 2);
	System.out.printf("%d",result);
	return 0;
	}

}

