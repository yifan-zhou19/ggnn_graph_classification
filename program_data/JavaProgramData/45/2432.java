package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[120]);
		int n;
		int t;
		int i;
		int j;
		int k;
		int start;
		int end;
		word = new Scanner(System.in).nextLine();
		n = word.length();
		start = 0;
		t = 0;
		for (i = 0;word.charAt(i) != ' ';i++)
		{
		}
		end = i - 1;
		for (j = i + 1;j < n;j++)
		{
			if (j + end <= n - 1)
			{
				t = 0;
				for (k = 0;k <= end;k++)
				{
					if (word.charAt(j + k) == word.charAt(k))
					{
						t = t + 1;
					}
				}
				if (t == end + 1)
				{
					System.out.printf("%d",j - i - 1);
					break;
				}
			}
		}
		return 0;
	}
}
