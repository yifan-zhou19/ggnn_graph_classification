package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String jz = new String(new char[102]);
		int i;
		jz = new Scanner(System.in).nextLine();
		for (i = 0;jz.charAt(i) != '\0';i++)
		{
			if (jz.charAt(i) == ' ' && jz.charAt(i + 1) != ' ' || jz.charAt(i) != ' ')
			{
				System.out.printf("%c",jz.charAt(i));
			}
		}
		return 0;
	}
}
