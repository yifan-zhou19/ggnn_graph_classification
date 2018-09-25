package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[500]);
		word = new Scanner(System.in).nextLine();
		int[] a = new int[26];
		int m;
		int i;
		int j;
		int sum = 0;
		m = word.length();
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (word.charAt(i) - 'a' == j)
				{
					a[j]++;
				}
			}
		}
		final String b = "abcdefghijklmnopqrstuvwxyz";
		for (i = 0;i < 26;i++)
		{
			if (a[i] != 0)
			{
				System.out.printf("%c=%d\n",b.charAt(i),a[i]);
				sum++;
			}

		}
		if (sum == 0)
		{
			System.out.print("No\n");
		}

		return 0;
	}






}
