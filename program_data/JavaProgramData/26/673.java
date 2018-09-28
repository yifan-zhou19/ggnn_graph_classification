package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[101]);
		int empty = 0;
		int i;
		c = new Scanner(System.in).nextLine();
		for (i = 0;;i++)
		{
			if (c.charAt(i) == 0)
			{
				break;
			}
			else if (c.charAt(i) == ' ' && empty == 0)
			{
				System.out.print(" ");
				empty++;
			}
			else if (c.charAt(i) != ' ')
			{
				System.out.printf("%c",c.charAt(i));
				empty = 0;
			}
		}
		return 0;
	}


}
