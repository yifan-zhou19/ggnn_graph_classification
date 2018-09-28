package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int z;
	 int q;
	 int s;
	 int l;
	 int a;
	 int b;
	 int c;
	 int d;
	 String m = new String(new char[4]);
	 String n = new String(new char[8]);
	 n = tangible.StringFunctions.changeCharacter(n, 0, 'z');
	 n = tangible.StringFunctions.changeCharacter(n, 1, 'q');
	 n = tangible.StringFunctions.changeCharacter(n, 2, 's');
	 n = tangible.StringFunctions.changeCharacter(n, 3, 'l');
	 for (z = 10;z <= 50;z = z + 10)
	 {
	   for (q = 10;q <= 50;q = q + 10)
	   {
		for (s = 10;s <= 50;s = s + 10)
		{
		 for (l = 10;l <= 50;l = l + 10)
		 {
		  if ((z + q) == (s + l) && (z + l) > (s + q) && (z + s) < q)
		  {
		   a = z;
		   b = q;
		   c = s;
		   d = l;
		  }
		 }
		}
	   }
	 }
	if (a > b)
	{
	  m = tangible.StringFunctions.changeCharacter(m, 0, a);
	  n = tangible.StringFunctions.changeCharacter(n, 4, n.charAt(0));
	  m = tangible.StringFunctions.changeCharacter(m, 1, b);
	  n = tangible.StringFunctions.changeCharacter(n, 5, n.charAt(1));
	}
	else
	{
	  m = tangible.StringFunctions.changeCharacter(m, 0, b);
	  n = tangible.StringFunctions.changeCharacter(n, 4, n.charAt(1));
	  m = tangible.StringFunctions.changeCharacter(m, 1, a);
	  n = tangible.StringFunctions.changeCharacter(n, 5, n.charAt(0));
	}
	if (m.charAt(0) < c)
	{
	  n = tangible.StringFunctions.changeCharacter(n, 6, n.charAt(5));
	  n = tangible.StringFunctions.changeCharacter(n, 5, n.charAt(4));
	  n = tangible.StringFunctions.changeCharacter(n, 4, n.charAt(2));
	  m = tangible.StringFunctions.changeCharacter(m, 2, m.charAt(1));
	  m = tangible.StringFunctions.changeCharacter(m, 1, m.charAt(0));
	  m = tangible.StringFunctions.changeCharacter(m, 0, c);
	}
	else
	{
	  if (m.charAt(1) < c)
	  {
	   n = tangible.StringFunctions.changeCharacter(n, 6, n.charAt(5));
	   n = tangible.StringFunctions.changeCharacter(n, 5, n.charAt(2));
	   m = tangible.StringFunctions.changeCharacter(m, 2, m.charAt(1));
	   m = tangible.StringFunctions.changeCharacter(m, 1, c);
	  }
	  else
	  {
	   n = tangible.StringFunctions.changeCharacter(n, 6, n.charAt(2));
	   m = tangible.StringFunctions.changeCharacter(m, 2, c);
	  }
	}
	if (m.charAt(0) < d)
	{
	  n = tangible.StringFunctions.changeCharacter(n, 7, n.charAt(6));
	  n = tangible.StringFunctions.changeCharacter(n, 6, n.charAt(5));
	  n = tangible.StringFunctions.changeCharacter(n, 5, n.charAt(4));
	  n = tangible.StringFunctions.changeCharacter(n, 4, n.charAt(3));
	  m = tangible.StringFunctions.changeCharacter(m, 3, m.charAt(2));
	  m = tangible.StringFunctions.changeCharacter(m, 2, m.charAt(1));
	  m = tangible.StringFunctions.changeCharacter(m, 1, m.charAt(0));
	  m = tangible.StringFunctions.changeCharacter(m, 0, d);
	}
	else
	{
	  if (m.charAt(1) < d)
	  {
	   n = tangible.StringFunctions.changeCharacter(n, 7, n.charAt(6));
	   n = tangible.StringFunctions.changeCharacter(n, 6, n.charAt(5));
	   n = tangible.StringFunctions.changeCharacter(n, 5, n.charAt(3));
	   m = tangible.StringFunctions.changeCharacter(m, 3, m.charAt(2));
	   m = tangible.StringFunctions.changeCharacter(m, 2, m.charAt(1));
	   m = tangible.StringFunctions.changeCharacter(m, 1, d);
	  }
	  else
	  {
	   if (m.charAt(2) < d)
	   {
		 n = tangible.StringFunctions.changeCharacter(n, 7, n.charAt(6));
		 n = tangible.StringFunctions.changeCharacter(n, 6, n.charAt(3));
		 m = tangible.StringFunctions.changeCharacter(m, 3, m.charAt(2));
		 m = tangible.StringFunctions.changeCharacter(m, 2, d);
	   }
		else
		{
		 n = tangible.StringFunctions.changeCharacter(n, 7, n.charAt(3));
		 m = tangible.StringFunctions.changeCharacter(m, 3, d);
		}
	  }
	}
	System.out.printf("%c %d\n%c %d\n%c %d\n%c %d",n.charAt(4),m.charAt(0),n.charAt(5),m.charAt(1),n.charAt(6),m.charAt(2),n.charAt(7),m.charAt(3));
	return 0;
	}

}

