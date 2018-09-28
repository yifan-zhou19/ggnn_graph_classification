package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		String s = new String(new char[1000]);
		s = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) != ' ')
			{
				System.out.printf("%c",s.charAt(i));
			}
			else
			{
				while (s.charAt(i + 1) == ' ')
				{
					i++;
				}
				System.out.printf("%c",s.charAt(i));
			}
		}
		System.out.print("\n");
	}
}
