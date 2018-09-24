package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j;
		int reverse = int num;
		for (j = 1;j <= 6;j++)
		{


		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		int i;
		int count = 0;
		int len = a.length();
		if (a.charAt(0) == '-')
		{
			for (i = 1;i < len;i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(len - i));
			}
			System.out.print("-");
			b = tangible.StringFunctions.changeCharacter(b, len, '\0');
			for (i = 1;b.charAt(i) != '\0';i++)
			{
				if ((b.charAt(i) != '0') || (b.charAt(i) == '0' && count != 0))
				{
					System.out.printf("%c",b.charAt(i));
					count++;
				}
			}
			System.out.print("\n");
		}
		else
		{
			for (i = 0;i < len;i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(len - 1 - i));
			}
			b = tangible.StringFunctions.changeCharacter(b, len, '\0');
			for (i = 0;b.charAt(i) != '\0';i++)
			{
				if ((b.charAt(i) != '0') || (b.charAt(i) == '0' && count != 0))
				{
					System.out.printf("%c",b.charAt(i));
					count++;
				}
			}
			System.out.print("\n");
		}
		}
	}

}

