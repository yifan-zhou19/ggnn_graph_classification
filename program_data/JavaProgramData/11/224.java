package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int y;
	  int m;
	  int d;
	  int t;
	  int i;
	  for (i = 1;i <= 5;)
	  {
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
		{
		  switch (m)
		  {
			case 1:
				t = d;
				break;
			case 2:
				t = d + 31;
				break;
			case 3:
				t = d + 60;
				break;
			case 4:
				t = d + 91;
				break;
			case 5:
				t = d + 121;
				break;
			case 6:
				t = d + 152;
				break;
			case 7:
				t = d + 182;
				break;
			case 8:
				t = d + 213;
				break;
			case 9:
				t = d + 244;
				break;
			case 10:
				t = d + 274;
				break;
			case 11:
				t = d + 305;
				break;
			case 12:
				t = d + 335;
				break;
		  }
		}
		else
		{
		  switch (m)
		  {
			case 1:
				t = d;
				break;
			case 2:
				t = d + 31;
				break;
			case 3:
				t = d + 59;
				break;
			case 4:
				t = d + 90;
				break;
			case 5:
				t = d + 120;
				break;
			case 6:
				t = d + 151;
				break;
			case 7:
				t = d + 181;
				break;
			case 8:
				t = d + 212;
				break;
			case 9:
				t = d + 243;
				break;
			case 10:
				t = d + 273;
				break;
			case 11:
				t = d + 304;
				break;
			case 12:
				t = d + 334;
				break;
		  }
		}
		System.out.printf("%d\n",t);
		i++;
	  }
	}
}

