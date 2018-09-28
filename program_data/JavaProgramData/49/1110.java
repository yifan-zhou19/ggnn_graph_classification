package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		String c = new String(new char[500]);
		int i;
		int j = 0;
		int l;
		int s = 0;
		int n;
		int p;
		int q;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		l = 2;
		n = a.length();
		while (l <= n)
		{
			for (i = 0;i < n + 1 - l;i++)
			{
				p = i;
				q = i;
				for (s = 0;s <= l - 1;s++)
				{
					b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(p + l - 1));
					p = p - 1;
					c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(q));
					q = q + 1;
					j++;
				}
				for (j = 0;j < l;j++)
				{
						 if (b.charAt(j) == c.charAt(j))
						 {
							 k = k + 1;
						 }
						 else
						 {
							 ;
						 }
				}
				   if (k == l)
				   {
					   for (j = 0;j < l;j++)
					   {
							 System.out.printf("%c",c.charAt(j));
					   }
					   System.out.print("\n");
				   }
				else
				{
					;
				}
				j = 0;
				k = 0;
				s = 0;
			}
			l++;
			i = 0;
		}
		return 0;
	}
}

