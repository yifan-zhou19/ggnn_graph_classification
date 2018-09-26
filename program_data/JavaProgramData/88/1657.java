package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[40]);
		int i = 0;
		int flag = 1;
		c = new Scanner(System.in).nextLine();
		while (c.charAt(i) != '\0')
		{
			if (c.charAt(i) >= 48 && c.charAt(i) <= 57)
			{
				System.out.printf("%c",c.charAt(i));
				flag = 0;
			}
			else if (flag == 0)
			{
				System.out.print("\n");
				flag = 1;
			}
			i++;
		}

		return 0;
	}


}
