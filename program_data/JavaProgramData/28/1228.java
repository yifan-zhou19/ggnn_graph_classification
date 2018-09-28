package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String ch = new String(new char[60000]);
		int i = 0;
		ch = new Scanner(System.in).nextLine();
		int length = 0;
		for (i = 0;i < ch.length();i++)
		{
			if (ch.charAt(i) == ' ')
			{
			length = 0;
			}
			else
			{
			length = length + 1;
			}
			if (ch.charAt(i) != ' ' && ch.charAt(i + 1) == ' ')
			{
			System.out.printf("%d,",length);
			}
			if (ch.charAt(i) != ' ' && ch.charAt(i) != '\0' && ch.charAt(i + 1) == '\0')
			{
			System.out.printf("%d",length);
			}
		}

	}



}
