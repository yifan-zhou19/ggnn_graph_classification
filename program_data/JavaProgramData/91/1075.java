package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		String fri = new String(new char[101]);
		int i;
		str = new Scanner(System.in).nextLine();

		for (i = 0;i < L - 1;i++)
		{
			System.out.printf("%c",str.charAt(i) + str.charAt(i + 1));
		}
		System.out.printf("%c\n",str.charAt(i) + str.charAt(0));
		return 0;
	}
}
