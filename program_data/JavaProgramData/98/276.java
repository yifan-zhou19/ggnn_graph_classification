package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] word = new char[600][40];
		String p = word;
		for (int i = 0; i < n ;i++)
		{
			word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		int sum = 0;
		int flag = 1;
		for (int i = 0; i < n ; i++,p++)
		{
			if (flag != 0)
			{
				sum += String.valueOf(word[i]).length();
			}
			else
			{
				sum += String.valueOf(word[i]).length() + 1;
			}
			if (sum <= 80)
			{
				if (flag != 0)
				{
					System.out.print(p);
					flag = 0;
				}
				else
				{
					System.out.print(" ");
					System.out.print(p);
				}
			}
			else
			{
				System.out.print("\n");
				flag = 1;
				sum = 0;
				i--;
				p--;
			}
		}
		return 0;
	}



}

