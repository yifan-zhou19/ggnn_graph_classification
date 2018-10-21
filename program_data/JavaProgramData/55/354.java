package <missing>;

public class GlobalMembers
{
	public static int sum = 0;
	public static String a = new String(new char[10000]);
	public static int[] c = new int[10000];
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int n;
		int m;
		int y = 0;
		int x;
		int t = 0;
		int hhh = new int(int q, int p);
		String b = new String(new char[10000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			x = Integer.parseInt(tempVar3);
		}
		l = a.length();
		for (i = 0;i < l;i++)
		{
			   if (a.charAt(i) > 96 && a.charAt(i) < 123)
			   {
			   a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 87);
			   }
			if (a.charAt(i) > 64 && a.charAt(i) < 91)
			{
			   a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 55);
			}
			if (a.charAt(i) > 47 && a.charAt(i) < 58)
			{
			   a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 48);
			}
		}
		for (i = l - 1;i >= 0;i--)
		{
			   c[i] = (int)a.charAt(i) * hhh(n, l - 1 - i);
		}
		for (i = 0;i < l;i++)
		{
		   sum = sum + c[i];
		}
		if (sum == 0)
		{
			t = 1;
		}
		while (sum > 0)
		{
				 b = tangible.StringFunctions.changeCharacter(b, y, sum % x);
			  sum = sum / x;
			  y++;
		}
		for (i = 0;i < y;i++)
		{
			   if (b.charAt(i) > 9)
			   {
			  b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 55);
			   }
		   else
		   {
			   b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 48);
		   }
		}
		if (t == 0)
		{
		for (i = y - 1;i >= 0;i--)
		{
		   System.out.printf("%c",b.charAt(i));
		}
		}
		if (t == 1)
		{
			System.out.print("0");
		}

	}
	public static int hhh(int q, int p)
	{
		 int i;
		 int w = 1;
		 for (i = 0;i < p;i++)
		 {
			w = q * w;
		 }
		 return w;
	}

}

