package <missing>;

public class GlobalMembers
{
	//*************************************
	//* ????4.cpp *
	//* ??????1200012844 *
	//* ?????2012?10?23? *
	//* ???????? *
	//**************************************

	public static int Main()
	{
		int year;
		int month1;
		int month2;
		int month;
		int leap;
		int days;
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0; k < n; k++)
		{
			days = 0; //???????0
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			leap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0; //???????
			if (month1 < month2)
			{
				month = month1;
			}
			else
			{
					month = month2;
				month2 = month1;
			} //????????????
			while (month < month2)
			{
				switch (month)
				{
					case 2 :
						days += 28 + leap;
						break; //2???????1
					case 1 :
					case 3 :
					case 5 :
					case 7 :
					case 8 :
					case 10 :
					case 12 :
						days += 31;
						break;
					case 4 :
					case 6 :
					case 9 :
					case 11 :
						days += 30;
						break;
				}
				month++;
			} //???????????
			if (days % 7 == 0)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
		}
		return 0;
	}


}

