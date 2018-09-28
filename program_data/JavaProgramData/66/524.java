package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int isrunnian(int year);
	public static int dijitian(int year, int month, int day)
	{
		int t = 0;
		int i;
		for (i = 1;i < month;i++)
		{
			if ((i == 1) || (i == 3) || (i == 5) || (i == 7) || (i == 8) || (i == 10) || (i == 12))
			{
				t += 31 % 7;
			}
				else if ((i == 4) || (i == 6) || (i == 9) || (i == 11))
				{
				t += 30 % 7;
				}
				else if (i == 2)
				{
					  if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
					  {
						 t += 29 % 7;
					  }
						 else
						 {
						 t += 28 % 7;
						 }
				}
		}
		t += day;
			return t;
	}
	public static int Main()
	{
	int year;
	int month;
	int day;
	int a;
	int i;
	int r;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		year = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		month = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		day = Integer.parseInt(tempVar3);
	}
	System.in.read();
	a = dijitian(year, month, day);
	r = (year - 2 + (year - 1) / 400 + (year - 1) / 4 - (year - 1) / 100 + a) % 7;
	if (r == 0)
	{
			   System.out.print("Mon.");
			   System.in.read();
	}
			   else if (r == 1)
			   {
			   System.out.print("Tue.");
			   System.in.read();
			   }
			   else if (r == 2)
			   {
			   System.out.print("Wed.");
			   System.in.read();
			   }
			   else if (r == 3)
			   {
			   System.out.print("Thu.");
			   System.in.read();
			   }
			   else if (r == 4)
			   {
			   System.out.print("Fri.");
			   System.in.read();
			   }
			   else if (r == 5)
			   {
			   System.out.print("Sat.");
			   System.in.read();
			   }
			   else if (r == 6)
			   {
			   System.out.print("Sun.");
			   System.in.read();
			   }
	return 0;
	}
}

