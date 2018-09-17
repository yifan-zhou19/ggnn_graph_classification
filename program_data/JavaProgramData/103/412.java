package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1001]);
		char t;
		int i;
		int count = 1;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0; i < a.length(); i++)
		{

			t = a.charAt(i);
			if (a.charAt(i + 1) == t || a.charAt(i + 1) - t == 'A' - 'a' || a.charAt(i + 1) - t == 'a' - 'A')
			{
				count++;
			}
			else
			{
				if (t > 'Z')
				{
					System.out.print("(");
					System.out.print((char)(t - 'a' + 'A'));
				}
				else
				{
					System.out.print("(");
					System.out.print((char)t);
				}
				System.out.print(",");
				System.out.print(count);
				System.out.print(")");
				count = 1;
			}
		}
		return 0;
	}
}

