package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int[] count = new int[27];
		int j;
		int[] a = new int[1000];
		int k;
		char[][] word = new char[1000][1000];
		char[][] c = new char[1000][2];
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= t;i++)
		{
			word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (j = 0;j < String.valueOf(word[i]).length();j++)
			{
				count[word[i][j] - 96] = count[word[i][j] - 96] + 1;
			}
			for (j = 0;j < String.valueOf(word[i]).length();j++)
			{
				if (count[word[i][j] - 96] == 1)
				{
				   c[i][0] = word[i][j];
				   a[i] = 1;
				   break;
				}
			}
			if (a[i] == 0)
			{
				 c[i][0] = 110;
				 c[i][1] = 111;
			}
			for (j = 0;j <= 26;j++)
			{
				count[j] = 0;
			}
		}
		for (i = 1;i <= t;i++)
		{
			if (a[i] == 1)
			{
				System.out.print(c[i][0]);
				System.out.print("\n");
			}
			if (a[i] == 0)
			{
				System.out.print(c[i]);
				System.out.print("\n");
			}
		}
	}
}

