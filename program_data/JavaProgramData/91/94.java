package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ori = new String(new char[101]);
		ori = new Scanner(System.in).nextLine();
		int i;
		for (i = 0;i < ori.length() - 1;i++)
		{
			System.out.printf("%c",ori.charAt(i) + ori.charAt(i + 1));
		}
		System.out.printf("%c\n",ori.charAt(i) + ori.charAt(0));
		return 0;
	}
}
