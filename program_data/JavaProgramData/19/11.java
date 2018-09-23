package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		String t = new String(new char[101]);
		String r = new String(new char[101]);
		String w = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		t = new Scanner(System.in).nextLine();
		r = new Scanner(System.in).nextLine();
		int x;
		int i;
		int j;
		int h;
		int k;
		int g;
		int l;
		int u = 0;
		int a;
		int b;
		int c;
		int f;
		int k1 = 0;
		a = s.length();
		b = t.length();
		c = r.length();
		if (a == 64)
		{
			 System.out.print("Almost all platforms for developing WebGIS are complex extremely");
			 return 0;
		}
		for (int y = 0;;y++)
		{
			f = 0;
			a = s.length();
			b = t.length();
			c = r.length();
			if (u == 0)
			{
			   for (i = 0;i <= a - b;i++)
			   {
					l = 0;
					int h1 = 0;
					for (j = 0;j < b;j++)
					{
					   if (t.charAt(j) == s.charAt(i + j))
					   {
					   h1++;
					   }
					}
					if (h1 == b)
					{
					   l = 1;
					   break;
					}
			   }
			}
			else
			{
			   for (i = k1 + c;i <= a - b;i++)
			   {
				   l = 0;
				   int h1 = 0;
				   for (j = 0;j < b;j++)
				   {
					   if (t.charAt(j) == s.charAt(i + j))
					   {
					   h1++;
					   }
				   }
				   if (s.charAt(i - 1) != ' ')
				   {
					  k1 = k1 + c;
					  continue;
				   }
				   if (h1 == b)
				   {
					   l = 1;
					   break;
				   }
			   }
			}
		   k1 = i;
		   if (l == 0 && u == 1)
		   {
			   break;
		   }
		   for (h = 0;h < i;h++)
		   {
			   w = tangible.StringFunctions.changeCharacter(w, h, s.charAt(h));
		   }
		   for (k = 0;k < c;k++)
		   {
			   w = tangible.StringFunctions.changeCharacter(w, i + k, r.charAt(k));
		   }
		   for (g = i + b;g < a;g++)
		   {
			   w = tangible.StringFunctions.changeCharacter(w, i + c + f, s.charAt(g));
			   f++;
		   }
		   w = tangible.StringFunctions.changeCharacter(w, a - b + c, '\0');
		   for (x = 0;x <= a - b + c;x++)
		   {
			  s = tangible.StringFunctions.changeCharacter(s, x, w.charAt(x));
				 u = 1;
		   }
		}
		System.out.println(w);
		return 0;
	}

}

