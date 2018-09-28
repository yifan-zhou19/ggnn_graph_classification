package <missing>;

public class GlobalMembers
{
	public static void huiwen(String string, int full, int length)
	{
		int x;
		int y;
		int u;
		int i;
		for (x = 0;x <= full - length + 1;x++)
		{
			 i = 1;
			for (y = x;y <= x + length - 1;y++)
			{
				if (string[2 * x + length - 1 - y].equals(String[y]))
				{
					i = i * 1;
				}
				else
				{
					i = i * 0;
				}
			}
			if (i == 1)
			{
				for (u = x;u <= x + length - 1;u++)
				{
					System.out.printf("%c",string[u]);
				}
				System.out.print("\n");
			}
		}
	}

	public static int Main()
	{
		String str = new String(new char[500]);
		str = new Scanner(System.in).nextLine();
		int w;
		w = str.length();
		int v;
		for (v = 2;v <= w;)
		{
		  huiwen(str, w, v);
		  v = v + 2;
		}
		return 0;
	}

}
