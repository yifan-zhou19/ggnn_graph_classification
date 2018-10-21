package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		char[][] s = new char[1000][50];
		int[] len = new int[1000];
		int sum = 0;
	//	int breakpoint[1000];
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			s[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len[i] = String.valueOf(s[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			if (i == n - 1)
			{
				System.out.print(s[i]);
				System.out.print("\n");
				break;
			}
			System.out.print(s[i]);
			System.out.print(" ");
			sum = sum + len[i] + 1;
			if ((sum + len[i + 1] <= 80) && (sum + len[i + 1] + 1 + len[i + 2]>80))
			{
				i = i + 1;
				System.out.print(s[i]);
				System.out.print("\n");
				sum = 0;
			}
		}
		return 0;
	}
}

