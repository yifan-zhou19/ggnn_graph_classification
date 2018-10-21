package <missing>;

public class GlobalMembers
{
	public static int data(tangible.RefObject<String> c, int i, char boy, char girl)
	{
		if (*(c.argValue.Substring(i)) == 0)
		{
			return 0;
		}
		if (*(c.argValue.Substring(i)) == girl)
		{
			return i;
		}
		int j;
		j = data(c, i + 1, boy, girl);
		System.out.print(i);
		System.out.print(' ');
		System.out.print(j);
		System.out.print("\n");
		return data(c, j + 1, boy, girl);
	}
	public static int Main()
	{
		String children = new String(new char[1000]);
		char boy;
		char girl;
		int i;
		children = ConsoleInput.readToWhiteSpace(true).charAt(0);
		boy = children.charAt(0);
		for (i = 0;children.charAt(i) != 0;i++)
		{
			if (children.charAt(i) != boy)
			{
				girl = children.charAt(i);
				break;
			}
		}
	tangible.RefObject<String> tempRef_children = new tangible.RefObject<String>(children);
		i = data(tempRef_children, 0, boy, girl);
		children = tempRef_children.argValue;
		return 0;
	}
}

