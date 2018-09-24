package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		int l;
		int i;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) != ' ' || (a.charAt(i) == ' ' && a.charAt(i + 1) != ' '))
			{
				System.out.printf("%c",a.charAt(i));
			}
			if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
			{
				continue;
			}
		}
		System.out.print("\n");
	}
}
