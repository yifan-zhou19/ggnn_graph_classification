package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int a;
		int t = 0;
		int b = 0;
		String s = new String(new char[100]);
		String result = new String(new char[100]);
		s = new Scanner(System.in).nextLine();
		a = s.length();
		for (i = 0; i < 100; i++)
		{
			result = tangible.StringFunctions.changeCharacter(result, i, '\0');
		}
		for (i = 0; i < a; i++)
		{
			t = t * 10 + (s.charAt(i) - '0');
			result = tangible.StringFunctions.changeCharacter(result, i, t / 13 + '0');
			t = t % 13;
		}
		i = 0;
		for (i = 0; i < a; i++)
		{
			b = b + result.charAt(i) - '0';
		}
		if (b == 0)
		{
			System.out.print("0\n");
		}
		else
		{
			i = 0;
			while (i < a)
			{
				if (result.charAt(i) == '0')
				{
					i++;
				}
				else
				{
					break;
				}
			}
			for (; i < a; i++)
			{
				System.out.printf("%c", result.charAt(i));
			}
			System.out.print("\n");
		}
		System.out.printf("%d",t);
	}
}

