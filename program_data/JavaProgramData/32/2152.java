package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[102]);
		String s2 = new String(new char[100]);
		int a;
		int b;
		int i;
		int j;
		int n;
		int d;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s1 = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
			s1 = new Scanner(System.in).nextLine();
			s2 = new Scanner(System.in).nextLine();
			a = s1.length();
			b = s2.length();
			d = 0;
			for (j = b - 1;j >= 0;j--)
			{
				d = s1.charAt(j - b + a) - s2.charAt(j) + d;
				if (d >= 0)
				{
					s1 = tangible.StringFunctions.changeCharacter(s1, j - b + a, d + '0');
					d = 0;
				}
				else
				{
					s1 = tangible.StringFunctions.changeCharacter(s1, j - b + a, d + '0' + 10);
					d = -1;
				}

			}
			while (d == -1 && j - b + a >= 0)
			{
				d = s1.charAt(j - b + a) - 1 - '0';
				if (d >= 0)
				{
					s1 = tangible.StringFunctions.changeCharacter(s1, j - b + a, d + '0');
					break;
				}
				else
				{
					s1 = tangible.StringFunctions.changeCharacter(s1, j - b + a, '9');
					d = -1;
				}
				j--;
			}
			j = 0;
			while (s1.charAt(j) == '0')
			{
				j++;
			}
			while (j < a)
			{
				System.out.print(s1.charAt(j));
				j++;
			}
			System.out.print("\n");
			s1 = new Scanner(System.in).nextLine();
		}
	}

}

