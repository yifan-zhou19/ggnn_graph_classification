package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[101]);
		int i;
		int j;
		s = new Scanner(System.in).nextLine();
		for (i = s.length() - 1; i > 0; i--)
		{
			if (s.charAt(i) != ' ' && s.charAt(i - 1) == ' ')
			{
				for (j = i; s.charAt(j) != ' ' && s.charAt(j) != '\0'; j++)
				{
					System.out.printf("%c", s.charAt(j));
				}
				System.out.print(" ");
			}
		}
		for (i = 0; s.charAt(i) != ' ' && s.charAt(i) != '\0'; i++)
		{
			System.out.printf("%c", s.charAt(i));
		}
		System.out.print("\n");
	}
}
