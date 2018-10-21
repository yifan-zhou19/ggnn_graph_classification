package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int t = 0;
		final String c = "";
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read(); //??
		while (i <= n)
		{
			c = tangible.StringFunctions.changeCharacter(c, t, System.in.read());
			if (c.charAt(t) == ' ')
			{
				i++;
			}
			if (c.charAt(t) == '\n')
			{
				break;
				c = tangible.StringFunctions.changeCharacter(c, t, '\0');
			}
			t++;
		}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = c.charAt(0) + 80; //??80???????
		int m = 0;
		while (true)
		{
			while (*p != ' ')
			{
				p--;
			} //??????
			for (i = m; c.charAt(i) != p;i++)
			{
				System.out.print(c.charAt(i));
			}
			System.out.print("\n");
			if (c.charAt(i + 81) != '\0')
			{
				p = c.charAt(i + 1) + 80;
				m = i + 1;
			}
			else
			{
				i++;
				for (;c.charAt(i) != '\0';i++)
				{
					System.out.print(c.charAt(i));
				}
				break;
			}
		}
		return 0;
	}

}

