package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int y; //y=year,m=month,d=day
		int m;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		if (y % 100 == 0 && y % 40 == 0 || y % 100 != 0 && y % 4 == 0) //leap year,29 days in Feb
		{
			switch (m)
			{
				case 1:
					System.out.printf("%d\n",d);
					break;
				case 2:
					System.out.printf("%d\n",d + 31);
					break;
				case 3:
					System.out.printf("%d\n",d + 60);
					break;
				case 4:
					System.out.printf("%d\n",d + 91);
					break;
				case 5:
					System.out.printf("%d\n",d + 121);
					break;
				case 6:
					System.out.printf("%d\n",d + 152);
					break;
				case 7:
					System.out.printf("%d\n",d + 182);
					break;
				case 8:
					System.out.printf("%d\n",d + 213);
					break;
				case 9:
					System.out.printf("%d\n",d + 244);
					break;
				case 10:
					System.out.printf("%d\n",d + 274);
					break;
				case 11:
					System.out.printf("%d\n",d + 305);
					break;
				case 12:
					System.out.printf("%d\n",d + 335);
					break;

			}
		}
		else
		{
			switch (m)
			{
				case 1:
					System.out.printf("%d\n",d);
					break;
				case 2:
					System.out.printf("%d\n",d + 31);
					break;
				case 3:
					System.out.printf("%d\n",d + 59);
					break;
				case 4:
					System.out.printf("%d\n",d + 90);
					break;
				case 5:
					System.out.printf("%d\n",d + 120);
					break;
				case 6:
					System.out.printf("%d\n",d + 151);
					break;
				case 7:
					System.out.printf("%d\n",d + 181);
					break;
				case 8:
					System.out.printf("%d\n",d + 212);
					break;
				case 9:
					System.out.printf("%d\n",d + 243);
					break;
				case 10:
					System.out.printf("%d\n",d + 273);
					break;
				case 11:
					System.out.printf("%d\n",d + 304);
					break;
				case 12:
					System.out.printf("%d\n",d + 334);
					break;
			}
		}
	}


}

