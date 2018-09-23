package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
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
		if (((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0))
		{
			switch (b)
			{
			case 1:
			{
				System.out.printf("%d", c);
				break;
			}
			case 2:
			{
				System.out.printf("%d", c + 31);
				break;
			}
			case 3:
			{
				System.out.printf("%d", c + 60);
				break;
			}
			case 4:
			{
				System.out.printf("%d", c + 91);
				break;
			}
			case 5:
			{
				System.out.printf("%d", c + 121);
				break;
			}
			case 6:
			{
				System.out.printf("%d", c + 152);
				break;
			}
			case 7:
			{
				System.out.printf("%d", c + 182);
				break;
			}
			case 8:
			{
				System.out.printf("%d", c + 213);
				break;
			}
			case 9:
			{
				System.out.printf("%d", c + 243);
				break;
			}
			case 10:
			{
				System.out.printf("%d", c + 273);
				break;
			}
			case 11:
			{
				System.out.printf("%d", c + 305);
				break;
			}
			case 12:
			{
				System.out.printf("%d", c + 335);
			}
			}
		}
		else
		{
			switch (b)
			{
			case 1:
			{
				System.out.printf("%d", c);
				break;
			}
			case 2:
			{
				System.out.printf("%d", c + 31);
				break;
			}
			case 3:
			{
				System.out.printf("%d", c + 59);
				break;
			}
			case 4:
			{
				System.out.printf("%d", c + 90);
				break;
			}
			case 5:
			{
				System.out.printf("%d", c + 120);
				break;
			}
			case 6:
			{
				System.out.printf("%d", c + 151);
				break;
			}
			case 7:
			{
				System.out.printf("%d", c + 181);
				break;
			}
			case 8:
			{
				System.out.printf("%d", c + 212);
				break;
			}
			case 9:
			{
				System.out.printf("%d", c + 243);
				break;
			}
			case 10:
			{
				System.out.printf("%d", c + 273);
				break;
			}
			case 11:
			{
				System.out.printf("%d", c + 304);
				break;
			}
			case 12:
			{
				System.out.printf("%d", c + 334);
			}
			}
		}
		return 0;
	}
}

