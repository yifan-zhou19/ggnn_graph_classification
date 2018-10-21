package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] word = new char[1000][83];
		int n;
		int i;
		int counter = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		//cout<<word[28]<<endl;
		for (i = 0;i < n;i++)
		{
			if (counter == 0)
			{
				System.out.print(word[i]);
				counter = counter + String.valueOf(word[i]).length();
			}
			else
			{
				if (counter + String.valueOf(word[i]).length() + 1 <= 80)
				{
					System.out.print(" ");
					System.out.print(word[i]);
					counter = counter + String.valueOf(word[i]).length() + 1;
				}
				else
				{
					System.out.print("\n");
					counter = 0;
					i--;
				}
			}
		}
		return 0;
	}
}

