package <missing>;

public class GlobalMembers
{
	public static void subtract(String a, String b, String c)
	{
		int i;
		int carry = 0;
	 for (i = 100;i >= 0;i--)
	 {
		 if (b[i].Substring(carry) > a[i])
		 {
			c[i] = 10 + a[i] - b[i] - carry + '0';
		 carry = 1;
		 }
	  else
	  {
			c[i] = a[i] - b[i] - carry + '0';
		 carry = 0;
	  }
	 }
	}

	public static void align(String a)
	{
		int len;
		int jump;
		int m;
	 len = a.length();
	 jump = 101 - len;
	for (m = len;m >= 0;m--)
	{
		 a[m + jump] = a[m];
	  a[m] = '0';
	}
	}

	public static void Main()
	{
		int i;
		int x;
		int y;
		int z;
		int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	while (m > 0)
	{
		String e = new String(new char[101]);
		String f = new String(new char[101]);
		String g = new String(new char[101]);
	 for (i = 0;i < 101;i++)
	 {
	 e = tangible.StringFunctions.changeCharacter(e, i, f[i] = g[i] = '0');
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 e = tempVar2.charAt(0);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 f = tempVar3.charAt(0);
	 }
	 x = e.length();
	 y = f.length();
	 align(e);
	 align(f);
	 subtract(e, f, g);
	 z = 100 - x;
	 while (z <= 99 && g.charAt(z) == '0')
	 {
	 z++;
	 }
	 for (i = z;i <= 100;i++)
	 {
	 System.out.printf("%c",g.charAt(i));
	 }
	 System.out.print("\n");
	 m = m - 1;
	 System.in.read();
	}
	}

}

