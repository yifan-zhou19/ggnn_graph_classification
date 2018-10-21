package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("\t");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead("\t");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		switch (b)
		{
			case 1:
				y = c;
				break;
			case 2:
				y = 31 + c;
				break;
			case 3:
				y = 59 + c;
				break;
			case 4:
				y = 90 + c;
				break;
			case 5:
				y = 120 + c;
				break;
			case 6:
				y = 151 + c;
				break;
			case 7:
				y = 181 + c;
				break;
			case 8:
				y = 212 + c;
				break;
			case 9:
				y = 243 + c;
				break;
			case 10:
				y = 273 + c;
				break;
			case 11:
				y = 304 + c;
				break;
			case 12:
				y = 334 + c;

		}
		System.out.printf("\n%d",y);
		return 0;
	}
}

