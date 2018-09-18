package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int j;
		int m;
		int n;
		int o;
		int a;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * k;
		String c1 = new String(new char[200]);
		String c2 = new String(new char[100]);
		String c3 = new String(new char[100]);
		String p = c1;
		String q = c2;
		String r = c3;
		p = new Scanner(System.in).nextLine();
		q = new Scanner(System.in).nextLine();
		r = new Scanner(System.in).nextLine();
		n = p.length();
		m = q.length();
		a = r.length();
		for (i = p;i <= p.Substring(n) - 1;i++)
		{
			if ((*i == q) && ((i == p) || *(i - 1) == ' '))
			{
				o = 0;
				for (j = 0;j <= m - 1;j++)
				{
					if (*(i + j) != *(q.Substring(j)))
					{
						o = 1;
					}
					if (((i + m - 1) != (p.Substring(n) - 1)) && *(i + m) != ' ')
					{
						o = 1;
					}
				}
				if (o == 0 && a > m)
				{
					for (k = p.Substring(n) - 1;k >= i + m;k--)
					{
						*(k + a - m) = *k;
					}
				}
				if (o == 0 && a < m)
				{
					for (k = i + m;k <= p.Substring(n) - 1;k++)
					{
						*(k + a - m) = *k;
					}
				}
				if (o == 0)
				{
					for (j = 0;j <= a - 1;j++)
					{
						*(i + j) = *(r.Substring(j));
					}
					i = i + a;
					n = n - m + a;
				}
			}
		}
		for (i = p;i <= p.Substring(n) - 1;i++)
		{
			System.out.printf("%c",*i);
		}
		System.out.print("\n");
	}
}
