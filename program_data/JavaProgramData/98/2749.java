package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int count;
		int j;
		String word = new String(new char[50]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		count = 0;
		for (i = 0;i < n;i++)
		{
			word = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (j = 0;word.charAt(j);j++)
			{
				;
			}
			if (count + j <= 80)
			{
				if (i == 0)
				{
					System.out.print(word);
				}
				else
				{
					System.out.print(" ");
					System.out.print(word);
				}
				count += j + 1;
			}
			else
			{
				System.out.print("\n");
				System.out.print(word);
				count = j + 1;
			}
		}

		return 0;
	}
}

