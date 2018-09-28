package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[1000][45];
		int n;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			str[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (int i = 1; i <= n; i++)
		{
			if (sum == 0)
			{
				System.out.print(str[i]);
				sum += String.valueOf(str[i]).length();
			}
			else if (sum + String.valueOf(str[i]).length() + 1 <= 80)
			{
				System.out.print(" ");
				System.out.print(str[i]);
				sum += String.valueOf(str[i]).length() + 1;
			}
			else
			{
				System.out.print("\n");
				sum = 0;
				i = i - 1;
			}
		}
		return 0;
	}


}

