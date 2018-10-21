package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String f = new String(new char[100000]);
	int t;
	int i;
	int j;
	int k;
	int a;
	char b;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		t = Integer.parseInt(tempVar);
	}
	f = new Scanner(System.in).nextLine();
	for (i = 0;i < t;i++)
	{
		b = '!';
		f = new Scanner(System.in).nextLine();
		for (j = 0;j < f.length();j++)
		{
			a = 0;
			for (k = 0;k < f.length();k++)
			{
				if (f.charAt(j) == f.charAt(k))
				{
					a++;
				}
			}
			if (a == 1)
			{
				b = f.charAt(j);
			break;
			}
			else
			{
				;
			}
		}
		if (b == '!')
		{
		System.out.print("no");
		}
		else
		{
		System.out.printf("%c\n",b);
		}
	}
		return 0;
	}
}

