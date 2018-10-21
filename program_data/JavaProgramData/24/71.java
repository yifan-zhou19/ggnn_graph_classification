package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[510]);
		String p;
		int i;
		int n;
		int s1;
		int s2;
		int c;
		int d;
		int k;
		int chang = 0;
		int duan = 0;
		a = new Scanner(System.in).nextLine();
		p = a;
		for (i = 0; * (p.Substring(i)) != '\0';i++)
		{
			if (*(p.Substring(i)) == ' ')
			{
			s1 = s2 = i;
			break;
			}
		}
		for (i = 1; * (p.Substring(i)) != '\0';i++)
		{
			if (*(p.Substring(i) - 1) == ' ')
			{
				c = i;
				for (k = i;;k++)
				{
					if (*(p.Substring(k)) == ' ' || *(p.Substring(k)) == '\0')
					{
						d = k;
						break;
					}
				}
					if (d - c > s1)
					{
						s1 = d - c;
						chang = c;
					}
			}
		}
		for (i = 1; * (p.Substring(i)) != '\0';i++)
		{
			if (*(p.Substring(i) - 1) == ' ')
			{
				c = i;
				for (k = i;;k++)
				{
					if (*(p.Substring(k)) == ' ' || *(p.Substring(k)) == '\0')
					{
						d = k;
						break;
					}
				}
					if (d - c < s2)
					{
						s2 = d - c;
						duan = c;
					}
			}
		}
		for (i = chang;i < chang + s1;i++)
		{
			System.out.printf("%c",*(p.Substring(i)));
		}
		System.out.print("\n");
		for (i = duan;i < duan + s2;i++)
		{
			System.out.printf("%c",*(p.Substring(i)));
		}
		return 0;
	}
}
