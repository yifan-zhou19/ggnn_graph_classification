package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int n = 0;
		int j = 0;
		int b = 0;
		String test = new String(new char[81]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			b = 1;
			test = new Scanner(System.in).nextLine();
			if (!(test.charAt(0) == '_' || (test.charAt(0) >= 'A' && test.charAt(0) <= 'Z') || (test.charAt(0) <= 'z' && test.charAt(0) >= 'a')))
			{
				b = 0;
			}
			for (j = 1;j < test.length();j++)
			{
				if (!(test.charAt(j) == '_' || (test.charAt(j) >= 'A' && test.charAt(j) <= 'Z') || (test.charAt(j) <= 'z' && test.charAt(j) >= 'a') || (test.charAt(j) >= '0' && test.charAt(j) <= '9')))
				{
					b = 0;
				}
			}
			if (b == 1)
			{
				System.out.print(1);
				System.out.print("\n");
			}
			else
			{
				System.out.print(0);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

