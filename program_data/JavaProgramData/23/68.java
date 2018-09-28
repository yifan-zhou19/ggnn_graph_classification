package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] s = new char[100][50];
	int i;
	int a;
	for (i = 0;i < 50;i++)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s[i] = tempVar.charAt(0);
		}
	if (s[i][0] > 122 || s[i][0] < 65)
	{
		break;
	}
	}
	a = i - 1;
	for (i = a;i >= 1;i--)
	{
		System.out.printf("%s ",s[i]);
	}
	System.out.printf("%s",s[0]);
	}



}

