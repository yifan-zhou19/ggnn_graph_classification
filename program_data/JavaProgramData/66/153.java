package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] months =
		{
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		String[] m = {"Sun.", "Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat."};
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int year,month,day,i,l,sum=0;
		int year;
		int month;
		int day;
		int i;
		int l;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		sum = sum + year - 1 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
		{
			for (i = 0;i < month - 1;i++)
			{
				sum = sum + months[1][i];
			}
		}
		else
		{
			for (i = 0;i < month - 1;i++)
			{
				sum = sum + months[0][i];
			}
		}
		sum = sum + day;
		l = sum % 7;
		for (i = 0;i < 4;i++)
		{
			System.out.printf("%c",m[l][i]);
		}
		return 0;
	}
}

