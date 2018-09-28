package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[N]);
		int c;
		int[][] s = new int[N][2];
		a = new Scanner(System.in).nextLine();
		int sp;
		int len;
		int i;
		len = a.length();
		sp = 0;
		c = s[sp][0] = a.charAt(0);
		s[sp++][1] = 0;
		for (i = 1; i < len; i++)
		{
			if (c == a.charAt(i))
			{
				s[sp][0] = a.charAt(i);
				s[sp++][1] = i;
			}
			else
			{
				System.out.printf("%d %d\n",s[--sp][1],i);
			}
		}
	return 0;
	}
}
