package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String z = new String(new char[30]);
		String p;
		z = new Scanner(System.in).nextLine();
		p = z;
		int i;
		for (i = 0 ; z.charAt(i) != '\0' ; i++)
		{
			if (*(p.Substring(i)) >= '0' && *(p.Substring(i)) <= '9')
			{
				if ((*(p.Substring(i) - 1) > '9' || *(p.Substring(i) - 1) < '0') && i != 0)
				{
					System.out.print("\n");
				}
				System.out.print((p.Substring(i)));
			}
		}
		System.out.print("\n");
		return 0;
	}

}
