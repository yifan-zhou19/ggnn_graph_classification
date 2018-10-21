package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct p
	//	{
	//		int n,l;
	//	}
	//	ps[200],r1,r2;
		String s = new String(new char[10000]);
		int m;
		int k;
		int i;
		int j;
		s = new Scanner(System.in).nextLine();
		m = s.length();
		j = 0;
		ps[0].n = 0;
		ps[0].l = 0;
		for (i = 0;i < m;i++)
		{
			if (s.charAt(i) != ' ')
			{
				ps[j].l = ps[j].l + 1;
			}
			if (s.charAt(i) == ' ')
			{
				j = j + 1;
				ps[j].n = i + 1;
				ps[j].l = 0;
			}
		}
		r1 = ps[0];
		r2 = ps[0];
			for (i = 1;i <= j;i++)
			{
				if (ps[i].l > r1.l)
				{
					r1 = ps[i];
				}
				if (ps[i].l < r2.l)
				{
					r2 = ps[i];
				}
			}


		for (i = r1.n;i <= r1.n + r1.l - 1;i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
		System.out.print("\n");
		for (i = r2.n;i <= r2.n + r2.l - 1;i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
	}

}
