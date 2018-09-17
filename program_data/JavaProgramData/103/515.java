package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int sum;
		int p;
		int q;
		String a = new String(new char[1001]);
		String b = new String(new char[1001]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		sum = 0;
		n = a.length();
		for (i = 0; i < n - 1; i++)
		{
			if (a.charAt(i + 1) == a.charAt(i) || a.charAt(i + 1) - a.charAt(i) == 32 || a.charAt(i) - a.charAt(i + 1) == 32)
			{
				sum++;
			}
			else
			{
				if (a.charAt(i) > 'Z')
				{
					p = a.charAt(i) - '0';
					q = p - 32;
					b = tangible.StringFunctions.changeCharacter(b, i, q + '0');
					System.out.print("(");
					System.out.print(b.charAt(i));
					System.out.print(",");
					System.out.print(sum + 1);
					System.out.print(")");
				}
				else
				{
					System.out.print("(");
					System.out.print(a.charAt(i));
					System.out.print(",");
					System.out.print(sum + 1);
					System.out.print(")");
				}
				sum = 0;
			}
		}
		sum = 1;
		for (i = n - 1; i > 0; i--)
		{
			if (a.charAt(i) == a.charAt(i - 1) || a.charAt(i) - a.charAt(i - 1) == 32 || a.charAt(i - 1) - a.charAt(i) == 32)
			{
				sum++;
			}
			else
			{
				break;
			}
		}
		if (a.charAt(n - 1) > 'Z')
		{
			p = a.charAt(n - 1) - '0';
			q = p - 32;
			b = tangible.StringFunctions.changeCharacter(b, n - 1, q + '0');
			System.out.print("(");
			System.out.print(b.charAt(n - 1));
			System.out.print(",");
			System.out.print(sum);
			System.out.print(")");
		}
		else
		{
			System.out.print("(");
			System.out.print(a.charAt(n - 1));
			System.out.print(",");
			System.out.print(sum);
			System.out.print(")");
		}
		return 0;
	}
}

