package <missing>;

public class GlobalMembers
{
	public static void friend1(String p, int n)
	{
		char c;
		int j;
		c = p[0];
		for (j = 0;j <= n - 2;j++)
		{
			p[j] = (p + j) + p[j + 1];
		}
		p[n - 1] = (p + n - 1) + c;

	}
	public static int Main()
	{
		String letter = new String(new char[100]);
		int i;
		int j;
		int k;
		letter = new Scanner(System.in).nextLine();
		friend1(letter, letter.length());
		System.out.println(letter);
	}

}
