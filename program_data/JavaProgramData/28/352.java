package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String ch = new String(new char[10000]);
		ch = new Scanner(System.in).nextLine();
		String p1 = ch;
		String p2 = ch;
		int n;
		int i;
		n = ch.length();
		for (i = 0;i < n;i++)
		{
			p2 = ch.charAt(i);
			if (ch.charAt(i) != ' ' && ch.charAt(i - 1) == ' ')
			{
				p1 = ch.charAt(i);
			}
			if (ch.charAt(i) != ' ' && ch.charAt(i + 1) == ' ')
			{
				System.out.printf("%d,",p2 - p1.Substring(1));
			}
			if (ch.charAt(i + 1) == '\0')
			{
				System.out.printf("%d",p2 - p1.Substring(1));
			}
		}
	}
}
