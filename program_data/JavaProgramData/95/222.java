package <missing>;

public class GlobalMembers
{
	public static int min(int x,int y)
	{
		if (x > y)
		{
			return y;
		}
		else
		{
			return x;
		}
	}

	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		int x;
		int y;
		int i;
		int z;
		a = new Scanner(System.in).nextLine();
		x = a.length();
		b = new Scanner(System.in).nextLine();
		y = b.length();
		z = min(x, y);
		for (i = 0;i < x;i++)
		{
			if ((a.charAt(i) >= 'a') && (a.charAt(i) <= 'z'))
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
			if ((b.charAt(i) >= 'a') && (b.charAt(i) <= 'z'))
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32);
			}
		}
		for (i = 0;i < x;i++)
		{
			if ((a.charAt(i) > b.charAt(i)) && (a.charAt(i) - b.charAt(i) != 32))
			{
				System.out.print(">");
				break;
			}
			else if ((a.charAt(i) < b.charAt(i)) && (b.charAt(i) - a.charAt(i) != 32))
			{
				System.out.print("<");
				break;
			}
			if (i == x - 1)
			{
				System.out.print("=");
			}
		}
		return 0;
	}


}

