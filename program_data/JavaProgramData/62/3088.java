package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l;
		String z = new String(new char[1000]);
		z = new Scanner(System.in).nextLine();
		l = z.length();
		for (int i = 0;i < l;i++)
		{
			if (z.charAt(i) != ' ' || (z.charAt(i) == ' ' && z.charAt (i - 1) != ' '))
			{
				System.out.print(z.charAt(i));
			}
		}
		return 0;
	}

}
