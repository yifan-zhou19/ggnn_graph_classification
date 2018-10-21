package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		char[] x = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int i;
		int j;
		int n;
		int m;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		n = a.length();
		m = b.length();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if ((s.charAt(i) == a.charAt(0) && s.charAt(i - 1) == ' ') || s.charAt(0) == a.charAt(0))
			{
				for (j = 0;j < n;j++)
				{
					if (s.charAt(i + j) != a.charAt(j))
					{
						break;
					}
				}
					if (n == j)
					{
						x[i] = 1;
					}
			}
		}
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (x[i] == 0)
			{
				System.out.printf("%c",s.charAt(i));
			}
			else if (x[i] == 1)
			{
				for (j = 0;j < m;j++)
				{
					System.out.printf("%c",b.charAt(j));
				}
				i += n - 1;
			}
		}
		System.out.print("\n");
		return 0;
	}



}
