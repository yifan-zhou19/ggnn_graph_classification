package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int sum;
		String a = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
			}
		}

		for (i = 0;a.charAt(i) != '\0';i++)
		{
			sum = 0;
			for (m = i;a.charAt(m) == a.charAt(i);m++)
			{
				sum++;
			}
			i = m - 1;
			System.out.printf("(%c,%d)",a.charAt(i),sum);
		}
	}
}

