package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String string = new String(new char[N]);
		int[] f = new int[26];
		int i;
		int j;
		int s;
		int count = 1;
		int d = 0;
		s = String.length();
		String = new Scanner(System.in).nextLine();
		s = String.length();
		for (i = 0;i < s;i++)
		{
			if (String[i] <= 'z' && string.charAt(i) >= 'a')
			{
				d++;
				f[string.charAt(i) - 'a'] = 1;
				for (j = i + 1;j < s;j++)
				{
					if (String[j] == string.charAt(i))
					{
						f[string.charAt(i) - 'a']++;
						String[j] = 0;
					}
				}
			}
		}
		if (d == 0)
		{
			System.out.print("No\n");
		}
		for (i = 0;i < 26;i++)
		{
			if (f[i] != 0)
			{
				System.out.printf("%c=%d\n",i + 'a',f[i]);
			}
		}
	}
}
