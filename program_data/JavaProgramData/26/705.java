package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		String a = new String(new char[101]);
		int n;
		int i;
		int j;
		int k;
		str = new Scanner(System.in).nextLine();
		n = str.length();
		j = 0;

		for (i = 0;i < n;i++)
		{
			if (str.charAt(i) != ' ')
			{
				System.out.printf("%c",str.charAt(i));
			}
				if (str.charAt(i) == ' ')
				{
					if (str.charAt(i + 1) != ' ')
					{
						System.out.print(" ");
					}
				}
		}
		return 0;
	}
}
