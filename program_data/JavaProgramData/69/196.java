package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[260]);
		String b = new String(new char[260]);
		String c = new String(new char[260]);
		int la;
		int lb;
		int t;
		int i;
		int x = 0;
		int l;
		int j;
		int flag = 0;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		la = a.length();
		lb = b.length();
		l = (la >= lb)?la:lb;
		for (i = 0;i <= l;i++)
		{
			if (lb - 1 - i < 0)
			{
				b = tangible.StringFunctions.changeCharacter(b, lb - 1 - i, '0');
			}
			if (la - 1 - i < 0)
			{
				a = tangible.StringFunctions.changeCharacter(a, la - 1 - i, '0');
			}
			t = a.charAt(la - 1 - i) + b.charAt(lb - 1 - i) + x - 96;
			if (t <= 9)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, t);
				x = 0;
			}
			else
			{
				t = t - 10;
				c = tangible.StringFunctions.changeCharacter(c, i, t);
				x = 1;
			}
		}
		for (j = l;j > 0;j--)
		{
		if (c.charAt(j) == 0 && flag == 0)
		{
		   continue;
		}
		else
		{
			  flag = 1;
			  System.out.printf("%d",c.charAt(j));
		}
		}
		System.out.printf("%d",c.charAt(0));
	}

}

