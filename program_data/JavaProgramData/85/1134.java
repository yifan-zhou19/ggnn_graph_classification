package <missing>;

public class GlobalMembers
{
	public static int judgechar(char x)
	{
		if (x > 47 && x < 58)
		{
			return 0;
		}
		if (x > 64 && x < 91)
		{
			return 0;
		}
		if (x > 96 && x < 123)
		{
			return 0;
		}
		if (x > 96 && x < 123)
		{
			return 0;
		}
		if (x == 95)
		{
			return 0;
		}
		return 1;
	}
	public static int judgebegin(char x)
	{
		if (x > 64 && x < 91)
		{
			return 0;
		}
		if (x > 96 && x < 123)
		{
			return 0;
		}
		if (x > 96 && x < 123)
		{
			return 0;
		}
		if (x == 95)
		{
			return 0;
		}
		return 1;
	}
	public static int Main()
	{
		int all;
		int i;
		int p;
		int len;
		int ok;
		String input = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			all = Integer.parseInt(tempVar);
		}
		for (i = 0;i < all;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				input = tempVar2.charAt(0);
			}
			len = input.length();
			ok = 1;
			if (judgebegin(input.charAt(0)) != 0)
			{


				ok = 0;
			}
			for (p = 1;p < len;p++)
			{
				if (judgechar(input.charAt(p)) != 0)
				{
					ok = 0;
				}
			}
			if (ok == 0)
			{
				System.out.print("no\n");
			}
			if (ok == 1)
			{
				System.out.print("yes\n");
			}
		}

	return 0;
	}
}

