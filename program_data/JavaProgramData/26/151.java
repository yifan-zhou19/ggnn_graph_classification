package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		String c = new String(new char[100]);
		c = new Scanner(System.in).nextLine();
		for (i = 0;c.charAt(i) != '\0';i++)
		{
			if (c.charAt(i) == '\t' && c.charAt(i + 1) != '\t' && c.charAt(i + 1) != ' ')
			{
				System.out.print(" ");
			}
			else if ((c.charAt(i) != ' ' && c.charAt(i) != '\t') || (c.charAt(i) == ' ' && c.charAt(i + 1) != ' ' && c.charAt(i + 1) != '\t'))
			{
			System.out.printf("%c",c.charAt(i));
			}
		}
	}


}
