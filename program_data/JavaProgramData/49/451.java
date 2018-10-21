package <missing>;

public class GlobalMembers
{
	public static void huiwen(int k, String a)
	{
		int i;
		int shime = 1;
		for (i = 0 ; i <= k / 2 ; i++)
		{
			if (!a[i].equals(a[k - i - 1]))
			{
				shime = 0;
			}
		}
		if (shime != 0)
		{
			for (i = 0 ; i < k ; i++)
			{
				System.out.print(a[i]);
			}
			System.out.print("\n");
		}
	}
	public static int Main()
	{
		String yuan = new String(new char[500]);
		String yiduan = new String(new char[500]);
		int n;
		int i;
		int j;
		int k;
		yuan = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n = yuan.length();
		for (k = 2 ; k <= n ; k = k + 2)
		{
			for (i = 0 ; i + k <= n ; i++)
			{
				for (j = i ; j <= i + k ; j++)
				{
					yiduan = tangible.StringFunctions.changeCharacter(yiduan, j - i, yuan.charAt(j));
				}
				huiwen(k, yiduan);
			}
		}
		return 0;
	}
}

