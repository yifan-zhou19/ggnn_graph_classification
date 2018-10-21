package <missing>;

public class GlobalMembers
{
	public static int girl = -1;
	public static char boy_symbol = 0;
	public static int Main()
	{
		int Match = int boy;
		Match(0);
		return 0;
	}
	public static int Match(int boy)
	{
		girl++;
		char ch;
		ch = System.in.read();
		if (boy_symbol == 0)
		{
			boy_symbol = ch;
		}
		if (ch != boy_symbol)
		{
			return girl;
		}
		else
		{
			int t = Match(boy + 1);
			System.out.print(boy);
			System.out.print(" ");
			System.out.print(t);
			System.out.print("\n");
			if (boy != 0)
			{
				return Match(t + 1);
			}
		}
	}

}
