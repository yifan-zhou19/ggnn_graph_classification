package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		int i;
		int j;
		int s;
		int k;
		int y;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		for (i = 0;i < a.length();i++)
		{
				k = i;
				j = 0;
				while (a.charAt(k) == b.charAt(j) && j < b.length())
				{
					k++;
					j++;
				}
				if (j == b.length())
				{
										 y = 0;
					for (s = i;s < i + b.length();s++)
					{
						a = tangible.StringFunctions.changeCharacter(a, s, c.charAt(s - i));

					}
					y = 1;

				}
				if (y == 1)
				{
					break;
				}
		}

	System.out.printf("%s\n",a);
	return 0;
	}

}

