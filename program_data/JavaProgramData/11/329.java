package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i;
		int j;
		int m = 0;
		int n;
		int r = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		if (((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0))
		{
			r = 1;
		}
		if (r == 1)
		{
			switch (b)
			{
				case 2:
					m = 31;
					break;
				case 3:
					m = 60;
					break;
				case 4:
					m = 91;
					break;
				case 5:
					m = 121;
					break;
				case 6:
					m = 152;
					break;
				case 7:
					m = 182;
					break;
				case 8:
					m = 213;
					break;
				case 9:
					m = 244;
					break;
				case 10:
					m = 274;
					break;
				case 11:
					m = 305;
					break;
				case 12:
					m = 335;
					break;
			}
		}
		else
		{
			switch (b)
			{
				case 2:
					m = 31;
					break;
				case 3:
					m = 59;
					break;
				case 4:
					m = 90;
					break;
				case 5:
					m = 120;
					break;
				case 6:
					m = 151;
					break;
				case 7:
					m = 181;
					break;
				case 8:
					m = 212;
					break;
				case 9:
					m = 243;
					break;
				case 10:
					m = 273;
					break;
				case 11:
					m = 304;
					break;
				case 12:
					m = 334;
					break;
			}
		}
		n = m + c;
		System.out.printf("%d",n);
		return 0;
	}





}

