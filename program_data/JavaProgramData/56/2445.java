package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num = new String(new char[7]);
		num = new Scanner(System.in).nextLine();
		int i;
		for (i = 1;i <= num.length();i++)
		{
			System.out.printf("%c",num.charAt(num.length() - i));
		}
		System.out.print("\n");

	}
}
