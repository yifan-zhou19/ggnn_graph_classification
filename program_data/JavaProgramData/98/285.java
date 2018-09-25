package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] str = new char[1000][50]; //????
		int len = 0;
		for (int i = 1;i <= n;i++)
		{
			*(str + i) = ConsoleInput.readToWhiteSpace(true);
		}
		for (int i = 1;i <= n;i++)
		{
			if (len == 0)
			{
				len = String.valueOf(*(str + i)).length();
				System.out.print((str + i));
			}
			else if (len + 1 + String.valueOf(*(str + i)).length() <= 80)
			{
				len = len + 1 + String.valueOf(*(str + i)).length();
				System.out.print(" ");
				System.out.print((str + i));
			}
			else if (len + 1 + String.valueOf(*(str + i)).length() > 80)
			{
				len = String.valueOf(*(str + i)).length();
				System.out.print("\n");
				System.out.print((str + i));
			}
		}
		return 0;
	}

}

