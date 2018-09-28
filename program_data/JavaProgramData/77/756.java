package <missing>;

public class GlobalMembers
{
	// ????
	// ??? 1100012820
	// 20111115
	//******************
	public static String line = new String(new char[100]);
	public static int i = 0;
	public static void match(int af)
	{
		for (;line.charAt(i) != '\0'; i++)
		{
			if (line.charAt(i) == line.charAt(0))
			{
				int boy = i;
				match(++i);
				System.out.print(boy);
				System.out.print(" ");
				System.out.print(i);
				System.out.print("\n");
			}
			else
			{
				return;
			}

		}
		return;
	}
	public static int Main()
	{
		line = ConsoleInput.readToWhiteSpace(true).charAt(0);
		match(0);
		return 0;
	}
}

