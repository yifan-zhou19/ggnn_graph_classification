package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1010]);
		int len = 1;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		if (a.length() == 1)
		{
			if (a.charAt(0) >= 65 && a.charAt(0) <= 90)
			{
				System.out.print("(");
				System.out.print(a.charAt(0));
				System.out.print(",1)");
			}
			else
			{
				System.out.print("(");
				System.out.print((char)(a.charAt(0) - 32));
				System.out.print(",1)");
			}
		}
		for (int i = 1; a.charAt(i) != '\0'; i++)
		{
			if (a.charAt(i) == a.charAt(i - 1) || a.charAt(i) == a.charAt(i - 1) + 32 || a.charAt(i) == a.charAt(i - 1) - 32)
			{
				len++;
			}
			else
			{
				if (a.charAt(i - 1) >= 65 && a.charAt(i - 1) <= 90)
				{
					System.out.print("(");
					System.out.print(a.charAt(i - 1));
					System.out.print(",");
					System.out.print(len);
					System.out.print(")");
				}
				else
				{
					System.out.print("(");
					System.out.print((char)(a.charAt(i - 1) - 32));
					System.out.print(",");
					System.out.print(len);
					System.out.print(")");
				}
				len = 1;
			}
			if (i == a.length() - 1)
			{
				if (a.charAt(i) >= 65 && a.charAt(i) <= 90)
				{
					System.out.print("(");
					System.out.print(a.charAt(i));
					System.out.print(",");
					System.out.print(len);
					System.out.print(")");
				}
				else
				{
					System.out.print("(");
					System.out.print((char)(a.charAt(i) - 32));
					System.out.print(",");
					System.out.print(len);
					System.out.print(")");
				}
			}
		}
		System.out.print("\n");
		return 0;
	}
}

