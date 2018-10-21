package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] str = new char[3000][45];
		for (i = 0;i < n;i++)
		{
			str[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		i = 0;
		while (i < n)
		{
			int len = String.valueOf(str[i]).length();
			System.out.print(str[i]);
			i++;
			while (i < n)
			{
				len = len + String.valueOf(str[i]).length() + 1;
				if (len <= 80)
				{
					System.out.print(' ');
					System.out.print(str[i]);
				}
				else
				{
					System.out.print("\n");
					break;
				}
				i++;
			}
		}
		return 0;
	}
}

