package <missing>;

public class GlobalMembers
{
	public static String ch = new String(new char[600]);
	public static char length;
	public static void search(int x,int y,int z)
	{
		int i;
		for (i = 0;i < z;i++)
		{
			if (ch.charAt(x - i) != ch.charAt(y + i))
			{
				return;
			}
		}
		for (i = x - z + 1;i <= y + z - 1;i++)
		{
			System.out.print(ch.charAt(i));
		}
		System.out.print("\n");
	}
	public static int Main()
	{
		int i;
		int j;
		int k;
		ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
		length = ch.length();
		for (i = 2;i <= length;i++)
		{
			for (j = (i - 1) / 2;j <= length - i / 2 - 1;j++)
			{
				if (i % 2 == 0)
				{
					search(j, j + 1, i / 2);
				}
				else
				{
					search(j - 1, j + 1, i / 2);
				}
			}
		}
		return 0;
	}
}

