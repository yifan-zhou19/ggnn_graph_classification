package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int max1;
		int max2;
		int place1;
		int place2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		if (a > b)
		{
			place1 = 1;
		}
		else
		{
			place1 = 2;
		}
		switch (place1)
		{
			case 1:
				max1 = a;
				max2 = b;
				break;
		case 2:
			max1 = b;
				max2 = a;
				break;
		}
		n = n - 2;
		while (n-- != 0)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}
			if (c <= max2)
			{
				place2 = 1;
			}
			else if (c < max1)
			{
				place2 = 2;
			}
			else
			{
				place2 = 3;
			}
			switch (place2)
			{
				case 1:
					break;
			case 2:
				max2 = c;
					break;
			case 3:
				max2 = max1;
					max1 = c;
					break;
			}

		}
		System.out.printf("%d\n%d",max1,max2);
		return 0;

	}
}

