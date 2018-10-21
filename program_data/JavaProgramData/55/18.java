package <missing>;

public class GlobalMembers
{
	public static int char_to_num(char c)
	{
		if ('0' <= c && c <= '9')
		{
			return c - '0';
		}
		if ('a' <= c && c <= 'z')
		{
			return 10 + (c - 'a');
		}
		if ('A' <= c && c <= 'Z')
		{
			return 10 + (c - 'A');
		}
	}

	public static char num_to_char(int n)
	{
		if (n < 10)
		{
			return n + '0';
		}
		else
		{
			return n - 10 + 'A';
		}
	}

	public static int Main()
	{
		int a;
		int b;
		int i;
		int length;
		String n = new String(new char[100]);
		int num;
		int pow;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		length = n.length();
		pow = 1;
		num = 0;
		// get the number
		for (i = length - 1; i >= 0; i--)
		{
			num = num + char_to_num(n.charAt(i)) * pow;
			pow = pow * a;
		}

		for (i = 0; i < 100; i++)
		{
			n = tangible.StringFunctions.changeCharacter(n, i, num_to_char(num % b));
			num = num / b;
			if (num == 0)
			{
				break;
			}
		}
		for (; i >= 0; i--)
		{
			System.out.printf("%c", n.charAt(i));
		}
		System.out.print("\n");

		return 0;
	}
}

