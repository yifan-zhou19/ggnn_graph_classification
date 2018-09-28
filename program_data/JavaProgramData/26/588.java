package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		char c;
		int i = 0;
		int j = 0;
		int k = 0;
		str1 = new Scanner(System.in).nextLine();
		while ((c = str1.charAt(i)) != '\0')
		{
			i++;
		}
		do
		{
			str2 = tangible.StringFunctions.changeCharacter(str2, j++, str1.charAt(k++));
			while ((str1.charAt(k - 1) == ' ') && (str1.charAt(k) == ' '))
			{
				k++;
			}
		} while (k < i);
		for (i = 0;i < j;i++)
		{
			System.out.printf("%c",str2.charAt(i));
		}
		return 0;
	}
}

