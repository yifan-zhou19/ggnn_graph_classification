package <missing>;

public class GlobalMembers
{
	public static void judge(String s)
	{
		int i;
		int temp = -1;
		if ((s[0].compareTo('a') >= 0 && s[0].compareTo('z') <= 0) || (s[0].equals('_')) || (s[0].compareTo('A') >= 0 && s[0].compareTo('Z') <= 0))
		{
			for (i = 1;i < 20;i++)
			{
				if (s[i].equals('\0'))
				{
					break;
				}
				else if ((s[i].compareTo('a') >= 0 && s[i].compareTo('z') <= 0) || (s[i].equals('_')) || (s[i].compareTo('A') >= 0 && s[i].compareTo('Z') <= 0) || (s[i].compareTo('0') >= 0 && s[i].compareTo('9') <= 0))
				{
					temp = 1;
				}
				else
				{
					temp = -1;
					break;
				}
			}
		}
		else
		{
			temp = -1;
		}
		if (temp == 1)
		{
			System.out.print("yes\n");
		}
		else
		{
			System.out.print("no\n");
		}
	}
	public static void Main()
	{
		char[][] st = new char[100][20];
		char n;
		char i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = tempVar.charAt(0);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				st[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			judge(st[i]);
		}
	}

}

