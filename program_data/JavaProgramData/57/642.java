package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int l;
		int i;
		String a = new String(new char[33]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			l = a.length();
			if ((a.charAt(l - 1) == 'r') || (a.charAt(l - 1) == 'y'))
			{
				for (i = 0;i < l - 2;i++)
				{
					System.out.print(a.charAt(i));
				}
			}
			if (a.charAt(l - 1) == 'g')
			{
			   for (i = 0;i < l - 3;i++)
			   {
				   System.out.print(a.charAt(i));
			   }
			}
			System.out.print("\n");
		}
		return 0;
	}

}

