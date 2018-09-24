package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[301]);
		char x;
		final String b = "abcdefghijklmnopqrstuvwxyz";
		s = new Scanner(System.in).nextLine();
		int len;
		len = s.length();
		int j;
		int i;
		int[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int d = 0;
		for (j = 0;j < 26;j++)
		{
		for (i = 0;i < len;i++)
		{
			if (s.charAt(i) == b.charAt(j))
			{
			  a[j]++;
			  d++;
			}
		}
			if (a[j] != 0)
			{
			x = b.charAt(j);
			System.out.printf("%c=%d\n",x,a[j]);
			}
		}
		if (d == 0)
		{
		System.out.print("No");
		}
		return 0;
	}

}
