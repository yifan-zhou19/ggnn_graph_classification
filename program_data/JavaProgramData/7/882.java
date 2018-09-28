package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[260]);
		String sbstr = new String(new char[260]);
		String rplyc = new String(new char[260]);
		String p1;
		String p2;
		String p3;
		int i;
		int j;
		int a;
		int b;
		int m;
		str = new Scanner(System.in).nextLine();
		sbstr = new Scanner(System.in).nextLine();
		rplyc = new Scanner(System.in).nextLine();
		a = str.length();
		b = sbstr.length();

		for (i = 0;i < a - b + 1;i++)
		{
			m = 0;
			p1 = str.Substring(i);
			p2 = sbstr;
			for (j = 0;j < b;j++)
			{
				if (*(p1.Substring(j)) == *(p2.Substring(j)))
				{
					m++;
				}
			}

			if (m == b)
			{
				p1 = str.Substring(i);
				p3 = rplyc;
				for (j = 0;j < b;j++)
				{
					*(p1.Substring(j)) = *(p3.Substring(j));
				}
				break;
			}
		}
		System.out.println(str);
	}



}
