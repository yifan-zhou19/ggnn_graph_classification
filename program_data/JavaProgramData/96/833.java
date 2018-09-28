package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String dzs = new String(new char[100]);
		String xdzs = new String(new char[100]);
		dzs = new Scanner(System.in).nextLine();
		int N;
		N = dzs.length();
		if (N == 1)
		{
			System.out.printf("0\n%c",dzs.charAt(0));
		}
		else
		{
		int n;
		int i;
		n = (dzs.charAt(0) - '0') * 10 + (dzs.charAt(1) - '0');
		int a;
		int b;
		a = n / 13;
		b = n % 13;
		if (N == 2 && n < 13)
		{
			System.out.printf("0\n%d",n);
		}
		else
		{
		if (a == 0)
		{
			xdzs = tangible.StringFunctions.changeCharacter(xdzs, 0, ' ');
		}
		else if (a != 0)
		{
			xdzs = tangible.StringFunctions.changeCharacter(xdzs, 0, '0' + a);
		}

		for (i = 2;i < N;i++)
		{
			n = b * 10 + (dzs.charAt(i) - '0');
			a = n / 13;
			b = n % 13;
			xdzs = tangible.StringFunctions.changeCharacter(xdzs, i - 1, '0' + a);
		}
		for (i = 0;i < N - 2;i++)
		{
			if (xdzs.charAt(i) != ' ')
			{
				System.out.printf("%c",xdzs.charAt(i));
			}
		}
		System.out.printf("%c\n",xdzs.charAt(N - 2));
		System.out.printf("%d", b);
		}
		}
		return 0;
	}
}

