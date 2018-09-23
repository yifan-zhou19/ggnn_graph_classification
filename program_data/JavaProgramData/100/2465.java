package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[52];
		String s = new String(new char[320]);
		int i;
		s = new Scanner(System.in).nextLine();
		for (i = 0; s.charAt(i); i++)
		{
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
			{
				a[s.charAt(i) - 'A']++;
			}
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				a[s.charAt(i) - 'a' + 26]++;
			}
		}
		int q = 0;
		for (i = 0; i < 26; i++)
		{
			if (a[i] > 0)
			{
				System.out.printf("%c=%d\n", 'A' + i, a[i]);
				q = 1;
			}
		}
		for (i = 26; i < 52; i++)
		{
			if (a[i] > 0)
			{
				System.out.printf("%c=%d\n", 'a' + i - 26, a[i]);
				q = 1;
			}
		}
		if (q == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}
