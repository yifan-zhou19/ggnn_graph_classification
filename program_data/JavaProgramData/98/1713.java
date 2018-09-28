package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[50]);
		String p = null;
		int n;
		int k = 0;
		int sum = 0;
		int len;
		int f = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k < n)
		{
			word = ConsoleInput.readToWhiteSpace(true).charAt(0);
			p = word;
			len = p.length();
			if (f == 1)
			{
				System.out.print(word);
				sum = len;
				k++;
				f = 0;
				continue;
			}
			if (sum + 1 + len > 80)
			{
				System.out.print("\n");
				System.out.print(word);
				sum = len;
				k++;
				continue;
			}
			if (sum + 1 + len <= 80)
			{
				System.out.print(" ");
				System.out.print(word);
				sum = sum + 1 + len;
				k++;
				continue;
			}
		}
		return 0;
	}
}

