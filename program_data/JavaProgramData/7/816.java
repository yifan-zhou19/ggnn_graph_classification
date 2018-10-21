package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int p;
		int f;
		String str = new String(new char[257]);
		String a = new String(new char[257]);
		String b = new String(new char[257]);
		str = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		n = str.length();
		m = a.length();
		p = 1;

		for (i = 0;i < n;i++)
		{
			f = 1;
			for (j = 0;j < m;j++)
			{
				if (str.charAt(i + j) != a.charAt(j))
				{
					f = 0;
					break;
				}
			}
			if ((p) != 0 && (f) != 0)
			{
			   System.out.printf("%s",b);
			   p = 0;
			   i += m - 1;
			}
			else
			{
				System.out.printf("%c",str.charAt(i));
			}
		}

		return 0;
	}
}
