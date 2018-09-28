package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		int i;
		int t;
		int l;
		int flag;
		s = new Scanner(System.in).nextLine();
		l = s.length();
		flag = 0;
		i = 0;
		t = 0;
		while (i < l)
		{
			if (s.charAt(i) == '-')
			{
				flag = 1;
				continue;
			}
			while (s.charAt(i) >= '0' && s.charAt(i) <= '9' && flag != 1)
			{
				t = 1;
				System.out.printf("%c",s.charAt(i));
				i++;
			}
			if (t == 1)
			{
				t = 0;
				System.out.print("\n");
				continue;
			}
			if (flag == 1 && (s.charAt(i) < '0' || s.charAt(i)>'9'))
			{
				flag = 0;
				continue;
			}
			i++;
		}
		return 0;
	}
}
