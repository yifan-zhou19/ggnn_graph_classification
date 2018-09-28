package <missing>;

public class GlobalMembers
{
	public static String b = new String(new char[505]);
	public static int check()
	{
		int i;
		int len;
		int j;
		len = b.length();
		for (i = 0,j = len - 1;i < j;i++,j--)
		{
			if (b.charAt(i) != b.charAt(j))
			{
				return 0;
			}
		}
			return 1;
	}
	public static void Main()
	{
		String a = new String(new char[510]);
		int i;
		int j;
		int k;
		int len;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 2;i <= len;i++)
		{
			for (j = 0;j <= len - i;j++)
			{
				for (k = 0;k < i;k++)
				{
					b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(k + j));
				}
				b = b.substring(0, k);
				if (check() != 0)
				{
					System.out.printf("%s\n",b);
				}
			}
		}
	}

}

