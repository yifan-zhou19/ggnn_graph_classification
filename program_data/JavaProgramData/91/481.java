package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		String as = new String(new char[110]);
		String bs = new String(new char[110]);
		as = new Scanner(System.in).nextLine();
		int len = as.length();
		for (i = 0;i < len - 1;i++)
		{
			bs = tangible.StringFunctions.changeCharacter(bs, i, as.charAt(i) + as.charAt(i + 1));
		}
		bs = tangible.StringFunctions.changeCharacter(bs, len - 1, as.charAt(0) + as.charAt(len - 1));
		bs = bs.substring(0, len);
		System.out.printf("%s",bs);
		return 0;
	}
}

