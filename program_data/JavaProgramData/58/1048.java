package <missing>;

public class GlobalMembers
{
	public static int number(char a)
	{
		int c;
		c = a - '0';
		if (c >= 0 && c <= 9)
		{
		return 1;
		}
		else
		{
		return 0;
		}
	}
	public static int line(char a)
	{
		int c;
		c = a - '_';
		if (c == 0)
		{
		return 1;
		}
		else
		{
		return 0;
		}
	}
	public static int small(char a)
	{
		int c;
		c = a - 'a';
		if (c >= 0 && c <= 25)
		{
		return 1;
		}
		else
		{
		return 0;
		}
	}
	public static int big(char a)
	{
		int c;
		c = a - 'A';
		if (c >= 0 && c <= 25)
		{
		return 1;
		}
		else
		{
		return 0;
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int c;
		String a = new String(new char[81]);
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			a = tangible.StringFunctions.changeCharacter(a, 0, tempVar2);
		}
		for (i = 1;i <= n;i++)
		{
			b[i - 1] = 1;
			for (j = 1;j <= 81;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead(null, 1);
				if (tempVar3 != null)
				{
					a = tangible.StringFunctions.changeCharacter(a, j - 1, tempVar3);
				}
				c = a.charAt(j - 1) - '\n';
				if (c == 0)
				{
				break;
				}
				c = line(a.charAt(j - 1)) + number(a.charAt(j - 1)) + big(a.charAt(j - 1)) + small(a.charAt(j - 1));
				if (c == 0)
				{
					b[i - 1] = 0;
				}
			}
			if (number(a.charAt(0)) == 1)
			{
			b[i - 1] = 0;
			}
		}
		for (i = 1;i <= n;i++)
		{
		System.out.printf("%d\n",b[i - 1]);
		}
		return 0;
	}
}

