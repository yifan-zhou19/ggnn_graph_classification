package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		String str1 = new String(new char[101]);
		String str2 = new String(new char[101]);
		str = new Scanner(System.in).nextLine();
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		int i;
		int len = str.length();
		int n = 0;
		String[] p = new String[101];
		p[n] = str;
		for (i = 0;i < len;i++)
		{
			if (str.charAt(i) == ' ')
			{
				str = str.substring(0, i);
				p[++n] = str.charAt(i + 1);
			}
		}
		for (i = 0;i <= n;i++)
		{
			if (strcmp(p[i],str1) == 0)
			{
				System.out.printf("%s",str2);
			}
			else
			{
				System.out.printf("%s",p[i]);
			}
			if (i != n)
			{
				System.out.print(" ");
			}
		}
		return 0;
	}
}
