package <missing>;

public class GlobalMembers
{
	public static int ismin(char x)
	{
		if (x == 'a' || x == 'b' || x == 'c' || x == 'd' || x == 'e' || x == 'f' || x == 'g' || x == 'h' || x == 'i' || x == 'j' || x == 'k' || x == 'l' || x == 'm' || x == 'n' || x == 'o' || x == 'p' || x == 'q' || x == 'r' || x == 's' || x == 't' || x == 'u' || x == 'v' || x == 'w' || x == 'x' || x == 'y' || x == 'z')
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int ismax(char x)
	{
		if (x == 'A' || x == 'B' || x == 'C' || x == 'D' || x == 'E' || x == 'F' || x == 'G' || x == 'H' || x == 'I' || x == 'J' || x == 'K' || x == 'L' || x == 'M' || x == 'N' || x == 'O' || x == 'P' || x == 'Q' || x == 'R' || x == 'S' || x == 'T' || x == 'U' || x == 'V' || x == 'W' || x == 'X' || x == 'Y' || x == 'Z')
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int isalpha(char x)
	{
		if (ismin(x) != 0 || ismax(x) != 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int isalnum(char x)
	{
		if (x == '1' || x == '2' || x == '3' || x == '4' || x == '5' || x == '6' || x == '7' || x == '8' || x == '9' || x == '0' || isalpha(x) != 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int istrue(String buf)
	{
		int i = 1;
		if (isalpha(buf[0]) != 0 || buf[0].equals('_'))
		{
			while (!buf[i].equals('\0'))
			{
				if (isalnum(buf[i]) != 0 || buf[i].equals('_'))
				{
					i++;
					continue;
				}
				else
				{
					return 0;
				}
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		String buf = new String(new char[30]);
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				buf = tempVar2.charAt(0);
			}
			if (istrue(buf) == 1)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

