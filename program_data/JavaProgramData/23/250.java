package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[100]);
		String str2 = new String(new char[100]);
		int i;
		int j;
		int a;
		char c;
		str = new Scanner(System.in).nextLine();
		for (j = 0;j < 100 && ((c = str.charAt(j)) != '\0');j++)
		{
		}
		j--;
		for (i = j;i >= 0;i--)
		{
			if (str.charAt(i) == ' ')
			{
				for (a = 0;a < j - i;a++)
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, a, str.charAt(i + 1 + a));
					System.out.printf("%c",str2.charAt(a));
				}
				System.out.print(" ");
				j = i - 1;
				i = j;
			}
			if (i == 0)
			{
				for (a = 0;a <= j;a++)
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, a, str.charAt(a));
					System.out.printf("%c",str2.charAt(a));
				}
			}
		}
		System.out.print("\n");
	}
}

