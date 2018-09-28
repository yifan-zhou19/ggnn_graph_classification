package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int cnt = 0;
		int len1 = 1;
		int len2 = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String a = new String(new char[100]);
		a = tangible.StringFunctions.changeCharacter(a, 0, 49);
		for (i = 1; i < 100; i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, 48);
		}
		while (cnt < n)
		{
			for (i = len1 - 1; i >= 0; i--)
			{
				if ((a.charAt(i) - 48) * 2 >= 10)
				{
					a.charAt(i + 1) += 1;
					if (i == len1 - 1)
					{
					len2 += 1;
					}
				}
				a = tangible.StringFunctions.changeCharacter(a, i, ((a.charAt(i) - 48) * 2) % 10 + 48);
			}
			len1 = len2;
			cnt++;
		}
		for (i = len1 - 1; i >= 0;i--)
		{
			System.out.print(a.charAt(i));
		}
		return 0;
	}

}

