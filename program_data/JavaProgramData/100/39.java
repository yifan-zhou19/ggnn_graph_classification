package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[100]);
		int[] n = new int[26];
		int l;
		int i;
		int j;
		int m = 0;
		for (i = 0;i < 26;i++)
		{
			n[i] = 0;
		}
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = 0;i < l;i++)
		{
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				m++;
				j = s.charAt(i) - 'a';
				n[j]++;
			}

		}
		if (m == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i < 26;i++)
			{
				if (n[i] != 0)
				{
					System.out.printf("%c=%d\n",i + 'a',n[i]);
				}
			}
		}
	}

}
