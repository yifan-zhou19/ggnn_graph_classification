package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int i;
		int l;
		int k;
		int a;
		String z = new String(new char[256]);
		z = new Scanner(System.in).nextLine();
		l = z.length();
		for (i = 0;i < l;i++)
		{
			if (z.charAt(i) != ' ' || z.charAt(i - 1) != ' ')
			{
				System.out.printf("%c",z.charAt(i));
			}
		}
	return 0;
	}
}
