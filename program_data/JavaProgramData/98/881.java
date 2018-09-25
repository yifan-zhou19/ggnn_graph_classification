package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t = 0;
		int n;
		int[] flag = new int[10000];
		char[][] word = new char[10000][40];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		System.out.print(word[0]);
		t = String.valueOf(word[0]).length();
		for (int i = 1; i < n; i++)
		{
			int l = String.valueOf(word[i]).length() + 1;
			t = t + l;
			if (t < 81)
			{
				System.out.print(" ");
				System.out.print(word[i]);
			}
			if (t >= 81)
			{
				System.out.print("\n");
				System.out.print(word[i]);
				t = String.valueOf(word[i]).length();
			}
		}
		return 0;
	}

}

