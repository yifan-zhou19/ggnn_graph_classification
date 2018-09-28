package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		int i = 0;
		int j = 0;
		int t = 0;
		int k = 0;
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		while (str1.charAt(i) != 0)
		{
			if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z')
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) + 32);
			}
			i++;
		}
		while (str2.charAt(j) != 0)
		{
			if (str2.charAt(j) >= 'A' && str2.charAt(j) <= 'Z')
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, j, str2.charAt(j) + 32);
			}
			j++;
		}
		while (t == 0 && str1.charAt(k) != 0 && str2.charAt(k) != 0)
		{
			t = str1.charAt(k) - str2.charAt(k);
		k++;
		}
		if (t != 0)
		{
			if (t > 0)
			{
			System.out.print(">");
			}
		else
		{
			System.out.print("<");
		}
		}
		else
		{
			System.out.print("=");
		}
		return 0;
	}
}

