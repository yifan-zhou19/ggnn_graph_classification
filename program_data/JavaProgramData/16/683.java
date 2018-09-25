package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int ge;
		int shi;
		int bai;
		int qian;
		int wan;
		int place = 1;
		int j = 2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 9;i <= 10000;i = i * 10 + 9)
		{
			if (n > i)
			{
				place = j;
			}
					j = j + 1;
		}
			wan = n / 10000;
			qian = (n - wan * 10000) / 1000;
			bai = (n - wan * 10000 - qian * 1000) / 100;
			shi = (n - wan * 10000 - qian * 1000 - bai * 100) / 10;
			ge = n - wan * 10000 - qian * 1000 - bai * 100 - shi * 10;
		switch (place)
		{
		case 5:
			System.out.printf("%d%d%d%d%d",ge,shi,bai,qian,wan);
			break;
		case 4:
			System.out.printf("%d%d%d%d",ge,shi,bai,qian);
			break;
		case 3:
			System.out.printf("%d%d%d",ge,shi,bai);
			break;
		case 2:
			System.out.printf("%d%d",ge,shi);
			break;
		case 1:
			System.out.printf("%d",n);
			break;
		default:
			System.out.print("error");
		}
		return 0;
	}
}

