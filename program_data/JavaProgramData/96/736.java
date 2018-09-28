package <missing>;

public class GlobalMembers
{
	/* ???? ??13.cpp
	 * ??? 1200012826 ??
	 * ??? 2012?11?16?
	 */
	public static int Main()
	{
		int i;
		int r;
		int y;
		int b = 0;
		int[] s = new int[101];
		String a = new String(new char[101]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		if (a.charAt(1) == '\0')
		{
			System.out.print(0);
			System.out.print("\n");
			System.out.print(a.charAt(0));
			System.out.print("\n");
		}
		else
		{

			r = (a.charAt(0) - '0') * 10 + a.charAt(1) - '0';
			for (i = 1; a.charAt(i) != '\0'; i++)
			{

				s[i] = r / 13;
				y = r % 13;
				b++;
				r = 10 * (r % 13) + a.charAt(i + 1) - '0';
				if (a.charAt(i + 1) == '\0')
				{
					break;
				}
			}
			if (s[1] != 0)
			{
				for (i = 1; i <= b; i++)
				{
					System.out.print(s[i]);
				}
				System.out.print("\n");
				System.out.print(y);
				System.out.print("\n");
			}
			else
			{
				if (b == 1)
				{
					System.out.print(0);
					System.out.print("\n");
				}
				else
				{
					for (i = 2; i <= b; i++)
					{
						System.out.print(s[i]);
					}
					System.out.print("\n");
				}
				System.out.print(y);
				System.out.print("\n");
			}
			return 0;
		}
	}
}

