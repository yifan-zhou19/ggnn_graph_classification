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
		int j;
		n = s.length();
		m = a.length();
		int i = 0;
		while (i < n)
		{
			int p = 0;
			if ((a.charAt(0) == s.charAt(i)) && ((s.charAt(i - 1) == ' ') || (i == 0)))
			{
				for (j = 1;j < m;j++)
				{
					if (a.charAt(j) != s.charAt(i + j))
					{
						System.out.printf("%c",s.charAt(i));
						i = i + 1;
						break;
					}
					else
					{
						p++;
					}
				}
				if ((p == m - 1) && ((s.charAt(i + m) == ' ') || (i + m == n)))
				{
					System.out.printf("%s",b);
					i += m;
				}
				else
				{
					System.out.printf("%c",s.charAt(i));
					i++;
				}
			}
			else
			{
				 System.out.printf("%c",s.charAt(i));
				 i = i + 1;
			}
		}
		return 0;
	}

}

