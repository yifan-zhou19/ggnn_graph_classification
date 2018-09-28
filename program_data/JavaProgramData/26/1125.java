package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[1000]);
		int n;
		int i;
		int j;
		int k;
		c = new Scanner(System.in).nextLine();
		n = c.length();
		for (i = 0;i < n;i++)
		{
			if (c.charAt(i) != ' ')
			{
				System.out.printf("%c",c.charAt(i));
			}
			else if (c.charAt(i) == ' ')
			{
				if (c.charAt(i - 1) != ' ')
				{
					System.out.print(" ");
				}
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		return 0;
	}
}

