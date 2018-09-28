package <missing>;

public class GlobalMembers
{
	public static char[][] word = new char[1000][41];
	public static int n;


	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n; i++)
		{
			word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		int count = 0;
		int p = 0;

		while (p < n)
		{
			int len = String.valueOf(word[p]).length();
			if (count == 0)
			{
				System.out.printf("%s", word[p]);
				p++;
				count += len;
			}
			else if (len + 1 + count <= 80)
			{
				System.out.printf(" %s", word[p]);
				p++;
				count += len + 1;
			}
			else if (len + 1 + count > 80)
			{
				System.out.print("\n");
				count = 0;
			}
			else
			{
				System.out.print("ERROR!-----------------------------------");
			}
		}
		return 0;
	}
}

