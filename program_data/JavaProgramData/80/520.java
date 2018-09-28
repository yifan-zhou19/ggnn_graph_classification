int func = new int(int,int,int);
int main()
{
 int startYear;
 int startMonth;
 int startDay;
 int endYear;
 int endMonth;
 int endDay;
 startYear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
 startMonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
 startDay = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
 endYear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
 endMonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
 endDay = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
 System.out.print(func(endYear,endMonth,endDay) - func(startYear,startMonth,startDay));
 return 0;
}
int func(int year,int month,int day)
{
 int sum = 0;
 int i;
 int[] mping = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
 int[] mrun = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
 for (i = 1;i < year;i++)
 {
  if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
  {
   sum += 366;
  }
  else
  {
   sum += 365;
  }
 }
 if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
 {
  for (i = 0;i < month - 1;i++)
  {
   sum += mrun[i];
  }
 }
 else
 {
  for (i = 0;i < month - 1;i++)
  {
   sum += mping[i];
  }
 }
 sum += day;
 return sum;
}

