package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String z = new String(new char[50]);
		z = new Scanner(System.in).nextLine();
		for (int j = 0;j < n;j++)
		{
			z = new Scanner(System.in).nextLine();
			m = z.length();
			if (z.charAt(m - 1) == 'r' || z.charAt(m - 1) == 'y')
			{
				z = z.substring(0, m - 1);
				z = z.substring(0, m - 2);
			}
			else
			{
				z = z.substring(0, m - 1);
				z = z.substring(0, m - 2);
				z = z.substring(0, m - 3);
			}
			System.out.println(z);
		}
		return 0;
	}
}

