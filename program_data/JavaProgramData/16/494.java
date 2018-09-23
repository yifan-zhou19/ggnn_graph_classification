package <missing>;

public class GlobalMembers
{
	//??????
	public static int Main()
	{
		String a = new String(new char[100001]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int l = a.length();
		int i = 0;
		for (i = l - 1; i >= 0; i--)
		{
			System.out.print(a.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}

}

