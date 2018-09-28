package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String origin = new String(new char[101]);
		origin = new Scanner(System.in).nextLine();
		String result = new String(new char[100]);
		int i;
		int a;
		int b;
		a = origin.length();
		if (a < 2)
		{
			result = tangible.StringFunctions.changeCharacter(result, 0, '0');
			result = tangible.StringFunctions.changeCharacter(result, 1, '\0');
			b = (origin.charAt(0) - '0') % 13;
			System.out.println(result);
			System.out.printf("%d", b);
		}
		else if (((a == 2) && ((origin.charAt(0) - '0') * 10 + (origin.charAt(1) - '0')) < 13))
		{
			result = tangible.StringFunctions.changeCharacter(result, 0, '0');
			result = tangible.StringFunctions.changeCharacter(result, 1, '\0');
			b = ((origin.charAt(0) - '0') * 10 + (origin.charAt(1) - '0')) % 13;
			System.out.println(result);
			System.out.printf("%d", b);

		}
		else
		{

		b = ((origin.charAt(0) - '0') * 10 + (origin.charAt(1) - '0')) % 13;
		int m;
		if ((origin.charAt(0) - '0') * 10 + (origin.charAt(1) - '0') >= 13)
		{
		   m = ((origin.charAt(0) - '0') * 10 + (origin.charAt(1) - '0')) / 13;
		   result = tangible.StringFunctions.changeCharacter(result, 0, m + '0');
		   for (i = 2;i < a;i++)
		   {
			m = (b * 10 + (origin.charAt(i) - '0')) / 13;
			result = tangible.StringFunctions.changeCharacter(result, i - 1, m + '0');
			b = (b * 10 + (origin.charAt(i) - '0')) % 13;
		   }
		result = tangible.StringFunctions.changeCharacter(result, i - 1, '\0');
		System.out.println(result);
		System.out.printf("%d", b);
		}
		else
		{
			for (i = 2;i < a;i++)
			{
			m = (b * 10 + (origin.charAt(i) - '0')) / 13;
			result = tangible.StringFunctions.changeCharacter(result, i - 2, m + '0');
			b = (b * 10 + (origin.charAt(i) - '0')) % 13;
			}
		result = tangible.StringFunctions.changeCharacter(result, i - 2, '\0');
		System.out.println(result);
		System.out.printf("%d", b);
		}
		}

		return 0;
	}

}

