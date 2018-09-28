package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
			int a;
			int b;
			int c;
			int i;
		 int d = 0;
		i = 1;
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
		a = a - (a - 1) / 400 * 400;
		while (i < a)
		{
			if (i % 4 != 0 || i % 100 == 0 && i % 400 != 0)
			{
				d++;
			}
			else
			{
				d = d + 2;
			}
			i++;
		}
		i = 1;
		while (i < b)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				d = d + 3;
			}
			else if (i == 2)
			{
				if (a % 4 != 0 || a % 100 == 0 && a % 400 != 0)
				{
					d = d + 0;
				}
				else
				{
					d++;
				}
			}
			else
			{
				d = d + 2;
			}
			i++;
		}
		d = d + c;
		d = d % 7;
		switch (d)
		{
		case 1:
			System.out.print("Mon.\n");
			break;
		case 2:
			System.out.print("Tue.\n");
			break;
		case 3:
			System.out.print("Wed.\n");
			break;
		case 4:
			System.out.print("Thu.\n");
			break;
		case 5:
			System.out.print("Fri.\n");
			break;
		case 6:
			System.out.print("Sat.\n");
			break;
		case 0:
			System.out.print("Sun.\n");
		}

	}

}

