package <missing>;

public class GlobalMembers
{
	public static char boy;
	public static void calculate(String children)
	{
		int b;
		int g;
		int i;
		for (i = 0; !children[i].equals('\0'); i++)
		{
			if (children[i].equals(boy))
			{
				b = i;
			}
			if (!children[i].equals(boy) && !children[i].equals(1))
			{
				g = i;
				System.out.print(b);
				System.out.print(" ");
				System.out.print(g);
				System.out.print("\n");
				children[b] = children[g] = 1;
				calculate(children);
				break;
			}
		}
	}

	public static int Main()
	{
		String children = new String(new char[101]);
		children = ConsoleInput.readToWhiteSpace(true).charAt(0);
		boy = children.charAt(0);
		calculate(children);

		return 0;
	}
}

