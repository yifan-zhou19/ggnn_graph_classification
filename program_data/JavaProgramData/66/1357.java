package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int day;
	int mn;
	int yr;
	int i;
	int days = 0;
	int s;
	int k;
	int[] mont = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	char[][] wek =
	{
		{'S', 'u', 'n', '\0', '\0', '\0', '\0', '\0', '\0'},
		{'M', 'o', 'n', '\0', '\0', '\0', '\0', '\0', '\0'},
		{'T', 'u', 'e', '\0', '\0', '\0', '\0', '\0', '\0'},
		{'W', 'e', 'd', '\0', '\0', '\0', '\0', '\0', '\0'},
		{'T', 'h', 'u', '\0', '\0', '\0', '\0', '\0', '\0'},
		{'F', 'r', 'i', '\0', '\0', '\0', '\0', '\0', '\0'},
		{'S', 'a', 't', '\0', '\0', '\0', '\0', '\0', '\0'}
	};
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		yr = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		mn = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		day = Integer.parseInt(tempVar3);
	}
	if (yr % 4 == 0 || yr % 100 == 0 || yr % 400 == 0)
	{
	mont[2] = 29;
	}
	else
	{
	mont[2] = 28;
	}
	for (i = 0;i < mn;i++)
	{
	days += mont[i];
	}
	days += day;
	s = yr - 1 + (int)((yr - 1) / 4) - (int)((yr - 1) / 100) + (int)((yr - 1) / 400) + days;
	k = s % 7;
	System.out.printf("%s.\0",wek[k]);
	   return 0;
	}

}

