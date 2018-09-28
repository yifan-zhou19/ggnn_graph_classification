package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a = 0;
		int b = 0;
		int i;
		int e = 0;
		String c = new String(new char[33]);
		int f = char x;
		char g = int x;
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   a = Integer.parseInt(tempVar);
		   }
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   c = tempVar2.charAt(0);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   b = Integer.parseInt(tempVar3);
		   }
			for (i = 0;c.charAt(i) != 0;i++)
			{
				e = a * e + f(c.charAt(i));
			}
			if (e == 0)
			{
				System.out.print("0");
			}
			for (i = 32;e > 0;i--)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, g(e % b));
				e = e / b;
			}
			for (++i;i <= 32;i++)
			{
				System.out.printf("%c",c.charAt(i));
			}
			System.out.print("\n");
	}
	public static int f(char x)
	{
		if ('0' <= x && x <= '9')
		{
			return (x - '0');
		}
		else if ('A' <= x && x <= 'Z')
		{
			return (x - 'A' + 10);
		}
			else
			{
				return (x - 'a' + 10);
			}
	}
	public static char g(int x)
	{
		if (0 <= x != 0 && x <= 9)
		{
			return (x + '0');
		}
			else
			{
				return (x + 'A' - 10);
			}
	}

}

