package <missing>;

public class GlobalMembers
{
	public static void f(String a, int l, char girl, char boy)
	{
		if (!a[0].equals('.'))
		{
			int i;
			int j;
			for (i = 1;i < l;i++)
			{
				if (a[i].equals(girl))
				{
					a[i] = '.';
					for (j = i - 1;j >= 0;j--)
					{
						if (a[j].equals(boy))
						{
							a[j] = '.';
						 System.out.printf("%d ", j);
						 j = -1;
						}
					}
					System.out.printf("%d\n", i);
					f(a, l, girl, boy);
					i = l;
				}
			}
		}
	}

	public static void Main()
	{
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		int l;
		l = a.length();
		f(a, l, a.charAt(l - 1), a.charAt(0));
	}

}
