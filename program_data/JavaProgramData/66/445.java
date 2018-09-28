package <missing>;

public class GlobalMembers
{
	public static int isRunNian(int year)
	{
		int result;
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
		{
			result = 1;
		}
		else
		{
			result = 0;
		}
		  return result;
	}
	public static void Main()
	{


	  int iday;
	  int imonth;
	  int iyear;

	  int i;
	  int j;
	  int num;
	  int t1;
	  int sum;


	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 iyear = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 imonth = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 iday = Integer.parseInt(tempVar3);
	 }

	 sum = 0;


	 //??????
	 //???????




	sum = (iyear - 1) * (365 % 7) + (iyear - 1) / 4 - (iyear - 1) / 100 + (iyear - 1) / 400;


	//printf("%d \n",sum);
	//printf("%d %d\n",sum,num-j);

	//??????


	for (i = 1;i < imonth;i++)
	{

			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				sum += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				sum += 30;
			}
			else if (i == 2)
			{
				if (isRunNian(iyear) != 0)
				{
					sum += 29;
				}
				else
				{
					sum += 28;
				}
			}



	}
	//?????
	sum += iday;

	j = sum % 7;

	switch (j)
	{
		 case 0:
			 System.out.print("Sun.\n");
			 break;
		 case 1:
			 System.out.print("Mon.\n");
			 break;

		 case 2:
			 System.out.print("Tue.\n");
			 break;
		 case 3:
			 System.out.print("Wed.\n");
			 break;
		 case 4:
			 System.out.print("Thu.\n");
			 break;
		 case 5:
			 System.out.print("Fri.\n");
			 break;
		 case 6:
			 System.out.print("Sat.\n");
			 break;
		 case 7:
			 System.out.print("Sun.\n");
			 break;

	}










	}
}

