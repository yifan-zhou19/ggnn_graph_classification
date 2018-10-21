package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[300]);
		int i;
		char c;
		str = new Scanner(System.in).nextLine();
		for (i = 0;(c = str.charAt(i)) != '\0';i++)
		{
			if ((c = str.charAt(i)) == 32)
			{
				if ((c = str.charAt(i - 1)) == 32)
				{
					continue;
				}
			}
			System.out.printf("%c",str.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}
}
