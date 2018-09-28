package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int c;
	int a;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	char[][] szpand = new char[n][20];
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		szpand[i] = tempVar2.charAt(0);
	}
	}
	int flag;
	for (i = 0;i < n;i++)
	{
		flag = 1;
		if (szpand[i][0] == '0' || szpand[i][0] == '1' || szpand[i][0] == '2' || szpand[i][0] == '3' || szpand[i][0] == '4' || szpand[i][0] == '5' || szpand[i][0] == '6' || szpand[i][0] == '7' || szpand[i][0] == '8' || szpand[i][0] == '9')
		{
		flag = 0;
		}
		for (c = 0;c < String.valueOf(szpand[i]).length();c++)
		{
			a = szpand[i][c];
			if (a >= 123 && a <= 127 || a >= 91 && a <= 94 || a == 96 || a >= 58 && a <= 64 || a <= 47)
			{
		flag = 0;
		break;
			}
		}
	if (flag == 0)
	{
	System.out.print("no\n");
	}
	else
	{
	System.out.print("yes\n");
	}
	}

	return 0;
	}

}

