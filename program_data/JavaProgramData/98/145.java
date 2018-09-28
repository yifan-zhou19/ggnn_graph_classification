package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int len = 0;
		int count = 0;
		char[][] word = new char[1000][41];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (;count < n;)
		{
			len += String.valueOf(word[count]).length();
			System.out.print(word[count++]);
			while (len + String.valueOf(word[count]).length() + 1 <= 80)
			{
				if (count >= n)
				{
					break;
				}
				else
				{
					len += String.valueOf(word[count]).length() + 1;
					System.out.print(" ");
					System.out.print(word[count++]);
				}
			}
			len = 0;
			System.out.print("\n");
		}
		System.out.print("\n");
		return 0;
	}


}

