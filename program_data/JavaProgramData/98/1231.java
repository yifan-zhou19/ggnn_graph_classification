package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] word = new char[500][40];
		int n;
		int i;
		int[] l = new int[500];
		int length = 80;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			l[i] = String.valueOf(word[i]).length();
		}
		System.out.print(word[0]);
		length = length - l[0];
		for (i = 1;i < n;i++)
		{
			if (l[i] < length)
			{
				System.out.print(" ");
				System.out.print(word[i]);
				length = length - l[i] - 1;
			}
			else
			{
				System.out.print("\n");
				length = 80;
				System.out.print(word[i]);
				length = length - l[i];
			}
		}
		return 0;
	}

}

