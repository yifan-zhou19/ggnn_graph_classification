package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String cha = new String(new char[500]);
		cha = new Scanner(System.in).nextLine();
		int i = 0;
		int b;
		for (i = 0;cha.charAt(i) != '\0';i++)
		{
			if (cha.charAt(i + 1) == '\0')
			{
				b = (int)cha.charAt(i) + (int)cha.charAt(0);
				System.out.printf("%c",b);
			}
			else
			{
				b = (int)cha.charAt(i) + (int)cha.charAt(i + 1);
				System.out.printf("%c",b);
			}
		}
		return 0;
	}
}
