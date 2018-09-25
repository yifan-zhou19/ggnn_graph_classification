package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int indiv;
		int ten;
		int hundred;
		int thousand;
		int place;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n > 999)
		{
			place = 4;
		}
		else if (n > 99)
		{
			place = 3;
		}
		else if (n > 9)
		{
			place = 2;
		}
		else
		{
			place = 1;
		}
		thousand = n / 1000;
		hundred = (int)(n - thousand * 1000) / 100;
		ten = (int)(n - thousand * 1000 - hundred * 100) / 10;
		indiv = (int)(n - thousand * 1000 - hundred * 100 - ten * 10);
		switch (place)
		{
		case 4:
			System.out.printf("%d%d%d%d",indiv,ten,hundred,thousand);
			break;
		case 3:
			System.out.printf("%d%d%d",indiv,ten,hundred);
			break;
		case 2:
			System.out.printf("%d%d",indiv,ten);
			break;
		case 1:
			System.out.printf("%d",indiv);
			break;
		}
	}
}

