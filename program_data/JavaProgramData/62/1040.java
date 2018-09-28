package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		char b = 32;
		String sz = new String(new char[10000]);
		String res = new String(new char[10000]);
		sz = new Scanner(System.in).nextLine();
		a = sz.length();
		for (i = 0;i < a;i++)
		{
			if (sz.charAt(i) != 32)
			{
				System.out.printf("%c",sz.charAt(i));
			}
			else if (sz.charAt(i) == 32 && sz.charAt(i - 1) != 32)
			{
				System.out.printf("%c",b);
			}
		}
		return 0;
	}
}
