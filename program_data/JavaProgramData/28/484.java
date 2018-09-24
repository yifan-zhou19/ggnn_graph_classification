package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[5000]);
		s = new Scanner(System.in).nextLine();
		int a;
		int b;
		int c;
		int d = 0;
		int e;
		int[] s1 = new int[500];
		a = s.length();
		b = 0;
		for (c = 0;c < a;c++)
		{
			if (s.charAt(c) == ' ')
			{
				s1[d] = b;
				d++;
			b = 0;
			}
			else
			{
				b++;
			}
		}
		for (e = 0;e < d;e++)
		{
			if (s1[e] != 0)
			{
				System.out.printf("%d,",s1[e]);
			}
		}
		System.out.printf("%d",b);
	}

}
