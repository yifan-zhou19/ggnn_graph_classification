package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		char[][] str = new char[10001][40];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (int i = 1 ; i <= n ; i++)
		{
			cin.getline(str[i],40,' ');
		}
		int sum = 0;
		for (int i = 1 ;i <= n ; i++)
		{
			sum += String.valueOf(str[i]).length();
			if (sum <= 80)
			{
				if (sum != String.valueOf(str[i]).length())
				{
					System.out.print(" ");
				}
				else
				{
					sum = sum;
				}
				for (int j = 0 ; j < String.valueOf(str[i]).length(); j++)
				{
					System.out.print((str[i] + j));
				}
				sum++;
			}
			else
			{
				System.out.print("\n");
				sum = 0;
				i--;
			}
		}
		return 0;
	}
}

