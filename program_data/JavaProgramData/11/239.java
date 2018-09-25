package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int i;
		int j = 1;
		while (j <= 5)
		{
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		i = 1;
		d = 0;
		while (i < b)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
			{
				d = d + 31;
			}
			else if (i == 2)
			{
				if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
				{
					d = d + 29;
				}
				else
				{
					d = d + 28;
				}
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				d = d + 30;
			}
			i = i + 1;
		}
		d = d + c;
		System.out.printf("%d\n",d);
		j = j + 1;
		}
		return 0;
	}
}

