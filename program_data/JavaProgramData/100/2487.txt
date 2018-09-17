package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[301]);
		char c;
		int[] a1 = new int[26];
		int[] a2 = new int[26];
		int i;
		int j = 0;
		s = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i);i++)
		{
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
			{
				a1[s.charAt(i) - 'A']++;
			}
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				;
			}
			a2[s.charAt(i) - 'a']++;
		}
		for (i = 0;i < 26;i++)
		{
			if (a1[i] > 0)
			{
				c = i + 'A';
				System.out.printf("%c=%d\n",c,a1[i]);
				j++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (a2[i] > 0)
			{
				c = i + 'a';
				System.out.printf("%c=%d\n",c,a2[i]);
				j++;
			}
		}
		if (j == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}
