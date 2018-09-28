package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		int i;
		int j;
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) != ' ')
			{
			System.out.printf("%c",s.charAt(i));
			}
			else
			{
				System.out.print(" ");
				for (j = i;s.charAt(j) == ' ';j++)
				{
					i = j;
				}
			}
		}
		return 0;
	}
}
