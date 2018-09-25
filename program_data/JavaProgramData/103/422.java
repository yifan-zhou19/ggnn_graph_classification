package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int n = 1;
		int i;
		int j;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0; a.charAt(i) != '\0'; i++)
		{
			if ((a.charAt(i) - 'a') == (a.charAt(i + 1) - 'a') || (a.charAt(i) - 'a') == (a.charAt(i + 1) - 'A') || (a.charAt(i) - 'A') == (a.charAt(i + 1) - 'a') || (a.charAt(i) - 'A') == (a.charAt(i + 1) - 'A'))
			{
				n++;
			}
			else
			{
				if ((a.charAt(i) >= 'a') && (a.charAt(i) <= 'z'))
				{
				System.out.print("(");
				System.out.print((char)(a.charAt(i) - 'a'+'A'));
				System.out.print(",");
				System.out.print(n);
				System.out.print(")");
				}
				else
				{
					System.out.print("(");
					System.out.print(a.charAt(i));
					System.out.print(",");
					System.out.print(n);
					System.out.print(")");
				}
				n = 1;
			}
		}
		return 0;
	}
}

