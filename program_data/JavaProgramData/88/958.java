package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[40]);
		s = new Scanner(System.in).nextLine();
		String p = s;
		int sum = 0;
		int sign;
		int i;
		int j;
		int k;
		for (i = 0;i < s.length();)
		{
			sign = 0;
			if (p.charAt(i) == '0' && i + 1 < s.length() && (p.charAt(i + 1) >= '0' && p.charAt(i + 1) <= '9') && sign == 0)
			{
				i++;
				continue;
			}
			if (p.charAt(i) >= '0' && p.charAt(i) <= '9')
			{
			while (p.charAt(i) >= '0' && p.charAt(i) <= '9' && i < s.length())
			{
				System.out.print(p.charAt(i));
				i++;
			}
			}
			else
			{
				i++;
				continue;
			}
			System.out.print("\n");
		}
		//while(1);
		return 0;
	}



}
