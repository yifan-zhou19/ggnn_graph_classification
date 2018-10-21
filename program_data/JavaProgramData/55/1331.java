package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String u = new String(new char[100]);
		int a;
		int b;
		int l;
		int k = 0;
		int i;
		int j;
		int r;
		int l1;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		l = s.length();
		int sum = 1;
		for (i = 0,j = l - 1;j >= 0;i++,j--)
		{
			if (s.charAt(j) >= 65)
			{
				if (s.charAt(j) >= 97)
				{
					k = k + (s.charAt(j) - 87) * sum;
				}
				else
				{
					k = k + (s.charAt(j) - 55) * sum;
				}
			}
			else
			{
			k = k + (s.charAt(j) - 48) * sum;
			}
			sum = sum * a;
		}
		if (k == 0)
		{
			System.out.print("0");
			System.out.print("\n");
		}
		else
		{
		for (j = 0;k != 0;j++)
		{
			r = k % b;
			if (r >= 10)
			{
				u = tangible.StringFunctions.changeCharacter(u, j, r - 10 + 'A');
			}
			else
			{
				u = tangible.StringFunctions.changeCharacter(u, j, r + '0');
			}
			k = k / b;
		}
		u = tangible.StringFunctions.changeCharacter(u, j, '\0');
		l1 = u.length();
		for (j = l1 - 1;j >= 0;j--)
		{
			System.out.print(u.charAt(j));
		}
		System.out.print("\n");
		}
		return 0;
	}






}

