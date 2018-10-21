package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[100]);
	public static String a = new String(new char[100]);
	public static String b = new String(new char[100]);
	public static int len1;
	public static int len2;
	public static int len3;
	public static int i;
	public static int check(int place)
	{
		int num = 0;
		int ctr = 0;
		if (place > 0 && s.charAt(place-1) != ' ')
		{
			return 0;
		}
		for (ctr = 0;ctr < len2;ctr++)
		{
			if (s.charAt(place + ctr) == a.charAt(ctr))
			{
				num++;
			}
		}
		if (num == len2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void output()
	{
		int ctr1;
		for (ctr1 = 0;ctr1 < len3;ctr1++)
		{
			System.out.printf("%c",b.charAt(ctr1));
		}
	}
	public static int Main()
	{
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		len1 = s.length();
		len2 = a.length();
		len3 = b.length();
		for (i = 0;i < len1;i++)
		{
			if (check(i) != 0)
			{
				output();
				i += len2 - 1;
			}
			else
			{
				System.out.printf("%c",s.charAt(i));
			}
		}
	}
}
