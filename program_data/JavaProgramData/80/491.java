int sum = new int(int,int,int);
int[] m1 = {0, 31, 30, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
int[] m2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
int main()
{
   int y1;
   int m1;
   int d1;
   int y2;
   int m2;
   int d2;
   int count;
   y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
   m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
   d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
   y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
   m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
   d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	count = sum(y2,m2,d2) - sum(y1,m1,d1);
	System.out.print(count);
	System.out.print("\n");
	return 0;
}
int sum(int year, int month,int day)
{
	int i;
	int daysum = 0;
	int flag = 0;
	for (i = 1;i < year;i++)
	{
		if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
		{
			daysum = daysum + 366;
		}
		else
		{
			daysum = daysum + 365;
		}
	}
	if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
	{
		flag = 1;
	}
	for (i = 1;i < month;i++)
	{
		if (flag == 0)
		{
			daysum = daysum + m1[i];
		}
		else
		{
			daysum = daysum + m2[i];
		}
	}
	daysum = daysum + day;
	return daysum;

}

