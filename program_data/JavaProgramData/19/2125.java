package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p1;
		String p2;
		int i;
		int j;
		int n;
		int m;
		int w;
		String r = new String(new char[200]);
		String s = new String(new char[200]);
		String t = new String(new char[200]);
		r = new Scanner(System.in).nextLine();
		s = new Scanner(System.in).nextLine();
		t = new Scanner(System.in).nextLine();
		p1 = r;
		p2 = s;
		n = s.length();
		for (i = 0; * (p1.Substring(i)) != '\0';)
		{
			if (*(p1.Substring(i)) != p2)
			{
				System.out.printf("%c",*(p1.Substring(i)));
				i++;
			}
			else
			{
				for (j = 1,w = 1;j < n;j++)
				{
					if (*(p1.Substring(i) + j) != *(p2.Substring(j)))
					{
						for (m = 0;m < j;m++)
						{
							System.out.printf("%c",*(p1.Substring(i) + m));
						}
						break;
					}
					w++;
				}
				if (w == n)
				{
					if (((*(p1.Substring(i) + n) == ' ' || *(p1.Substring(i) + n) == '\0') && *(p1.Substring(i) - 1) == ' ') || ((i == 0) && *(p1.Substring(n)) == ' '))
					{
						System.out.printf("%s",t);
					}
				else
				{
					System.out.printf("%s",s);
				}
				i = i + n;
				}
				else
				{
					i = i + j;
				}
			}

		}
		return 0;
	}

}
