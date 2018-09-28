package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num = new String(new char[5]);
		num = new Scanner(System.in).nextLine();
		for (int i = num.length() - 1;i >= 0;i--)
		{
			System.out.printf("%c",num.charAt(i));
		}
		System.in.read();
		System.in.read();
		return 0;
	}

}
