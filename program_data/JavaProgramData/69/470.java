package <missing>;

public class GlobalMembers
{
	public static int f(char x)
	{
		int xx = x - '0';
		return xx;
	}
	public static int num1(int x,int y)
	{
		if ((x + y) > 9)
		{
		  return x + y - 10;
		}
		else
		{
			return x + y;
		}
	}
	public static int num10(int x,int y)
	{
		if ((x + y) > 9)
		{
		   return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int max(int x,int y)
	{
		if (x > y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	public static int Main()
	{
		String a = new String(new char[251]);
		String b = new String(new char[251]);
		String c = new String(new char[251]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		int la = a.length();
		int lb = b.length();
		int mx = max(la, lb);
		int i;
		int j;
		int k;
		int p = 0;
		for (i = la - 1,j = lb - 1,k = 0;k < mx;i--,j--,k++)
		{
		   if (i >= 0 && j >= 0)
		   {
			 c = tangible.StringFunctions.changeCharacter(c, k, num1(f(a.charAt(i)), f(b.charAt(j)) + p));
			 p = num10(f(a.charAt(i)), f(b.charAt(j)) + p);
		   }
		   else if (i >= 0 && j < 0)
		   {
			 c = tangible.StringFunctions.changeCharacter(c, k, num1(f(a.charAt(i)), p));
			 p = num10(f(a.charAt(i)), p);
		   }
		   else
		   {
			 c = tangible.StringFunctions.changeCharacter(c, k, num1(f(b.charAt(j)), p));
			 p = num10(f(b.charAt(j)), p);
		   }
		}
		int frag = 0;
		if (p == 0)
		{
		  for (i = mx - 1;i >= 0;i--)
		  {
			 if (c.charAt(i) > 0)
			 {
				 frag = 1;
			 }
			 if (frag == 1)
			 {
			 System.out.printf("%d",c.charAt(i));
			 }
			 else if (i == 0)
			 {
				 System.out.print("0");
			 }
		  }
		}
		else
		{
			 c = tangible.StringFunctions.changeCharacter(c, mx, 1);
			 for (i = mx;i >= 0;i--)
			 {
				 System.out.printf("%d",c.charAt(i));
			 }
		}

		return 0;
	}
}

