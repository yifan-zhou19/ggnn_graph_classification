package <missing>;

public class GlobalMembers
{
	public static int runnian(int year)
	{
		int result = 0;
	if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))
	{
	result = 1;
	}
	return result;
	}
	public static int Main()
	{
		int i;
		int answer = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct tian
	//	{
	//	int year,month,day;
	//}
	//a;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a.year = tempVar;
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		a.month = tempVar2;
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		a.day = tempVar3;
	}
	for (i = 1;i < ((a.year - 1) % 400) + 1;i++)
	{
	answer += 1;
	if (runnian(i) != 0)
	{
		answer += 1;
	}
	}
	for (i = 1;i < a.month;i++)
	{
	if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
	{
	answer += 3;
	}
	else if (i == 2 && runnian(a.year) != 0)
	{
	answer += 1;
	}
	else if (i == 4 || i == 6 || i == 9 || i == 11)
	{
	answer += 2;
	}
	}
	answer += a.day;

	if (answer % 7 == 1)
	{
	System.out.print("Mon.");
	}
	if (answer % 7 == 2)
	{
	System.out.print("Tue.");
	}
	if (answer % 7 == 3)
	{
	System.out.print("Wed.");
	}
	if (answer % 7 == 4)
	{
	System.out.print("Thu.");
	}
	if (answer % 7 == 5)
	{
	System.out.print("Fri.");
	}
	if (answer % 7 == 6)
	{
	System.out.print("Sat.");
	}
	if (answer % 7 == 0)
	{
	System.out.print("Sun.");
	}
	return 0;
	}

}

