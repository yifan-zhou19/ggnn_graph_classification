package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int count = 0;
		String buf = new String(new char[101]);
		char[][] dict = new char[101][101];
		while (scanf("%s", buf))
		{
			dict[count++] = buf;
			if (System.in.read() != ' ')
			{
				break;
			}
		}
		for (i = count - 1; i >= 0; i--)
		{
			if (i != count - 1)
			{
				System.out.print(" ");
			}
			System.out.printf("%s", dict[i]);
		}
		return 0;
	}
}
