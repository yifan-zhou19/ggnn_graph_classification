package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int day;
		int month;
		int year;
		int i;
		int sum = 0;
		int n;
		int m;
		int[] tianshu = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		char[][] week =
		{
			{'S', 'u', 'n', '.', '\0', '\0'},
			{'M', 'o', 'n', '.', '\0', '\0'},
			{'T', 'u', 'e', '.', '\0', '\0'},
			{'W', 'e', 'd', '.', '\0', '\0'},
			{'T', 'h', 'u', '.', '\0', '\0'},
			{'F', 'r', 'i', '.', '\0', '\0'},
			{'S', 'a', 't', '.', '\0', '\0'}
		};
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
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		{
			tianshu[2] = 29;
		}
		else
		{
			tianshu[2] = 28;
		}
		for (i = 0;i < month;i++)
		{
			sum += tianshu[i];
		}
		sum += day;
		n = year - 1 + (int)((year - 1) / 4) - (int)((year - 1) / 100) + (int)((year - 1) / 400) + sum;
		m = n % 7;
		System.out.printf("%s\n",week[m]);
		return 0;
	}
}

