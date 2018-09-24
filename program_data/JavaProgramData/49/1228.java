package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[501]);
		s = new Scanner(System.in).nextLine();
		int i;
		int a;
		int b;
		int t;
		int l;
		int n;
		int j;
		n = s.length();
		for (l = 1;l < n;l++)
		{
			for (i = 0;i < n - l;i++)
			{
				a = i;
				b = i + l;
				t = 0;
				while (s.charAt(a) == s.charAt(b) && a < b)
				{
					a++;
					b--;
				};
				if (a >= b)
				{
					for (j = i;j <= i + l;j++)
					{
						System.out.printf("%c",s.charAt(j));
					}
					System.out.print("\n");
				}
			}
		}
	}


}
