package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		String b = new String(new char[200]);
		String c = new String(new char[200]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		int i;
		int j;
		int l;
		int t;
		int k = 0;
		l = (int)a.length();
		t = (int)b.length();
		for (i = 0;i < l;i++)
		{
			for (j = 0;j < t;j++)
			{
				if (i + j - 1 > l)
				{
					break;
				}
				if (a.charAt(i + j) == b.charAt(j))
				{
					k = k + 1;
				}
				if ((a.charAt(i - 1) == ' ' || i == 0) && k == t && (a.charAt(i + t) == ' ' || i == l - t))
				{
					System.out.printf("%s",c);
					i = i + t;
				}
			}
			if (i > l - 1)
			{
				break;
			}
			if ((k != t || (t == k && (a.charAt(i - 1) != ' ' || i != 0) || a.charAt(i + t) != ' ' || i != l - t)))
			{
					System.out.printf("%c",a.charAt(i));
			}
			k = 0;
		}
		return 0;
	}
}
