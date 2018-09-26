package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String in = new String(new char[101]);
		int i;
		int n;
		int out;
		in = new Scanner(System.in).nextLine();
		n = in.length();
		for (i = 0;i + 1 < n;i++)
		{
			out = (int)(in.charAt(i)) + (int)(in.charAt(i + 1));
			System.out.printf("%c",out);
		}
		out = (int)(in.charAt(n - 1)) + (int)(in.charAt(0));
		System.out.printf("%c",out);
		return 0;
	}

}
