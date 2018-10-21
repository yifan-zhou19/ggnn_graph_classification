package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[10000]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int n = s.length() - a.length();
		int m = a.length();
		int l = s.length();
		int[] k = new int[10];
		int d = 0;
		for (int i = 0;i <= n;i++)
		{
			int c = 0;
			for (int j = 0;j < m;j++)
			{
				if (a.charAt(j) != s.charAt(j + i))
				{
					c++;
				}
			}
			if (c == 0 && (int)s.charAt(i - 1) == 32)
			{
				k[d + 1] = i;
				d++;
			}
			else if (c == 0 && (int)s.charAt(i) >= 65 && (int)s.charAt(i) <= 90)
			{
				k[d + 1] = i;
				d++;
			}
		}
		k[0] = 0;
		k[d + 1] = l;
		for (int q = k[0];q < k[1];q++)
		{
				System.out.printf("%c",s.charAt(q));
		}
		for (int r = 1;r <= d;r++)
		{
			System.out.printf("%s",b);
			for (int g = k[r] + m;g < k[r + 1];g++)
			{
				System.out.printf("%c",s.charAt(g));
			}
		}
		return 0;
	}
}
