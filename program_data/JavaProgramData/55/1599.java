package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int len;
		int N = 0;
		int b;
		int[] o = new int[100];
		String n = new String(new char[100]);
		String p = new String(new char[100]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a < 2 || b >= 36)
		{
			System.out.print("...");
			return 0;
		}
		len = n.length();
		for (i = 0;i < len;i++)
		{
			if (n.charAt(i) >= '0' && n.charAt(i) <= '9')
			{
				if (n.charAt(i) < a + '0')
				{
					N = N * a + n.charAt(i) - '0';
				}
				else
				{
					System.out.print("...");
					return 0;
				}
			}
			else
			{
				if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
				{
					if (n.charAt(i) < a + 'a' - 10)
					{
						N = N * a + n.charAt(i) - 'a' + 10;
					}
					else
					{
						System.out.print("...");
						return 0;
					}
				}
				else
				{
					if (n.charAt(i) < a + 'A' - 10)
					{
						N = N * a + n.charAt(i) - 'A' + 10;
					}
					else
					{
						System.out.print("...");
						return 0;
					}
				}

			}
		}
		i = 0;
		if (N == 0)
		{
			System.out.print("0");
			return 0;
		}
		while (N > 0)
		{
			o[i] = N % b;
			if (o[i] >= 10)
			{
				p = tangible.StringFunctions.changeCharacter(p, i, 'A' + o[i] - 10);
			}
			else
			{
				p = tangible.StringFunctions.changeCharacter(p, i, o[i] + '0');
			}
			i++;
			N = N / b;
		}
		i--;
		for (;i >= 0;i--)
		{
			System.out.print(p.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}

}

