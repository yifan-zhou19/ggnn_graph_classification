package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int al;
		int bl;
		int k;
		int q;
		a = new Scanner(System.in).nextLine();
			b = new Scanner(System.in).nextLine();
		al = a.length();
		bl = b.length();
		for (i = 0;i < al;i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				a.charAt(i) -= 32;
			}
		}
		for (j = 0;j < bl;j++)
		{
				if (b.charAt(j) >= 'a' && b.charAt(j) <= 'z')
				{
					b.charAt(j) -= 32;
				}
		}

		if (al < bl)
		{
			k = bl;
		}
		else
		{
			k = al;
		}
				for (q = 0;q < k;q++)
				{
					if (a.charAt(q) < b.charAt(q))
					{
						System.out.print("<");
						break;
					}
					if (a.charAt(q) > b.charAt(q))
					{
						System.out.print(">");
						break;
					}

				}
				if (q == k)
				{
					System.out.print("=");
				}
				return 0;

	}

}
