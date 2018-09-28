package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		int[] b = new int[101];
		int lenth;
		int i;
		char c = ' ';
		a = new Scanner(System.in).nextLine();
		lenth = a.length();
		for (i = 0;i < lenth;i++)
		{
			b[i] = 1;
		}
		for (i = 0;i < lenth;i++)
		{
			if (a.charAt(i) == c && a.charAt(i - 1) == c)
			{
				b[i] = 0;
			}
		}
		for (i = 0;i < lenth;i++)
		{
			if (b[i] == 1)
			{
				System.out.printf("%c",a.charAt(i));
			}
		}
		return 0;
	}

}
