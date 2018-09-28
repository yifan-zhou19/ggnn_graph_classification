package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sz = new String(new char[30]);
		int i;
		sz = new Scanner(System.in).nextLine();
		for (i = 0;i < 30;i++)
		{
			if ((sz.charAt(i) >= '0') && (sz.charAt(i) <= '9'))
			{
				System.out.printf("%c",sz.charAt(i));
			}
			else
			{
				System.out.print("\n");
			}
		}
		return 0;
	}
}
