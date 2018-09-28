package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[514]);
		String b = new String(new char[514]);
		String c = new String(new char[514]);
		String d = new String(new char[256]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int t;
		int p;
		int q;
		int x;
		int z;
		int y;
		l = a.length();
		m = b.length();
		for (i = 0;i < l - m + 1;i++)
		{
			if (a.charAt(i) == b.charAt(0))
			{
				k = 0;
				for (j = i,t = 0;j < i + m;j++,t++)
				{
					if (a.charAt(j) != b.charAt(t))
					{
						k = 1;
						break;
					}
				}
				if (k == 0)
				{
					p = i;
					q = i + m;
					break;
				}
			}
		}
		if (k == 0)
		{
			for (i = q,j = 0;i < l;i++,j++)
			{
				d = tangible.StringFunctions.changeCharacter(d, j, a.charAt(i));
			}
			d = d.substring(0, j);
			c += d;
			a = a.substring(0, p);
			a += c;
			System.out.printf("%s\n",a);
		}
		else
		{
			System.out.printf("%s\n",a);
		}
		return 0;
	}

}

