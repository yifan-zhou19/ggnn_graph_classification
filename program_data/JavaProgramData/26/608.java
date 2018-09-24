package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		i = 0;
		while (str.charAt(i) != '\0')
		{
			if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ')
			{
		System.out.print(" ");
			}
		if (str.charAt(i) != ' ')
		{
		System.out.printf("%c",str.charAt(i));
		}
		i++;
		}
	}
}
