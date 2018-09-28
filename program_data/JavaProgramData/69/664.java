package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[299]);
		String str2 = new String(new char[388]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		String sum = new String(new char[289]);
		int i = str1.length() - 1;
		int j = str2.length() - 1;
		int k = 0;
		for (;i >= 0 && j >= 0;i--, j--, k++)
		{
			sum = tangible.StringFunctions.changeCharacter(sum, k, str1.charAt(i) - '0' + str2.charAt(j));
		}
		if (str1.length() > str2.length())
		{
			for (;i >= 0;i--)
			{
				sum = tangible.StringFunctions.changeCharacter(sum, k, str1.charAt(i));
				k++;
			}
		}
		else
		{
			for (;j >= 0;j--)
			{
				sum = tangible.StringFunctions.changeCharacter(sum, k, str2.charAt(j));
				k++;
			}
		}
		for (int m = 0;m < k - 1;m++)
		{
			if (sum.charAt(m) > '9')
			{
				sum = tangible.StringFunctions.changeCharacter(sum, m, (char)(sum.charAt(m) - 10));
				sum = tangible.StringFunctions.changeCharacter(sum, m + 1, (char)(sum.charAt(m + 1) + 1));
			}
		}

		if (sum.charAt(k - 1) > '9')
		{
			sum = tangible.StringFunctions.changeCharacter(sum, k, '1');
			sum.charAt(k - 1) -= 10;
			int p = k;
			while (sum.charAt(p) == '0' && p > 0)
			{
				p--;
			}
			for (;p >= 0;p--)
			{
				System.out.print(sum.charAt(p));
			}
			System.out.print("\n");
		}
		else
		{
			int p = k - 1;
			while (sum.charAt(p) == '0' && p > 0)
			{
				p--;
			}
			for (;p >= 0;p--)
			{
				System.out.print(sum.charAt(p));
			}
			System.out.print("\n");
		}

		return 0;



	}
}

