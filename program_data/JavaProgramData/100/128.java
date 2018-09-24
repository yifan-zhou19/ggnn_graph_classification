package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k = 0;
		int l;
		int[] n = new int[26];
		String s = new String(new char[300]);
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = 0;i < 26;i++)
		{
			n[i] = 0;
		}
		for (i = 0;i < 26;i++)
		{
			for (j = 0;j < l;j++)
			{
				if (s.charAt(j) == i + 'a')
				{
						n[i]++;
						k = 1;
				}
			}
		}
		if (k == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i < 26;i++)
			{
				if (n[i] != 0)
				{
					System.out.printf("%c=%d\n",(i + 'a'),n[i]);
				}
			}
		}
	}

}
