package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String suoyou = new String(new char[200]);
		suoyou = new Scanner(System.in).nextLine();
		int i;
		int n;
		int a;
		int l = 0;
		n = suoyou.length();
		for (i = 1;i < n;i++)
		{
			if (suoyou.charAt(i - 1) == ' ')
			{
				if (suoyou.charAt(i) == ' ')
				{
					for (a = i - 1;a < n;a++)
					{
						suoyou = tangible.StringFunctions.changeCharacter(suoyou, a, suoyou.charAt(a + 1));
						suoyou = tangible.StringFunctions.changeCharacter(suoyou, n - l, '\0');

					}
					l++;
					i--;
				}
			}
		}
		System.out.println(suoyou);
		return 0;
	}
}

