package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int d = 0;
		int i;
		int t;
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
		if (((a - 1) % 400) == 0)
		{
			d = 0;
		}
			else
			{
		for (i = 1;i <= ((a - 1) % 400);i++)
		{
			if ((i % 4) == 0)
			{
				if ((i % 100) == 0)
				{
					if ((i % 400) == 0)
					{
						d = d + 366;
					}
					else
					{
						d = d + 365;
					}
				}
				else
				{
					d = d + 366;
				}
			}
			else
			{
				d = d + 365;
			}
		}
			}
		switch (b)
		{
		case 1:
			d = d + c - 1;
			break;
		case 2:
			d = d + 30 + c;
			break;
		case 3:
			d = d + 58 + c;
			break;
		case 4:
			d = d + 89 + c;
			break;
		case 5:
			d = d + 119 + c;
			break;
		case 6:
			d = d + 150 + c;
			break;
		case 7:
			d = d + 180 + c;
			break;
		case 8:
			d = d + 211 + c;
			break;
		case 9:
			d = d + 242 + c;
			break;
		case 10:
			d = d + 272 + c;
			break;
		case 11:
			d = d + 303 + c;
			break;
		case 12:
			d = d + 333 + c;
			break;
		}
		if (((i % 4) == 0) && (b > 2))
		{
				if ((i % 100) == 0)
				{
					if ((i % 400) == 0)
					{
						d = d + 1;
					}
				}
				else
				{
					d = d + 1;
				}
		}
	  t = d % 7;
	  switch (t)
	  {
	  case 0:
		  System.out.print("Mon.");
		  break;
	  case 1:
		  System.out.print("Tue.");
		  break;
	  case 2:
		  System.out.print("Wed.");
		  break;
	  case 3:
		  System.out.print("Thu.");
		  break;
	  case 4:
		  System.out.print("Fri.");
		  break;
	  case 5:
		  System.out.print("Sat.");
		  break;
	  case 6:
		  System.out.print("Sun.");
		  break;
	  }
	}
}

