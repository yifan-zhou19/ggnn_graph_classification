package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int g;
	int a = 0;
	String m = new String(new char[301]);
	final String n = "abcdefghijklmnopqrstuvwxyz";
	m = ConsoleInput.readToWhiteSpace(true).charAt(0);
	for (j = 0;j < 26;j++)
	{
		g = 0;
		for (i = 0;i < m.length();i++)
		{
			if (m.charAt(i) == n.charAt(j))
			{
				g++;
			}
		}
		if (g > 0)
		{
		System.out.print(n.charAt(j));
		System.out.print('=');
		System.out.print(g);
		System.out.print("\n");
	a++;
		}
	}
	if (a == 0)
	{
		System.out.print("No");
		System.out.print("\n");
	}

	return 0;
	}

}

