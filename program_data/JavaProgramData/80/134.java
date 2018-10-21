package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int sty;
		int stm;
		int std;
		int eny;
		int enm;
		int end;
		int i;
		int j;
		int k;
		int a;
		int b;
		a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sty = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			stm = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			std = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			eny = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			enm = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			end = Integer.parseInt(tempVar6);
		}
		int daysto1_1_ = int n;
		std = std + daysto1_1_(stm);
		end = end + daysto1_1_(enm);
		if ((stm <= 2 && sty % 4 == 0 && sty % 100 != 0) || sty % 400 == 0)
		{
			a++;
		}
		for (i = sty + 1;i < eny;i++)
		{
				if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
				{
				a++;
				}
		}
		if ((enm >= 2 && eny % 4 == 0 && eny % 100 != 0) || eny % 400 == 0)
		{
			a++;
		}
		b = end - std + a + 365 * (eny - sty);
		System.out.printf("%d",b);
	}
	public static int daysto1_1_(int n)
	{
		int y = 0;
		switch (n)
		{
		case 12:
			y = y + 30;
		case 11:
			y = y + 31;
		case 10:
			y = y + 30;
		case 9:
			y = y + 31;
		case 8:
			y = y + 31;
		case 7:
			y = y + 30;
		case 6:
			y = y + 31;
		case 5:
			y = y + 30;
		case 4:
			y = y + 31;
		case 3:
			y = y + 28;
		case 2:
			y = y + 31;
		default:
			break;
		}
		return (y);
	}
}

