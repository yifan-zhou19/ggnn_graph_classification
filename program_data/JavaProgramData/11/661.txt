package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int sum;
		int jan = 31;
		int feb;
		int mar = 31;
		int apr = 30;
		int may = 31;
		int jun = 30;
		int jul = 31;
		int aug = 31;
		int sep = 30;
		int oct = 31;
		int nov = 30;
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
		if ((y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0)))
		{
		feb = 29;
		}
		else
		{
			feb = 28;
		}
		switch (m)
		{
		case 1:
			sum = d;
			break;
		case 2:
			sum = jan + d;
			break;
		case 3:
			sum = jan + feb + d;
			break;
		case 4:
			sum = jan + feb + mar + d;
			break;
		case 5:
			sum = jan + feb + mar + apr + d;
			break;
		case 6:
			sum = jan + feb + mar + apr + may + d;
			break;
		case 7:
			sum = jan + feb + mar + apr + may + jun + d;
			break;
		case 8:
			sum = jan + feb + mar + apr + may + jun + jul + d;
			break;
		case 9:
			sum = jan + feb + mar + apr + may + jun + jul + aug + d;
			break;
		case 10:
			sum = jan + feb + mar + apr + may + jun + jul + aug + sep + d;
			break;
		case 11:
			sum = jan + feb + mar + apr + may + jun + jul + aug + sep + oct + d;
			break;
		case 12:
			sum = jan + feb + mar + apr + may + jun + jul + aug + sep + oct + nov + d;
			break;
		}
		System.out.printf("%d",sum);
		return 0;
	}
}

