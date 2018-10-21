//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int leapyearjudgement = int YEAR;
		int daycounting = new int(int month,int date,int LEAPYEAR);
		int sy;
		int sm;
		int sd;
		int ey;
		int em;
		int ed;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sy = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			sm = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			sd = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead("\n");
		if (tempVar4 != null)
		{
			ey = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			em = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			ed = Integer.parseInt(tempVar6);
		}
		int year;
		int countleapyear;
		countleapyear = 0;
		for (year = sy;year < ey;year++)
		{
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			{
				countleapyear++;
			}
		}
		int d1; //d1???????????,??????????????2??????????
		int d2;
		d1 = (ey - sy) * 365 + countleapyear;

		int daystart;
		int dayend;
		int leapyearstart;
		int leapyearend;
		leapyearstart = leapyearjudgement(sy);
		daystart = daycounting(sm, sd, leapyearstart);
		leapyearend = leapyearjudgement(ey);
		dayend = daycounting(em, ed, leapyearend);

		d2 = dayend - daystart;

		int DAY;
		DAY = d1 + d2;
		System.out.printf("%d",DAY);
		return 0;
	}

	public static int leapyearjudgement(int YEAR) //?????
	{
		int judge; //??????????1???0
		judge = 0;
		if ((YEAR % 4 == 0 && YEAR % 100 != 0) || YEAR % 400 == 0)
		{
			judge = 1;
		}
		return (judge);
	}

	public static int daycounting(int month,int date,int LEAPYEAR) //?????
	{
		int day;
		if ((LEAPYEAR = 1) != 0)
		{
			switch (month)
			{
		  case 1:
			  day = date;
			  break;
		  case 2:
			  day = 31 + date;
			  break;
		  case 3:
			  day = 60 + date;
			  break;
		  case 4:
			  day = 91 + date;
			  break;
		  case 5:
			  day = 121 + date;
			  break;
		  case 6:
			  day = 152 + date;
			  break;
		  case 7:
			  day = 182 + date;
			  break;
		  case 8:
			  day = 213 + date;
			  break;
		  case 9:
			  day = 244 + date;
			  break;
		  case 10:
			  day = 274 + date;
			  break;
		  case 11:
			  day = 305 + date;
			  break;
		  case 12:
			  day = 335 + date;
			}
		}
		else
		{
			switch (month)
		{
		  case 1:
			  day = date;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


