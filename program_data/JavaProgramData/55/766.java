package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String n = " ";
		double a = 0.0;
		int b = 0;
		int N = 0;
		int i = 0;
		int j = 0;
		int p = 0;
		int sum = 0;

		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		N = n.length();
		for (i = 0;i < N;i++)
		{
			if ('A' <= n.charAt(i) && n.charAt(i) <= 'Z')
			{
				n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - 55);
			}
			else if ('a' <= n.charAt(i) && n.charAt(i) <= 'z')
			{
				n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - 87);
			}
			else if ('0' <= n.charAt(i) && n.charAt(i) <= '9')
			{
				n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - 48);
			}
		}
		for (i = 0;i < N;i++)
		{
			sum = sum + n.charAt(i) * Math.pow(a,N - i - 1);
		}
		if (sum > 0)
		{
			for (i = 0;sum > 0;i++)
			{
				n = tangible.StringFunctions.changeCharacter(n, i, sum % b);
				sum = (sum - n.charAt(i)) / b;
			}
			for (j = 0;j <= i / 2;j++)
			{
				p = n.charAt(j);
				n = tangible.StringFunctions.changeCharacter(n, j, n.charAt(i - j));
				n = tangible.StringFunctions.changeCharacter(n, i - j, p);
			}
			for (j = 0;j <= i;j++)
			{
				if (0 <= n.charAt(j) && n.charAt(j) <= 9)
				{
					n = tangible.StringFunctions.changeCharacter(n, j, n.charAt(j) + 48);
				}
				else if (n.charAt(j) > 9)
				{
					n = tangible.StringFunctions.changeCharacter(n, j, n.charAt(j) + 55);
				}
			}
			for (j = 1;j <= i;j++)
			{
				System.out.print(n.charAt(j));
			}
		}
		else if (sum == 0)
		{
			System.out.print("0");
			System.out.print("\n");
		}
		return 0;
	}

}

