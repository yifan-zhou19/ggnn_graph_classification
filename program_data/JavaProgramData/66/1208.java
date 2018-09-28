package <missing>;

public class GlobalMembers
{
	//int isrunnian(int year);
	public static int total(int year, int mouth, int day)
	{
		int j = 0;
		for (int i = 1;i < mouth;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				j += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				j += 30;
			}
			else if (i == 2)
			{
				//if(isrunnian(year)){
				if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
				{
					j += 29;
				}
				else
				{
					j += 28;
				}
			}
		}
		j += day;
		return j;
	}
	public static int Main()
	{
		int k;
		int p;
		int q;
		int year;
		int mouth;
		int day;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			mouth = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		//for(k=1;k<=year-1;k++){
			//if(isrunnian(k)){
		//	if(k%400==0 || (k%4==0&&k%100 != 0) )
		//	{
		//		sum+=2;
		//	}else{
		//		sum+=1;
		//	}
		//}
		sum += year - 1 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		p = total(year, mouth, day);
		q = p + sum;
		if (q % 7 == 0)
		{
			System.out.print("Sun.\n");
		}
		if (q % 7 == 1)
		{
			System.out.print("Mon.\n");
		}
		if (q % 7 == 2)
		{
			System.out.print("Tue.\n");
		}
		if (q % 7 == 3)
		{
			System.out.print("Wed.\n");
		}
		if (q % 7 == 4)
		{
			System.out.print("Thu.\n");
		}
		if (q % 7 == 5)
		{
			System.out.print("Fri.\n");
		}
		if (q % 7 == 6)
		{
			System.out.print("Sat.\n");
		}
		return 0;
	}
}

