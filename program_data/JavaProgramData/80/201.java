package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int total = new int(int year,int month,int day);
		int yearo;
		int montho;
		int dayo;
		int totalo;
		int totalt;
		int yeart;
		int montht;
		int dayt;
		int t;
		int y;
		int i;
		int temp = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			yearo = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			montho = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			dayo = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			yeart = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			montht = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			dayt = Integer.parseInt(tempVar6);
		}
	//	if((yearo>yeart)||((yearo=yeart)&&(montho>montht))||((yearo=yeart)&&(montho=montht)&&(dayo>dayt)))

	//	{	totalo=total(yeart, montht, dayt);
	//		totalt=total(yearo, montho, dayo);
	//		yearo=y;
	///		yearo=yeart;
	//		yeart=y;
	//	}
	//	else
	//			{
					totalo = total(yearo, montho, dayo);
			totalt = total(yeart, montht, dayt);
	//	}
		t = totalt - totalo + 365 * (yeart - yearo);
		for (i = yearo;i <= yeart;i++)
		{
			if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0))
			{
			t++;
			}
		}
				System.out.printf("%d",t);
		return 0;
	}


	public static int total(int year,int month,int day)
	{
		int i;
			int[] mday = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			int total = 0;
			for (i = 1; i < month; i++)
			{
				total = total + mday[i - 1];
			}
	//		if( ((year%4==0&&year%100!=0) || year%400==0 )&&(month>2))
	//			total = total + 1;
			total = total + day;
		return total;
	}

}

