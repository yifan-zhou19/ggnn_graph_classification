package <missing>;

public class GlobalMembers
{
	public static int djt(int year, int month, int day)
	{
		int sum;
		int leap;
		  switch (month) //?????????????
		  {
		case 1:
			sum = 0;
			break;
		case 2:
			sum = 31;
			break;
		case 3:
			sum = 59;
			break;
		case 4:
			sum = 90;
			break;
		case 5:
			sum = 120;
			break;
		case 6:
			sum = 151;
			break;
		case 7:
			sum = 181;
			break;
		case 8:
			sum = 212;
			break;
		case 9:
			sum = 243;
			break;
		case 10:
			sum = 273;
			break;
		case 11:
			sum = 304;
			break;
		case 12:
			sum = 334;
			break;
		default:
			System.out.print("data error");
			break;
		  }
	  sum = sum + day; //????????
	  if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) //???????
	  {
		leap = 1;
	  }
	  else
	  {
		leap = 0;
	  }
	  if (leap == 1 && month > 2) //??????????,????????
	  {
		sum++;
	  }
	  return sum;
	}
	public static int Main()
	{
		  int a;
		  int b;
		  int c;
		  int d;
		  int e;
		  int f;
		  int g;
		  int h;
		  int s;
		  int i;
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
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			e = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			f = Integer.parseInt(tempVar6);
		}
		g = djt(a, b, c);
		h = djt(d, e, f);
		s = h - g;
		for (i = a;i < d;i++)
		{
			if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0))
			{
				s += 366;
			}
			else
			{
				s += 365;
			}
		}
				System.out.printf("%d\n",s);
		return 0;
	}

}

