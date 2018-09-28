package <missing>;

public class GlobalMembers
{
	public static String set = new String(new char[100]);
	public static void getBoy(int i,char b,char g)
	{
		if (set.charAt(i) == '\0')
		{
			return;
		}
		while (set.charAt(i) != '\0' && set.charAt(i) != g)
		{
			++i;
		}
		int j = i - 1;
		while (j >= 0 && set.charAt(j) != b)
		{
			--j;
		}
		System.out.print(j);
		System.out.print(" ");
		System.out.print(i);
		System.out.print("\n");
		set = set.substring(0, i);
		set = set.substring(0, j);
		getBoy(i + 1, b, g);
	}
	public static int Main()
	{
		set = ConsoleInput.readToWhiteSpace(true).charAt(0);
		char b;
		char g;
		b = set.charAt(0);
		g = set.charAt(set.length() - 1);
		getBoy(0, b, g);
		return 0;
	}
}

