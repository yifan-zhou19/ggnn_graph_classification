package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sz = new String(new char[3000]);
			sz = new Scanner(System.in).nextLine();
		int jishu;
		int i;
		jishu = 0;
		int num = sz.length();
		for (i = 0;;i++)
		{
			if (sz.charAt(i) != 32 && sz.charAt(i) != '\0')
			{
				jishu++;
			}
			else if (sz.charAt(i) == 32 && jishu != 0)
			{
				System.out.printf("%d,",jishu);
				jishu = 0;
			}
			if (sz.charAt(i) == '\0' && jishu != 0)
			{
				System.out.printf("%d",jishu);
				break;
			}
		}
		return 0;
	}

}
