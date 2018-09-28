package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int n;
		int i;
		int c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			*(s + i) = ConsoleInput.readToWhiteSpace(true);
		}
		c = 0;
		i = 0;
		while (i < n)
		{
			if (c + String.valueOf(*(s + i)).length() + 1 > 80)
			{
				System.out.print("\n");
				c = 0;
			}
			else if (c + String.valueOf(*(s + i)).length() + 1 <= 80 && c == 0)
			{
				System.out.print((s + i));
				c += String.valueOf(*(s + i)).length();
				i++;
			}
			else if (c + String.valueOf(*(s + i)).length() + 1 <= 80)
			{
				System.out.print(" ");
				System.out.print((s + i));
				c += String.valueOf(*(s + i)).length() + 1;
				i++;
			}

		}
			return 0;
	}

}

