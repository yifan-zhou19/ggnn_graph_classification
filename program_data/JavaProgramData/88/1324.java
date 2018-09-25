package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int i;
		int j;
		int k;
		int l;
		String p = null;
		String b = new String(new char[50]);
		p = b;
		cin.get(b,50);
		l = b.length();
		for (i = 0;i < l;i++)
		{
			if (*(p.Substring(i)) > '0' && *(p.Substring(i)) <= '9')
			{
				System.out.print((p.Substring(i)));
				a = 1;
			}
			if ((*(p.Substring(i)) < '0' || *(p.Substring(i))>'9') && a == 1)
			{
				System.out.print("\n");
				a = 0;
			}
			if (*(p.Substring(i)) == '0')
			{
				if (a == 1)
				{
						System.out.print((p.Substring(i)));
				}
				else
				{
					if (a == 0 && (*(p.Substring(i) + 1) < '0' || *(p.Substring(i) + 1)>'9'))
					{
						System.out.print((p.Substring(i)));
						a = 1;
					}
				}
			}
		}
	}
}
