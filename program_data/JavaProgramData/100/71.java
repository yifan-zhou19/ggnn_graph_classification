package <missing>;

public class GlobalMembers
{
	public static void statistic(String str, int[] letter_num, int n)
	{
		int i;
		for (i = 0;i < n;i++)
		{
			letter_num[str[i] - 'a']++;
		}
	}

	public static void Main()
	{
		String str = new String(new char[300]);
		final String letter = "abcdefghijklmnopqrstuvwxyz";
		int n;
		int i;
		int[] letter_num = new int[26];
		int t = 0;
		str = new Scanner(System.in).nextLine();
		n = str.length();
		statistic(str, letter_num, n);
		for (i = 0;i < 26;i++)
		{
			if (letter_num[i] != 0)
			{
				System.out.print(letter.charAt(i));
				System.out.printf("=%d\n",letter_num[i]);
				t++;
			}
		}
		if (t == 0)
		{
			System.out.print("No");
		}
	}
}
