package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int i;
		int j;
		int flag;
		int mark;
		j = 6;
		while (j-- != 0)
		{
		flag = 0;
		mark = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}

		if (!strcmp(a,"0"))
		{
			System.out.printf("%s\n",a);
			return 0;
		}
		if (a.charAt(0) == '-')
		{
			System.out.print("-");
			flag++;
		}
		for (i = a.length() - 1;i >= flag;i--)
		{
			if (a.charAt(i) != '0' || mark == 1)
			{
				System.out.printf("%c",a.charAt(i));
				mark = 1;
			}
		}
	System.out.print("\n");
		}
	}
}

