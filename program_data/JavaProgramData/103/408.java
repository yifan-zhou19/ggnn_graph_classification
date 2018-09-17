package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i = 0;
		while (a.charAt(i) != '\0')
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
			i++;
		}
		i = 1;
		int times = 1;
		while (a.charAt(i) != '\0')
		{
			if (a.charAt(i) == a.charAt(i - 1))
			{
			times++;
			}
			else
			{
				System.out.print('(');
				System.out.print(a.charAt(i - 1));
				System.out.print(',');
				System.out.print(times);
				System.out.print(')');
				times = 1;
			}
			i++;
		}
		System.out.print('(');
		System.out.print(a.charAt(i - 1));
		System.out.print(',');
		System.out.print(times);
		System.out.print(')');
		return 0;
	}
}

