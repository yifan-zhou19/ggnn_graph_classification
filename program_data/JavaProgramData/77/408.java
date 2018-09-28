package <missing>;

public class GlobalMembers
{
	public static char b;
	public static char g;
	public static String a = new String(new char[1000]);
	public static int l;
	public static int i;
	public static int Main()
	{
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = a.length();
		b = a.charAt(0);
		g = a.charAt(l - 1);
		int j;
		for (i = 0;i < l;i++)
		{
		if (a.charAt(i) == g)
		{
			for (j = i - 1;j >= 0;j--)
			{
				if (a.charAt(j) == b)
				{
					System.out.print(j);
					System.out.print(" ");
					System.out.print(i);
					System.out.print("\n");
					a = a.substring(0, j);
					a = a.substring(0, i);
						break;
				}
			}
		}
		}
		return 0;
	}


}

