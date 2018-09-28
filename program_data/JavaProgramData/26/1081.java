package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[101]);
		char pre;
		int i;

		s = new Scanner(System.in).nextLine();
		pre = '-';

		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) != ' ')
			{
				System.out.printf("%c",s.charAt(i));
			}
			else if (pre != ' ')
			{
				System.out.print(" ");
			}
			pre = s.charAt(i);
		}

	}
}
