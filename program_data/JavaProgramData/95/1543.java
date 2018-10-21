package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char change = char c;
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		int k1;
		int k2;
		int k;
		int i;
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		k1 = str1.length();
		k2 = str2.length();
		k = (k1 < k2)?k1:k2;
		for (i = 0;i < k1;i++)
		{
			str1 = tangible.StringFunctions.changeCharacter(str1, i, change(str1.charAt(i)));
		}
		for (i = 0;i < k2;i++)
		{
			str2 = tangible.StringFunctions.changeCharacter(str2, i, change(str2.charAt(i)));
		}
		i = 0;
		while (i < k)
		{
			if (str1.charAt(i) == str2.charAt(i))
			{
				i++;
			}
			else
			{
				if (str1.charAt(i) > str2.charAt(i))
				{
					System.out.print(">\n");
				}
				else
				{
					System.out.print("<\n");
				}
				break;
			}
		}
		if ((i == k) && (k1 == k) && (k1 != k2))
		{
			System.out.print("<\n");
		}
		if ((i == k) && (k2 == k) && (k1 != k2))
		{
			System.out.print(">\n");
		}
		if ((i == k) && (k1 == k2))
		{
			System.out.print("=\n");
		}
		return 0;
	}
	public static char change(char c)
	{
		if ((c >= 'A') && (c <= 'Z'))
		{
			c = c + 'a'-'A';
		}
		return (c);
	}



}

