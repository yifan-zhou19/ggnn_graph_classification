package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int cout = 0;
		int len = 0;
		int flag = 0;
		int b = 0;
		double lv;
		double a;
		String slv = new String(new char[10]);
		String s = new String(new char[500]);
		String z = new String(new char[500]);
		slv = new Scanner(System.in).nextLine();
		lv = Integer.parseInt(slv);
		s = new Scanner(System.in).nextLine();
		z = new Scanner(System.in).nextLine();
		len = s.length();
		if (s.length() == z.length())
		{
		for (int i = 0;s.charAt(i) != '\0';i++)
		{
		if (s.charAt(i) == z.charAt(i))
		{
			cout++;
		}
		if (s.charAt(i) != 'A' && s.charAt(i) != 'T' && s.charAt(i) != 'C' && s.charAt(i) != 'G')
		{
			b = 1;
		}
		if (z.charAt(i) != 'A' && z.charAt(i) != 'T' && z.charAt(i) != 'C' && z.charAt(i) != 'G')
		{
			b = 1;
		}
		}
		a = cout * 1.0 / len;
		flag++;
		}
		if (flag == 0 || b == 1)
		{
			System.out.print("error");
		}
		else
		{
		if (a > lv)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		}
		return 0;
	}

}
