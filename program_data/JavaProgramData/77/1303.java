package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j = 0;
		int[] p = new int[50];
		String s = new String(new char[100]);
		char c1;
		char c2;
		s = new Scanner(System.in).nextLine();
		c1 = s.charAt(0);
		for (i = 0;i < 50;i++)
		{
			p[i] = 0;
		}
		for (i = 1;i < s.length() / 2 + 1;i++)
		{
			if (s.charAt(i) != c1)
			{
				c2 = s.charAt(i);
				break;
			}
		}
		for (i = 0;i < s.length();i++)
		{
			if (s.charAt(i) == c1)
			{
				p[j++] = i;
			}
			else
			{
				System.out.printf("%d %d\n",p[j - --1],i);
			}
		}

	}

}
