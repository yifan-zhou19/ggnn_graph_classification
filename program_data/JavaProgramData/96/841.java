package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sz = new String(new char[101]);
		sz = new Scanner(System.in).nextLine();
		int n;
		int yushu = 0;
		int shang;
		int m;
		n = sz.length();
		for (int i = 0;i < n;i++)
		{
			m = yushu * 10 + (sz.charAt(i) - '0');
			shang = m / 13;
			yushu = m % 13;
			if (n > 2 && i < 2 && shang == 0)
			{
				System.out.print("");
			}
			else if (n == 2 && i == 0)
			{
				System.out.print("");
			}
			else
			{
				System.out.printf("%d",shang);
			}
		}
		System.out.printf("\n%d",yushu);
	}
}
