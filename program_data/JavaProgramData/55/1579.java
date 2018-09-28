package <missing>;

public class GlobalMembers
{
	public static String CHR = new String(new char[120]);
	public static int p1;
	public static int p2;
	public static int p3;
	public static int num;

	public static int deal(char Q)
	{
		if ((Q >= '0') && (Q <= '9'))
		{
			return Q - '0';
		}
		if ((Q >= 'A') && (Q <= 'Z'))
		{
			return Q - 'A' + 10;
		}
		return -1;
	}
	public static char laed(int Q)
	{
		if ((Q >= 0) && (Q <= 9))
		{
			return '0' + Q;
		}
		if (Q > 9)
		{
			return 'A' + Q - 10;
		}
	}
	public static void output(int ans)
	{
		if (ans == 0)
		{
			return;
		}
		else
		{
			output(ans / p3);
			System.out.print(laed(ans % p3));
		}
	}
	public static int Main()
	{
		p1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		p2 = 0;
		num = 0;
		while ((CHR[p2] = System.in.read()) != ' ')
		{
			if ((CHR.charAt(p2) >= 'a') && (CHR.charAt(p2) <= 'z'))
			{
				CHR = tangible.StringFunctions.changeCharacter(CHR, p2, CHR.charAt(p2) - 'a'+'A');
			}
			num = num * p1 + deal(CHR.charAt(p2));
			p2++;
		}
		p3 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (num == 0)
		{
			System.out.print(0);
		}
		else
		{
			output(num);
		}
		System.out.print("\n");
		return 0;
	}


}

