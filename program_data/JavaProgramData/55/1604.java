package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		long n = 0;
		long a;
		long a0;
		long b;
		int i = 0;
		int j;
		char change1 = char;
		char change2 = char;
		String str = new String(new char[1000]);
		String put = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a0 = Long.parseLong(tempVar);
		}
		do
		{
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, tempVar2);
			}
			if (str.charAt(i) > 96)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 32);
			}
			i = i + 1;
		} while (str.charAt(i - 1) != ' ');
		i = i - 1;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Long.parseLong(tempVar3);
		}
		a = 1;
		for (j = i - 1;j >= 0;j--)
		{
			n = n + a * change1(str.charAt(j));
			a = a * a0;
		}
		j = 0;
		while (n != 0)
		{
			put = tangible.StringFunctions.changeCharacter(put, j, change2((char)(n % b)));
			n = n / b;
			j = j + 1;
		}
		if (j > 0)
		{
			for (i = j - 1;i >= 0;i--)
			{
			System.out.printf("%c",put.charAt(i));
			}
		}
		if (j == 0)
		{
		System.out.print("0");
		}
		return 0;
	}
	public static char change1(char m)
	{
		if (m <= '9' && m >= '0')
		{
			m = m - '0';
		}
		if (m > '9')
		{
			m = m - 'A' + 10;
		}
		return (m);
	}
	public static char change2(char m)
	{
		if (m >= 10)
		{
			m = m - 10 + 'A';
		}
		if (m < 10)
		{
			m = m + '0';
		}
		return (m);
	}
}

