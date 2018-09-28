package <missing>;

public class GlobalMembers
{
	public static void p(String a, int l) //?????0???a=000876??a=876
	{
		int i;
		int j;
		for (;a[0].equals('0');)
		{
		 for (j = 0;j <= l - 1;j++)
		 {
		 a[j] = a[j + 1];
		 }
		}
	}
	public static void h(String a, int l)
	{
		int i;
		int j;
	   String c = new String(new char[260]);
	   c = a;
	   for (i = 0;i <= l - 1;i++)
	   {
	   a[i] = c.charAt(l - 1 - i);
	   }
	}
	public static int max(int x,int y)
	{
		if (x >= y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	public static int k(int x)
	{
		if (x == '\0')
		{
	   return 0;
		}
	  else
	  {
		  return (x - '0');
	  }
	}
	public static int Main()
	{
		String a = new String(new char[260]);
		String b = new String(new char[260]);
		String c = new String(new char[260]);
		int l1;
		int l2;
		int l3;
		int l;
		int t;
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}

		l1 = a.length();
		l2 = b.length();
		p(a, l1);
		p(b, l2);

		l1 = a.length();
		l2 = b.length();
		h(a, l1);
		h(b, l2);
		l = max(l1, l2);

	 for (i = l1;i <= l;i++)
	 {
	  a = tangible.StringFunctions.changeCharacter(a, i, '\0');
	 }
	 for (i = l2;i <= l;i++)
	 {
	  b = tangible.StringFunctions.changeCharacter(b, i, '\0');
	 }

		for (t = 0,i = 0;i <= l;i++)
		{
		m = (k(a.charAt(i)) + k(b.charAt(i))) % 10;
		c = tangible.StringFunctions.changeCharacter(c, i, (m + t) % 10 + '0');
		t = (k(a.charAt(i)) + k(b.charAt(i)) + (m + t) / 10) / 10;
		}

	if (c.charAt(l) == '0' && l != 0)
	{
		c = tangible.StringFunctions.changeCharacter(c, l, '\0');
	}
	else
	{
		c = tangible.StringFunctions.changeCharacter(c, l + 1, '\0');
	}

	l3 = c.length();
	h(c, l3);
	System.out.printf("%s",c);
	System.in.read();
	System.in.read();
	}

}

