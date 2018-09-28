package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[6]);
		while (scanf("%s",s) != EOF)
		{
			int len = s.length();
			for (int i = len - 1;i >= 0;i--)
			{
				System.out.printf("%c",s.charAt(i));
			}
			System.out.print("\n");
		}
		return 0;
	}
}
