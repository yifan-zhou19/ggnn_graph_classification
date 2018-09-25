package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		s = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		int n;
		int m;
		int p = 0;
		int q;
		int i;
		int j;
		n = s.length();
		m = a.length();

		int begin = 0;


		for (i = 0;i < n;i++)
		{
			if (a.charAt(0) == s.charAt(i) && (i == 0 || s.charAt(i - 1) == ' '))
			{
				q = i;
				p = 0;
				for (j = 1;j < m;j++)
				{
					if (a.charAt(j) != s.charAt(i + j))
					{
						break;
					}
					else
					{
						p++;
					}
				}
				if (p == m - 1 && (i + m == n || s.charAt(i + m) == ' '))
				{
					System.out.printf("%s",b);
					i += m - 1;
				}
				else
				{
					System.out.printf("%c",s.charAt(i));
				}

			}
			else
			{
				System.out.printf("%c",s.charAt(i));
			}
		}

		return 0;
	}
}

