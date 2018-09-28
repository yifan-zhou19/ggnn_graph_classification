package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	final String sb = "";
	sb = new Scanner(System.in).nextLine();
	for (int i = 0;sb.charAt(i) != '\0';i++)
	{
	if (sb.charAt(i) != ' ')
	{
	System.out.printf("%c",sb.charAt(i));
	}
	else if (sb.charAt(i) == ' ' && sb.charAt(i + 1) != ' ')
	{
	System.out.print(" ");
	}
	}
	return 0;
	}

}
