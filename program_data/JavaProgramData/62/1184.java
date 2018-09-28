package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		String z = new String(new char[300]);
		z = new Scanner(System.in).nextLine();
		a = z.length();
		for (i = 0;i < a;i++)
		{

			if (z.charAt(i) != ' ')
			{
				System.out.printf("%c",z.charAt(i));
				continue;
			}
			if (z.charAt(i) == ' ' && z.charAt(i + 1) != ' ')
			{
				System.out.printf("%c",z.charAt(i));
				continue;
			}
		}
		return 0;
	}

}
